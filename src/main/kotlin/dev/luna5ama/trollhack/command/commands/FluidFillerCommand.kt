package dev.luna5ama.trollhack.command.commands

import dev.luna5ama.trollhack.command.ClientCommand
import dev.luna5ama.trollhack.module.modules.misc.FluidFiller
import dev.luna5ama.trollhack.util.text.NoSpamMessage

object FluidFillerCommand : ClientCommand("fluidfiller", description = "Manage block used by FluidFiller") {
    init {
        literal("set") {
            block("block") { blockArg ->
                execute("Set the block used by FluidFiller") {
                    val blockName = blockArg.value.registryName.toString()
                    FluidFiller.block0 = blockName
                    NoSpamMessage.sendMessage("Set the fill block to $blockName")
                }
            }
        }
    }
}