// Project Initium
//
// File:
//   projectinitium:/init/ModInit.java
//
// Copyright:
//   Copyright (c) 2004 Francois <antiphysika@gmail.com>
//
// Authors:
//   Francois aka Anti-Physika
//
// SPDX-License-Identifier: LGPL-2.1
//

package io.github.antiphysika.mods.projectinitium.init;

import static io.github.antiphysika.mods.projectinitium.ProjectInitium.MOD_ID;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModInit
{
  public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
    DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

  public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PROJECT_INITIUM_TAB =
    CREATIVE_MODE_TABS.register(MOD_ID, () -> CreativeModeTab.builder()
      .title(Component.literal("Project Initium"))
      .icon(() -> new ItemStack(Registration.STONE_HAMMER.get()))
      .displayItems((p, output) ->
      {
        Registration.TOOLS.getEntries().forEach(entry ->
        {
          Item item = entry.get();
          output.accept(item);
        });
        Registration.TOOL_PARTS.getEntries().forEach(entry ->
        {
          Item item = entry.get();
          output.accept(item);
        });
      }).build()
    );

  public static void init (FMLCommonSetupEvent event)
  {
  }
}
