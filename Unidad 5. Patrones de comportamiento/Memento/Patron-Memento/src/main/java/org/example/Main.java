package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker(editor);

        caretaker.write("Hello");
        caretaker.showText(); // Output: Hello

        caretaker.write(" World");
        caretaker.showText(); // Output: Hello World

        caretaker.undo();
        caretaker.showText(); // Output: Hello

        caretaker.redo();
        caretaker.showText(); // Output: Hello World
    }
}