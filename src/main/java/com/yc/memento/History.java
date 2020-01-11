package com.yc.memento;

import java.util.Stack;

/**
 * This class is dealing with the state management
 */
public class History {
    Stack<EditorState> states;

    public History() {
        this.states = new Stack<>();
    }

    public void push(EditorState item) {
        this.states.push(item);
    }

    public EditorState pop() {
        if (!states.empty()) {
            return this.states.pop();
        }
        return null;
    }
}
