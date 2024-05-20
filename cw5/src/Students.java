import java.util.ArrayList;
import java.util.List;

class Students {
    private static List<Student> studentList = new ArrayList<>();

    public static void addStudent(Student student) {
        studentList.add(student);
    }

    public static void promoteAllStudents() {
        for (Student student : studentList) {
            student.promoteToNextSemester();
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : studentList) {
            System.out.println("Student: " + student.getFullName() + ", Index: " + student.getIndexNumber() +
                    ", Status: " + student.getStatus() + ", Semester: " + student.getCurrentSemester());
        }
    }
}