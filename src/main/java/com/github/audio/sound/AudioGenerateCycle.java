package com.github.audio.sound;

import com.github.audio.util.gen.AudioHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import org.jaudiotagger.audio.exceptions.CannotReadException;

import java.io.IOException;

/**
 * @Description: The generation process of AudioSound.
 */
public class AudioGenerateCycle {

    public static void cycle(IEventBus eventBus) {
        try {

            AudioHelper.initBeforeRegistry();
            AudioSound.SOUND_REGISTER.register(eventBus);
            registryAudioSound();

        } catch (IOException | CannotReadException e) {
            e.printStackTrace();
        }
    }

    public static void registryAudioSound() throws IOException {
        AudioRegistryHandler.initVanillaSound();
        AudioRegistryHandler.REGISTER.autoConstructor();
    }

}
