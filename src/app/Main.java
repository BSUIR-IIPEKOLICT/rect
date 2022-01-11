package app;

import app.database.DB;
import app.interfaces.IBuildingService;
import app.interfaces.IReviewService;
import app.interfaces.IRoomService;
import app.interfaces.ITypeService;
import app.services.BuildingService;
import app.services.ReviewService;
import app.services.RoomService;
import app.services.TypeService;

public class Main {

    public static void main(String[] args) {
        IReviewService reviewService = new ReviewService(DB.reviews);
        IRoomService roomService = new RoomService(DB.rooms);
        IBuildingService buildingService = new BuildingService(DB.buildings);
        ITypeService typeService = new TypeService(DB.types);

        buildingService.create("chkalova str. 22");
        buildingService.create("vaneeva str. 59");

        typeService.create("vip", 4, new String[]{"tv", "bar"});
        typeService.create("basic", 2, new String[]{"safe"});
        typeService.create("standard", 3, new String[]{"tv", "toys"});

        reviewService.create(1, "admin", "haha");
        reviewService.create(2, "admin", "lol");
        reviewService.create(1, "user", "yes");

        roomService.create(1, 2, true);
        roomService.create(2, 1, false);
        roomService.create(1, 1, true);

        System.out.println("Buildings: " + buildingService.getAll());
        System.out.println("Types: " + typeService.getAll());
        System.out.println("Rooms: " + roomService.getAll());
        System.out.println("Reviews(1): " + reviewService.get(1));

        reviewService.change(2, "sheet");
        reviewService.change(1, "hello");

        System.out.println("Reviews(2): " + reviewService.get(2));
        System.out.println("Reviews(1): " + reviewService.get(1));

        reviewService.delete(2);

        System.out.println("Reviews(2): " + reviewService.get(2));
        System.out.println("Reviews(1): " + reviewService.get(1));
    }
}
