package Week16;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PhoneBookController {
    public TextField nameSearchTF;
    public TextField numberResultTF;
    public TextField newNameTF;
    public TextField newNumberTF;
    public PhoneBook phoneBook= new PhoneBook();

    public void findNumber(){
        String number = phoneBook.getNumber(nameSearchTF.getText());
        if (number == null){
            numberResultTF.setText("No such number");
        }
        else{
            numberResultTF.setText(number);
        }
    }

    public void newEntry(){
        phoneBook.addNewEntry(newNameTF.getText(), newNumberTF.getText());
    }
}
