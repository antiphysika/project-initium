package io.github.antiphysika.mods.projectinitium.datagen;

import static io.github.antiphysika.mods.projectinitium.ProjectInitium.MOD_ID;

import io.github.antiphysika.mods.projectinitium.init.Registration;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ProjectInitiumItemModels extends ItemModelProvider
{
  public ProjectInitiumItemModels (PackOutput output,
                                  ExistingFileHelper existingFileHelper)
  {
    super(output, MOD_ID, existingFileHelper);
  }

  @Override
  protected void registerModels ()
  {
    // Tools
    item(Registration.WOODEN_HAMMER.get());
    item(Registration.STONE_HAMMER.get());

    // Tool parts
    item(Registration.STONE_ROD.get());
  }

  private void item (Item item)
  {
    String name = getItemName(item);
    getBuilder(name)
      .parent(getExistingFile(mcLoc("item/generated")))
      .texture("layer0", "item/" + name);
  }

  private String getItemName (Item item)
  {
    return BuiltInRegistries.ITEM.getKey(item).getPath();
  }
}
