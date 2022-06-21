package net.zestyblaze.sorcerycraft.spell;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.zestyblaze.sorcerycraft.api.Spell;

public class CleanseSpell extends Spell {
    public CleanseSpell(ResourceLocation id, int level) {
        super(id, level);
    }

    @Override
    public void execute(Level level, Entity source, Entity attacker, Entity target) {
        if(target instanceof LivingEntity) {
            ((LivingEntity)target).removeAllEffects();
        }
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }
}