package app.models;

import java.text.MessageFormat;

import app.interfaces.IReview;
import app.shared.Templates;

public class Review implements IReview {

    private final int id;
    private int roomId;
    private String author;
    private String content;

    private static int counter = 0;

    public Review(int roomId, String author, String content) {
        counter++;
        this.id = counter;
        this.roomId = roomId;
        this.author = author;
        this.content = content;
    }

    @Override
    public int id() {
        return this.id;
    }

    @Override
    public int roomId() {
        return this.roomId;
    }

    @Override
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public String author() {
        return this.author;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String content() {
        return this.content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return MessageFormat.format(Templates.review, this.id, this.roomId, this.author, this.content);
    }

    public boolean equals(IReview obj) {
        return
            this.id == obj.id() &&
            this.roomId == obj.roomId() &&
            this.author.equals(obj.author()) &&
            this.content.equals(obj.content());
    }
}
