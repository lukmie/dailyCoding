package com.lukmie.zad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Post {
    private String subject, tags;
    private int amountOfSigns;
    private List<Comment> comments;

    public Post(String subject, String tags, int amountOfSigns, Comment... comments) {
        this.subject = subject;
        this.tags = tags;
        this.amountOfSigns = amountOfSigns;
        this.comments = new ArrayList<>(Arrays.asList(comments));
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getAmountOfSigns() {
        return amountOfSigns;
    }

    public void setAmountOfSigns(int amountOfSigns) {
        this.amountOfSigns = amountOfSigns;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "subject='" + subject + '\'' +
                ", tags='" + tags + '\'' +
                ", amountOfSigns=" + amountOfSigns +
                ", comments=" + comments +
                '}';
    }
}
