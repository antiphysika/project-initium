// Project Initium
//
// File:
//   projectinitium:/datagen/DataGenerators.java
//
// Copyright:
//   Copyright (c) 2004 Francois <antiphysika@gmail.com>
//
// Authors:
//   Francois aka Anti-Physika
//
// SPDX-License-Identifier: LGPL-2.1
//

package io.github.antiphysika.mods.projectinitium.datagen;

import static io.github.antiphysika.mods.projectinitium.ProjectInitium.MOD_ID;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators
{
  @SubscribeEvent
  public static void gatherData (GatherDataEvent event)
  {
    DataGenerator generator = event.getGenerator();
    PackOutput output = generator.getPackOutput();
    ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

    // Data: generate lang/
    generator.addProvider(
      true,
      new ProjectInitiumLanguageProvider(output)
    );

    // Data: recipes
    generator.addProvider(
      true,
      new ProjectInitiumRecipes(output, event.getLookupProvider())
    );

    // Assets: item models
    generator.addProvider(
      true,
      new ProjectInitiumItemModels(output, existingFileHelper)
    );

  }
}
