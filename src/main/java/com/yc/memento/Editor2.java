package com.yc.memento;

/**
 * This object dealing with only editor features
 * History management has been moved to <code>History</code> object
 */
public class Editor2 {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }

    public EditorState createState() {
        return new EditorState(content);
    }

    public EditorState restore(EditorState state) {
        content = state.getContent();
        return state;
    }
}
