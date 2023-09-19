import java.util.ArrayList;
import java.util.List;

class TextEditor {
    private StringBuilder text;
    private List<Memento> savedStates;

    public TextEditor() {
        text = new StringBuilder();
        savedStates = new ArrayList<>();
    }

    public void addText(String newText) {
        text.append(newText);
    }

    public void undo() {
        if (savedStates.size() > 0) {
            Memento savedState = savedStates.remove(savedStates.size() - 1);
            text = savedState.getState();
        }
    }

    public Memento saveState() {
        Memento savedState = new Memento(text);
        savedStates.add(savedState);
        return savedState;
    }

    @Override
    public String toString() {
        return text.toString();
    }
}