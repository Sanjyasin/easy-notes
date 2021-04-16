
package Model;


import java.util.ArrayList;
import java.util.List;

public class Note {
    private String userName;
    private String categoryName;
    private String text;





    public Note(String userName, String categoryName, String text) {
        this.userName = userName;
        this.categoryName = categoryName;
        this.text = text;
    }

    public Note() {}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public  void printFullInfo() {
        System.out.println("User: " + userName);
        System.out.println("Category: " + categoryName);
        System.out.println("Text " + text);
        System.out.println("-----------------------------");
    }
    public String getFullInfo() { return userName + " " + categoryName + " " + text; }

}
