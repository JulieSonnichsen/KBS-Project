import dk.sdu.student.juson19.common.services.IPostEntityProcessingService;

module Collision {
    requires Common;

    provides IPostEntityProcessingService with dk.sdu.student.juson19.collision.CollisionDetector;
}