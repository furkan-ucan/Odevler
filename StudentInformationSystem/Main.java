package StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Java", "101", "J101");
        Course course2 = new Course("Python", "102", "P101");
        Course course3 = new Course("C#", "103", "C101");

        Teacher teacher1 = new Teacher("Teacher1", "111", "J101");
        Teacher teacher2 = new Teacher("Teacher2", "222", "P101");
        Teacher teacher3 = new Teacher("Teacher3", "333", "C101");

        course1.addTeacher(teacher1);
        course2.addTeacher(teacher2);
        course3.addTeacher(teacher3);

        student student1 = new student("Student1", 1, 1, course1, course2, course3);
        student1.addBulkExamNote (70, 80, 90);
        student1.addBulkVerbalNote (50, 60, 70);
        student1.isPass();
        student1.printNote();
    }

    
}
