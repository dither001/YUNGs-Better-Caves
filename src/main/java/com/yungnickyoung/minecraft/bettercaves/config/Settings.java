package com.yungnickyoung.minecraft.bettercaves.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Class containing settings and information for Better Caves.
 * All fields are {@code static}.
 *
 * For the user-facing configuration options, see the Configuration class.
 */
public class Settings {
    /** MOD INFORMATION CONSTANTS
     * These will not be used if USE_META_DATA is true. Instead, data will be used from resources/mcmod.info.
     * Strings like {@varName} are set from the gradle build script.
     */
    public static final boolean USE_META_DATA = true;
    public static final String MOD_ID = "{@modid}";
    public static final String NAME = "{@name}";
    public static final String VERSION = "{@version}";

    public static final String SERVER_PROXY = "com.yungnickyoung.minecraft.bettercaves.proxy.ServerProxy";
    public static final String CLIENT_PROXY = "com.yungnickyoung.minecraft.bettercaves.proxy.ClientProxy";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static final String CUSTOM_CONFIG_PATH = "bettercaves-1_12_2";

    private Settings() {} // private constructor prevents instantiation
}
