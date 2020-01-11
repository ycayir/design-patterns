package com.yc.memento;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("Editor with Memento Pattern")
public class Editor2Test {
    @Test
    @DisplayName("Add content")
    public void testAddContent() {
        Editor2 editor = new Editor2();

        String content = "a";
        editor.setContent(content);

        assertEquals(content, editor.getContent());
    }

    @Test
    @DisplayName("Add content and set state in history")
    public void testAddContentAndSetStateInHistory() {
        Editor2 editor = new Editor2();
        History history = new History();

        String initialContent = editor.getContent();
        assertNull(initialContent);

        String content = "a";
        editor.setContent(content);
        history.push(editor.createState());

        assertEquals(content, editor.getContent());
        assertEquals(content, history.pop().getContent());
    }

    @Test
    @DisplayName("Undo content which was not set to history")
    public void testUndoContent() {
        Editor2 editor = new Editor2();
        History history = new History();

        String initialContent = editor.getContent();
        assertNull(initialContent);

        String content = "a";
        editor.setContent(content);

        assertEquals(content, editor.getContent());
        assertNull(history.pop());
    }

    @Test
    @DisplayName("Undo content which was set to history")
    public void testUndoHistoricalContent() {
        Editor2 editor = new Editor2();
        History history = new History();

        String initialContent = editor.getContent();
        assertNull(initialContent);

        String content = "a";
        editor.setContent(content);
        assertEquals(content, editor.getContent());

        history.push(editor.createState());
        assertEquals(content, history.pop().getContent());
    }
}
