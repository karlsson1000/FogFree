package dev.stellarmc.mixin;

import net.minecraft.client.renderer.chunk.SectionRenderDispatcher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SectionRenderDispatcher.RenderSection.class)
public class MixinRenderSection {

    @Inject(method = "getVisibility", at = @At("HEAD"), cancellable = true)
    private void noFade(long now, CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(1.0F);
    }
}