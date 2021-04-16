package Model;

import java.util.ArrayList;
import java.util.List;

public class Register {
    private String registerName;
    private List<Note> notes = new ArrayList<>();

    public Register(String registerName){
        this.registerName = registerName;
    }

    public String getRegisterName() {
        return registerName;
    }

    public List<Note> getNotes() {
        return notes;
    }
    public void addNote(Note note) {notes.add(note);}
}
