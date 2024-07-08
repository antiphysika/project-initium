// Project Initium
//
// File:
//   projectinitium:/common/utils/ResUtil.java
//
// Copyright:
//   Copyright (c) 2004 Francois <antiphysika@gmail.com>
//
// Authors:
//   Francois aka Anti-Physika
//
// SPDX-License-Identifier: LGPL-2.1
//

package io.github.antiphysika.mods.projectinitium.common.utils;

import static io.github.antiphysika.mods.projectinitium.ProjectInitium.MOD_ID;

import net.minecraft.resources.ResourceLocation;

public class ResUtil
{
  private static ResourceLocation nsLoc (String namespace, String path)
  {
    return ResourceLocation.fromNamespaceAndPath(namespace, path);
  }

  public static ResourceLocation mcLoc (String path)
  {
    return nsLoc("minecraft", path);
  }

  public static ResourceLocation modLoc (String path)
  {
    return nsLoc(MOD_ID, path);
  }
}
