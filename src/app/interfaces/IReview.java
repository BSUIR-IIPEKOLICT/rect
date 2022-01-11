package app.interfaces;

public interface IReview {
    int id();
    int roomId();
    void setRoomId(int roomId);
    String author();
    void setAuthor(String author);
    String content();
    void setContent(String content);
}
