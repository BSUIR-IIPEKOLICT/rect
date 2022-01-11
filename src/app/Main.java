package app;

import app.database.DB;
import app.interfaces.IReviewService;
import app.services.ReviewService;

public class Main {

    public static void main(String[] args) {
        IReviewService reviewService = new ReviewService(DB.reviews);

        reviewService.create(1, "admin", "haha");
        reviewService.create(2, "admin", "lol");
        reviewService.create(1, "user", "yes");

        System.out.println(reviewService.get(1));
    }
}
