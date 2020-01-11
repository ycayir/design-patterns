package com.yc.memento;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Editor Test")
public class EditorTest {

    @Test
    @DisplayName("Add content")
    public void testAddContent() {
        Editor editor = new Editor();

        String content = "a";
        editor.setContent(content);

        assertEquals(content, editor.getContent());
    }

    @Test
    @DisplayName("Undo content")
    public void testUndoContent() {
        Editor editor = new Editor();

        String initialContent = editor.getContent();
        String content = "a";
        editor.setContent(content);
        assertEquals(content, editor.getContent());

        editor.undo();
        assertEquals(initialContent, editor.getContent());
    }
}
