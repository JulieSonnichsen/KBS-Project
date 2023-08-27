import dk.sdu.student.juson19.common.services.IBulletCreator;
import dk.sdu.student.juson19.common.services.IEntityProcessingService;
import dk.sdu.student.juson19.common.services.IGamePluginService;
import dk.sdu.student.juson19.common.services.IPostEntityProcessingService;

module Common {
    exports dk.sdu.student.juson19.common.services;
    exports dk.sdu.student.juson19.common.data;
    exports dk.sdu.student.juson19.common.data.entityparts;
    exports dk.sdu.student.juson19.common.util;

    uses IBulletCreator;
    uses IGamePluginService;
    uses IEntityProcessingService;
    uses IPostEntityProcessingService;
}