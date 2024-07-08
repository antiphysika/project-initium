// Project Initium
//
// File:
//   projectinitium:/datagen/ProjectInitiumRecipes.java
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

import io.github.antiphysika.mods.projectinitium.init.Registration;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ProjectInitiumRecipes extends RecipeProvider
{
  public ProjectInitiumRecipes(PackOutput output,
                               CompletableFuture<HolderLookup.Provider> registries)
  {
    super(output, registries);
  }

  @Override
  protected void buildRecipes(RecipeOutput output)
  {
    // Wooden Hammer
    ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Registration.WOODEN_HAMMER.get())
      .pattern(" B ")
      .pattern(" SB")
      .pattern("S  ")
      .define('B', ItemTags.PLANKS)
      .define('S', Tags.Items.RODS_WOODEN)
      .group("project_initium")
      .unlockedBy("has_planks", has(ItemTags.PLANKS))
      .save(output);

    // Stone Hammer
    ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Registration.STONE_HAMMER.get())
      .pattern(" B ")
      .pattern(" SB")
      .pattern("S  ")
      .define('B', Tags.Items.STONES)
      .define('S', Tags.Items.RODS_WOODEN)
      .group("project_initium")
      .unlockedBy("has_stones", has(Tags.Items.STONES))
      .save(output);

    // Stone Rod
    ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Registration.STONE_ROD.get(), 2)
      .pattern("B  ")
      .pattern("B  ")
      .define('B', Tags.Items.STONES)
      .group("project_initium")
      .unlockedBy("has_stones", has(Tags.Items.STONES))
      .save(output);
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :