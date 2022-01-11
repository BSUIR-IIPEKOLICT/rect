package app.interfaces;

import java.util.ArrayList;

public interface IReviewService {
    ArrayList<IReview> get(int roomId);
    IReview create(int roomId, String author, String content);
    IReview change(int id, String content);
    int delete(int id);
}
