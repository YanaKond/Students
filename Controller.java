import java.util.List;

class Controller {
    private StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }
}