package me.luji.study.post;

import org.springframework.context.ApplicationEvent;

public class PostPublishEvent extends ApplicationEvent {

    private final Post post;

    public PostPublishEvent(Object source, Post post) {
        super(source);
        this.post = post;
    }

    public Post getPost() {
        return post;
    }
}
