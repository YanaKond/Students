import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Маша");
        Student student2 = new Student(2, "Петя");
        Teacher teacher = new Teacher(101, "Елена Ивановна");

        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService);

        StudyGroup studyGroup = controller.formStudyGroup(teacher, List.of(student1, student2));

        System.out.println("Учебная группа:");
        System.out.println("Преподаватель: " + studyGroup.getTeacher().getName() + " (id: " + studyGroup.getTeacher().getId() + ")");
        System.out.println("Студенты:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getName() + " (id: " + student.getId() + ")");
        }
    }
}