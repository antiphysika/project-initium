// Project Initium
//
// File:
//   projectinitium:/ProjectInitium.java
//
// Copyright:
//   Copyright (c) 2004 Francois <antiphysika@gmail.com>
//
// Authors:
//   Francois aka Anti-Physika
//
// SPDX-License-Identifier: LGPL-2.1
//

package io.github.antiphysika.mods.projectinitium;

import io.github.antiphysika.mods.projectinitium.init.ModInit;
import io.github.antiphysika.mods.projectinitium.init.Registration;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(ProjectInitium.MOD_ID)
public class ProjectInitium
{
  public static final String MOD_ID = "project_initium";
  private static final Logger LOGGER = LogUtils.getLogger();

  public ProjectInitium (IEventBus bus, ModContainer container)
  {
    // Register blocks/items
    Registration.init(bus);

    ModInit.CREATIVE_MODE_TABS.register(bus);
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :