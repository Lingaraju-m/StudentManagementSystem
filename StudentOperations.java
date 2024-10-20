import java.util.List;

public interface StudentOperations {
    void addStudent();
    void viewStudents();
    Student searchStudentById(int id);
    void updateStudent(int id);
    void removeStudent(int id);
    void saveToFile();
    void loadFromFile();
}
