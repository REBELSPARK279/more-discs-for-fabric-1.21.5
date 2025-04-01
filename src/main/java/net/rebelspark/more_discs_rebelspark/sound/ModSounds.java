package net.rebelspark.more_discs_rebelspark.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.rebelspark.more_discs_rebelspark.MoreDiscs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent A_FAMILIAR_ROOM = registerSoundEvent("a_familiar_room");
    public static final RegistryKey<JukeboxSong> A_FAMILIAR_ROOM_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscs.MOD_ID, "a_familiar_room"));






    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(MoreDiscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        MoreDiscs.LOGGER.info("Registering Mod Sounds for " + MoreDiscs.MOD_ID);
    }
}
