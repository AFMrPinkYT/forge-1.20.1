package net.afmrpink.EndiumMod.Block.custom.entity;

import net.afmrpink.EndiumMod.Block.ModBlocks;
import net.afmrpink.EndiumMod.EndiumMod;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, EndiumMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<EndiumPurifierBlockEntity>> ENDIUM_PURIFIER_BE =
            BLOCK_ENTITIES.register("endium_purifier_be", () ->
                    BlockEntityType.Builder.of(EndiumPurifierBlockEntity::new,
                            ModBlocks.ENDIUM_PURIFIER.get()).build(null));
    public static final RegistryObject<BlockEntityType<EndiumSuperSmelterBlockEntity>> ENDIUM_SUPER_SMELTER_BE =
            BLOCK_ENTITIES.register("endium_super_smelter_be", () ->
                    BlockEntityType.Builder.of(EndiumSuperSmelterBlockEntity::new,
                            ModBlocks.ENDIUM_SUPER_SMELTER.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
