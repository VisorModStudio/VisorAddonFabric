package your.mod.example.server;

import org.vmstudio.visor.api.common.addon.VisorAddon;
import your.mod.example.common.VisorExample;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ExampleAddonServer implements VisorAddon {
    @Override
    public void onAddonLoad() {

    }

    @Override
    public @Nullable String getAddonPackagePath() {
        return "your.mod.example.server";
    }

    @Override
    public @NotNull String getAddonId() {
        return VisorExample.MOD_ID;
    }

    @Override
    public @NotNull Text getAddonName() {
        return Text.literal(VisorExample.MOD_NAME);
    }

    @Override
    public String getModId() {
        return VisorExample.MOD_ID;
    }
}
