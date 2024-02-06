public class Teacher extends Person{
    private Course courseName;

    public Teacher(String name, String egn, Course courseName) {
        super(name, egn);
        this.courseName = courseName;
    }

    public Course getCourseName() {
        return courseName;
    }

    public void setCourseName(Course courseName) {
        this.courseName = courseName;
    }
}
