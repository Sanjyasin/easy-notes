import Model.Note;
import Model.Register;

import Model.enums.category;

import java.util.List;

public class LoopsAndModel {
    private String register;

    public static void main(String[] args) {
        Register allNotes = new Register("All notes");

        System.out.println(allNotes.getRegisterName());

        allNotes.addNote(new Note("Agris", category.TDL.getName(), "1 magazin, 2 kot"));
        allNotes.addNote(new Note("Laura", category.PLC.getName(), "1 Barselona 2 Magadan"));
        allNotes.addNote(new Note("Laura", category.SHL.getName(), "1 dress 2 shoes"));
        allNotes.addNote(new Note("Vlad", category.TDL.getName(), "1 Code 2 Stream"));

        List<Note> notes = allNotes.getNotes();

        for (int i = 0; i < notes.size(); i++) {
            System.out.println(notes.get(i).getFullInfo());
        }
        System.out.println("----------------------------------------");
        for (Note s : notes) {
            //System.out.println(s.getFullName());
            if (s.getUserName().startsWith("L")) {
                //true
                System.out.println(s.getUserName() + " " + s.getCategoryName());
            } else {
                //false
                System.out.println("This name is not starts with 'L'");
            }
        }

    }
}