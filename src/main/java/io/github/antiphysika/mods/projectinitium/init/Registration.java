// Project Initium
//
// File:
//   projectinitium:/init/Registration.java
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

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Registration
{
  public static final DeferredRegister.Items TOOLS =
    DeferredRegister.createItems(MOD_ID);

  public static final DeferredRegister.Items TOOL_PARTS =
    DeferredRegister.createItems(MOD_ID);

  public static final DeferredItem<Item> WOODEN_HAMMER =
    TOOLS.register("wooden_hammer", () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> STONE_HAMMER =
    TOOLS.register("stone_hammer", () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> STONE_ROD =
    TOOL_PARTS.register("stone_rod", () -> new Item(new Item.Properties()));

  public static void init (IEventBus bus)
  {
    TOOLS.register(bus);
    TOOL_PARTS.register(bus);
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :