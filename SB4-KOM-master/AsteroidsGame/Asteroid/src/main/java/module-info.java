import dk.sdu.student.juson19.common.services.IEntityProcessingService;
import dk.sdu.student.juson19.common.services.IGamePluginService;

module Asteroid {
    requires Common;

    provides IGamePluginService with dk.sdu.student.juson19.asteroid.AsteroidPlugin;
    provides IEntityProcessingService with dk.sdu.student.juson19.asteroid.AsteroidControlSystem;
}