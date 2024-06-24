package org.example;
import java.util.Stack;

// Caretaker class
public class Caretaker {
    private final Stack<TextEditorMemento> undoStack = new Stack<>();
    private final Stack<TextEditorMemento> redoStack = new Stack<>();
    private final TextEditor editor;

    public Caretaker(TextEditor editor) {
        this.editor = editor;
    }

    public void write(String text) {
        undoStack.push(editor.save());
        redoStack.clear();
        editor.write(text);
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(editor.save());
            editor.restore(undoStack.pop());
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(editor.save());
            editor.restore(redoStack.pop());
        }
    }

    public void showText() {
        System.out.println(editor.getText());
    }
}