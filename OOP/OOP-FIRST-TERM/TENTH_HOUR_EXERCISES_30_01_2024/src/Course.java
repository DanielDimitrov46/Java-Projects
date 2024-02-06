public class Course {
    private String nameOfCourse;
    private Teacher tutor;

    public Course(String nameOfCourse, Teacher tutor) {
        this.nameOfCourse = nameOfCourse;
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "nameOfCourse='" + nameOfCourse + '\'' +
                ", tutor=" + tutor +
                '}';
    }
}
