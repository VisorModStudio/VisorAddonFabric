package your.mod.example;

import org.vmstudio.visor.api.ModLoader;
import org.vmstudio.visor.api.VisorAPI;
import your.mod.example.client.ExampleAddonClient;
import your.mod.example.server.ExampleAddonServer;
import net.fabricmc.api.ModInitializer;

public class ExampleMod implements ModInitializer {
    @Override
    public void onInitialize() {
        if(ModLoader.get().isDedicatedServer()){
            VisorAPI.registerAddon(
                    new ExampleAddonServer()
            );
        }else{
            VisorAPI.registerAddon(
                    new ExampleAddonClient()
            );
        }
    }
}
