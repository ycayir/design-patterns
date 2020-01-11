package com.yc.memento;

public class Main2 {

    public static void main(String[] args) {
        Editor2 editor = new Editor2();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());
        editor.print();
        editor.setContent("b");
        history.push(editor.createState());
        editor.print();
        editor.setContent("c");
        editor.print();
        // let's undo before pushing the state
        editor.restore(history.pop());
        editor.print();
        editor.restore(history.pop());
        editor.print();
        editor.setContent("z");
        history.push(editor.createState());
        editor.print();
    }
}
