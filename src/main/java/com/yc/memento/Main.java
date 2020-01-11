package com.yc.memento;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.setContent("a");
        editor.print();
        editor.setContent("b");
        editor.print();
        editor.undo();
        editor.print();
        editor.undo();
        editor.print();
        editor.undo();
        editor.print();
        editor.setContent("z");
        editor.print();
        editor.undo();
        editor.print();
    }
}
