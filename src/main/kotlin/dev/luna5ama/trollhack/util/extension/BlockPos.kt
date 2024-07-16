package dev.luna5ama.trollhack.util.extension

import dev.luna5ama.trollhack.event.SafeClientEvent
import net.minecraft.block.Block
import net.minecraft.block.state.IBlockState
import net.minecraft.util.math.BlockPos

context(SafeClientEvent)
val BlockPos.state: IBlockState
    get() = world.getBlockState(this)

context(SafeClientEvent)
val BlockPos.block: Block
    get() = state.block