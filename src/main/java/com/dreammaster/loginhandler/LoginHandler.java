package com.dreammaster.loginhandler;

import static com.dreammaster.config.CoreModConfig.ModPackVersion;
import static net.minecraft.util.EnumChatFormatting.*;

import java.util.Arrays;

import net.minecraft.util.ChatComponentText;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class LoginHandler {

    private static final String[] LOGIN_TEXT = {
            GOLD.toString() + STRIKETHROUGH + "-----------------------------------------------------",
            Green + "Welcome to Gregtech: New Horizons & Reika",
            GOLD.toString() + STRIKETHROUGH + "-----------------------------------------------------" };

    @SuppressWarnings("unused")
    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        Arrays.stream(LOGIN_TEXT).map(ChatComponentText::new).forEach(event.player::addChatMessage);
    }
}
