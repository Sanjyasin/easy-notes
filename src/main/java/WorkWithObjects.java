import Model.Note;
import Model.User;
import Model.enums.category;

import java.util.List;

public class WorkWithObjects {
    public static void main(String[] args) {
        // Users
        User agris = new User("Agris", "Ko.", "Agris@ko.lv");
        User vlad = new User("Vladislav", "Sa.", "vlad@sa.ru");
        User laura = new User("Laura", "Na.", "laura@na.com");

        agris.printFullInfo();
        vlad.printFullInfo();
        laura.printFullInfo();

        // Category

        System.out.println(category.PLC.getName());
        System.out.println(category.SHL.getName());
        System.out.println(category.TDL.getName());

        //Notes
        Note firstNote = new Note("Agris", "To do list", "1 magazin, 2 kot");
        Note secondNote = new Note(laura.getFirstName(), category.PLC.getName(), "1 Barselona 2 Magadan");
        Note thirdNote = new Note(laura.getFirstName(), category.SHL.getName(), "1 dress 2 shoes");
        Note fourthNote = new Note(vlad.getFirstName(), category.TDL.getName(), "1 Code 2 Stream");

        firstNote.printFullInfo();
        secondNote.printFullInfo();


    }
}