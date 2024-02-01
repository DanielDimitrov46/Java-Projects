public class App {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        Course[] courses = new Course[2];
        double[] grades = {2,5,6,7,3};
        Teacher teacher1 = new Teacher("Pencho","21435677543", "Proffesor");
        Course course1 = new Course("Bel",teacher1);
        Course course2 = new Course("Mat",teacher1);
        courses[0] = course1;
        courses[1] = course2;
        Student student1 = new Student("Kameliq", "097865432", 214324,courses,grades);
        Student student2 = new Student("Mihaela", "09786s5346546", 2145533,courses,grades);
        persons[0] = teacher1;
        persons[1] = student1;
        persons[2] = student1;

        for (Person curr:
             persons) {
            System.out.println(curr);
        }

    }
}