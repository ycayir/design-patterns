package com.yc.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * This object has two responsibilities:
 *  1) Editor features
 *  2) Managing the state history
 *
 *  This breaks the Single Responsibility Principle (SRP)
 */
public class Editor {
    private String content;
    private List<String> previousContents;

    public Editor() {
        this.content = "";
        this.previousContents = new ArrayList<>();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        previousContents.add(this.content);
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }

    public void undo() {
        if (previousContents.size() == 0) {
            System.out.println("Nothing to undo");
            return;
        }
        int indexOfLastElement = previousContents.size()-1;
        this.content = this.previousContents.get(indexOfLastElement);
        this.previousContents.remove(indexOfLastElement);
    }
}
