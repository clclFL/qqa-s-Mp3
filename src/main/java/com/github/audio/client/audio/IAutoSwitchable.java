package com.github.audio.client.audio;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.TickEvent;

@OnlyIn(Dist.CLIENT)
public interface IAutoSwitchable extends ISwitchable{

    long INTERVAL = 60L;

    void checker(TickEvent.ClientTickEvent event);

}
