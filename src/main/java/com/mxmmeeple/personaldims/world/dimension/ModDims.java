package com.mxmmeeple.personaldims.world.dimension;


import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import com.mxmmeeple.personaldims.PersonalDims;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDims {

	public static final ResourceLocation PDIM_ID = new ResourceLocation(PersonalDims.MODID, "pdims");
    public static final ResourceKey<Level> PDIM_WORLD = ResourceKey.create(Registry.DIMENSION_REGISTRY, PDIM_ID);
    public static final ResourceKey<DimensionType> PDIM_TYPE = ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, PDIM_WORLD.getRegistryName());
	//private static final ResourceKey<LevelStem> POCKET_DIMENSION = ResourceKey.create(Registry.LEVEL_STEM_REGISTRY, PDIM_ID);
   
    private static final Logger LOGGER = LogUtils.getLogger();
    
    public static void register() {
        // 
        LOGGER.info("Registered dimensions");
    }
}
