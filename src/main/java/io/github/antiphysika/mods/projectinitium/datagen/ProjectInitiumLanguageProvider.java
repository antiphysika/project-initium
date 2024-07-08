package io.github.antiphysika.mods.projectinitium.datagen;

import static io.github.antiphysika.mods.projectinitium.ProjectInitium.MOD_ID;
import io.github.antiphysika.mods.projectinitium.init.Registration;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ProjectInitiumLanguageProvider extends LanguageProvider
{
  public ProjectInitiumLanguageProvider(PackOutput output)
  {
    super(output, MOD_ID, "en_us");
  }

  @Override
  protected void addTranslations()
  {
    // Item: Tools
    addItem(Registration.WOODEN_HAMMER, "Wooden Hammer");
    addItem(Registration.STONE_HAMMER, "Stone Hammer");

    // Item: Tool parts
    addItem(Registration.STONE_ROD, "Stone Rod");
  }
}
