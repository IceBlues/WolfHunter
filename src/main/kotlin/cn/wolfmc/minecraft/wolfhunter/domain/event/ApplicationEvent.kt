package cn.wolfmc.minecraft.wolfhunter.domain.event

import cn.wolfmc.minecraft.wolfhunter.domain.model.talent.Talent
import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

sealed class ApplicationEvent : Event() {
    data class TalentActivated(val player: Player, val talent: Talent) : ApplicationEvent() {
        companion object {
            private val HANDLERS = HandlerList()

            @JvmStatic fun getHandlerList() = HANDLERS
        }

        override fun getHandlers() = HANDLERS
    }
}
