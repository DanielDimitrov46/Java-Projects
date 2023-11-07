public class Course {
    private String courseName;
    private int courseMembers;

    public Course(String courseName, int courseMembers) {
        this.setCourseName(courseName);
        this.setCourseMembers(courseMembers);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseMembers() {
        return courseMembers;
    }

    public void setCourseMembers(int courseMembers) {
        this.courseMembers = courseMembers;
    }

//    @Override
//    public String toString() {
//        return "courseName='" + courseName + '\'' + ", courseMembers=" + courseMembers;
//    }
}
