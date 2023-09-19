public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addText("This is the first line.\n");
        editor.addText("This is the second line.\n");

        Memento savedState = editor.saveState();

        editor.addText("This is the third line.\n");
        editor.addText("This is the fourth line.\n");

        System.out.println("Before undo: \n" + editor);

        editor.undo();

        System.out.println("After undo: \n" + editor);
    }
}




