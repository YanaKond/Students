import java.util.List;

class Controller {
    private StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        // Получаем список студентов и преподавателя и передаем их в сервис для формирования учебной группы
        return studyGroupService.createStudyGroup(teacher, students);
    }
}