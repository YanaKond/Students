import java.util.List;

class StudyGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    // Геттеры для преподавателя и списка студентов
    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }
}