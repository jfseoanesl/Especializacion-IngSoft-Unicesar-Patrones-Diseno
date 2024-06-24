package org.example;

// Originator class
public class TextEditor {
    private String text = "";

    public void write(String newText) {
        text += newText;
    }

    public TextEditorMemento save() {
        return new TextEditorMemento(text);
    }

    public void restore(TextEditorMemento memento) {
        text = memento.getText();
    }

    public String getText() {
        return text;
    }
}