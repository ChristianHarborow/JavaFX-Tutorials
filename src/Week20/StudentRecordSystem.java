package Week20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class StudentRecordSystem extends Application {
    private GridPane gridPane;
    private ArrayList<Student> students;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        gridPane = new GridPane();
        gridPane.setHgap(20);
        gridPane.addRow(0, new Label("Student Number"), new Label("Name"), new Label("Address"), new Label("Course"));
        students = new ArrayList<>();
        constructStudents();
        addStudents();

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void constructStudents(){
        students.add(new Student("0301", "John Smith", "10 Street Road"));
        students.add(new Student("1205", "Joe Bloggs", "13 Place Street"));
    }

    private void addStudents(){
        for (int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            addNewRow(i+1, student);
        }
    }

    private void addNewRow(int row, Student stu){
        gridPane.addRow(row, new Label(stu.getStudentNumber()), new Label(stu.getName()), new Label(stu.getAddress()), new Label(stu.getCourse()));
    }
}
