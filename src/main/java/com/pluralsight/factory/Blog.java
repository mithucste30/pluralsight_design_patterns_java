package com.pluralsight.factory;

public class Blog extends Website {
    public void createPages() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
