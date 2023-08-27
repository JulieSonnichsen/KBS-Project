package dk.sdu.student.juson19.components;

import dk.sdu.student.juson19.common.data.GameData;
import dk.sdu.student.juson19.common.data.World;
import dk.sdu.student.juson19.common.services.IGamePluginService;
import dk.sdu.student.juson19.common.util.SPILocator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pluginInjector")
public class PluginInjection {

    public void startPlugins(GameData gameData, World world) {
        List<IGamePluginService> plugins = SPILocator.locateAll(IGamePluginService.class);
        plugins.forEach((plugin) -> plugin.start(gameData, world));
    }
}
