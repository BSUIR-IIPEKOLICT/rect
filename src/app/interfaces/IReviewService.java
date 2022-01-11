package app.interfaces;

import java.util.ArrayList;

public interface IReviewService extends IEntity {
    ArrayList<IReview> get(int roomId);
    IReview create(int roomId, String author, String content);
    IReview change(int id, String content);
}
