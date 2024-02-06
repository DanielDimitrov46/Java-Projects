import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Course course1 = new Course("mathemathics", 30);
        Course course2 = new Course("OOP", 70);
        Course course3 = new Course("Bel", 20);
        Course course4 = new Course("DB", 50);
        Course course5 = new Course("English", 25);
        Teacher t1 = new Teacher("Ivan", "0435678992", course1);
        Teacher t2 = new Teacher("Pesho", "0435678992", course2);
        Teacher t3 = new Teacher("Gosho", "0435678992", course3);
        Teacher t4 = new Teacher("Dragan", "0435678992", course4);
        Teacher t5 = new Teacher("Petkan", "0435678992", course5);
        ArrayList<Teacher> teachersCourses = new ArrayList<>();
        teachersCourses.add(t1);
        teachersCourses.add(t2);
        teachersCourses.add(t3);
        teachersCourses.add(t4);
        teachersCourses.add(t5);

        for (Teacher currTeacher : teachersCourses) {
            System.out.printf(currTeacher.getName()+" => "+currTeacher.getCourseName().getCourseName()+"\n");
        }
    }
}
