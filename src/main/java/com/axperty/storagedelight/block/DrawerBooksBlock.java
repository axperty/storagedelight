package com.axperty.storagedelight.block;

import com.axperty.storagedelight.block.entity.DrawerBooksBlockEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;

import javax.annotation.Nullable;

public class DrawerBooksBlock extends BaseEntityBlock
{
    public static final MapCodec<DrawerBooksBlock> CODEC = simpleCodec(DrawerBooksBlock::new);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;

    public MapCodec<DrawerBooksBlock> codec() {
        return CODEC;
    }

    public DrawerBooksBlock(Properties p_49046_) {
        super(p_49046_);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH)).setValue(OPEN, false));
    }

    protected InteractionResult useWithoutItem(BlockState p_49069_, Level p_49070_, BlockPos p_49071_, Player p_49072_, BlockHitResult p_49074_) {
        if (p_49070_.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            BlockEntity $$5 = p_49070_.getBlockEntity(p_49071_);
            if ($$5 instanceof DrawerBooksBlockEntity) {
                p_49072_.openMenu((DrawerBooksBlockEntity)$$5);
                p_49072_.awardStat(Stats.OPEN_BARREL);
                PiglinAi.angerNearbyPiglins(p_49072_, true);
            }

            return InteractionResult.CONSUME;
        }
    }

    protected void onRemove(BlockState p_49076_, Level p_49077_, BlockPos p_49078_, BlockState p_49079_, boolean p_49080_) {
        Containers.dropContentsOnDestroy(p_49076_, p_49079_, p_49077_, p_49078_);
        super.onRemove(p_49076_, p_49077_, p_49078_, p_49079_, p_49080_);
    }

    protected void tick(BlockState p_220758_, ServerLevel p_220759_, BlockPos p_220760_, RandomSource p_220761_) {
        BlockEntity $$4 = p_220759_.getBlockEntity(p_220760_);
        if ($$4 instanceof DrawerBooksBlockEntity) {
            ((DrawerBooksBlockEntity)$$4).recheckOpen();
        }

    }

    @Nullable
    public BlockEntity newBlockEntity(BlockPos p_152102_, BlockState p_152103_) {
        return new DrawerBooksBlockEntity(p_152102_, p_152103_);
    }

    protected RenderShape getRenderShape(BlockState p_49090_) {
        return RenderShape.MODEL;
    }

    protected boolean hasAnalogOutputSignal(BlockState p_49058_) {
        return true;
    }

    protected int getAnalogOutputSignal(BlockState p_49065_, Level p_49066_, BlockPos p_49067_) {
        return AbstractContainerMenu.getRedstoneSignalFromBlockEntity(p_49066_.getBlockEntity(p_49067_));
    }

    protected BlockState rotate(BlockState p_49085_, Rotation p_49086_) {
        return (BlockState)p_49085_.setValue(FACING, p_49086_.rotate((Direction)p_49085_.getValue(FACING)));
    }

    protected BlockState mirror(BlockState p_49082_, Mirror p_49083_) {
        return p_49082_.rotate(p_49083_.getRotation((Direction)p_49082_.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_49088_) {
        p_49088_.add(new Property[]{FACING, OPEN});
    }

    public BlockState getStateForPlacement(BlockPlaceContext p_49048_) {
        return (BlockState)this.defaultBlockState().setValue(FACING, p_49048_.getHorizontalDirection().getOpposite());
    }
}