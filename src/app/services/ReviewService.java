package app.services;

import java.util.ArrayList;

import app.interfaces.IReview;
import app.interfaces.IReviewService;
import app.models.Review;

public class ReviewService implements IReviewService {
    private final ArrayList<IReview> collection;
    
    public ReviewService(ArrayList<IReview> collection) {
        this.collection = collection;
    }
    
    @Override
    public ArrayList<IReview> get(int roomId) {
        ArrayList<IReview> res = new ArrayList<>(this.collection);
        res.removeIf(iReview -> iReview.roomId() != roomId);
        return res;
    }

    @Override
    public IReview create(int roomId, String author, String content) {
        IReview review = new Review(roomId, author, content);
        this.collection.add(review);
        return review;
    }

    @Override
    public IReview change(int id, String content) {
        IReview review = this.collection.get(id - 1);
        review.setContent(content);
        return review;
    }

    @Override
    public int delete(int id) {
        this.collection.remove(id - 1);
        return id;
    }
}
