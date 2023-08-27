import dk.sdu.student.juson19.common.services.IBulletCreator;
import dk.sdu.student.juson19.common.services.IEntityProcessingService;
import dk.sdu.student.juson19.common.services.IGamePluginService;

module DefaultPlayer {
    requires Common;

    uses IBulletCreator;

    provides IGamePluginService with dk.sdu.student.juson19.defaultplayer.PlayerPlugin;
    provides IEntityProcessingService with dk.sdu.student.juson19.defaultplayer.PlayerControlSystem;
}