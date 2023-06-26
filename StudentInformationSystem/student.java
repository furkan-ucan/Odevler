package StudentInformationSystem;

public class student {
    String name;//student name
    int id;//student id
    int classes;//student classes
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;

    public student(String name, int id, int classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.id = id;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote (int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.course1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.course2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.course3.note = note3;
        }
    }

    void addBulkVerbalNote (int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.course1.verbalNote = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.course2.verbalNote = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.course3.verbalNote = note3;
        }
    }

    void isPass () {
        this.average = (this.course1.note * 0.8 + this.course1.verbalNote * 0.2) + (this.course2.note * 0.8 + this.course2.verbalNote * 0.2) + (this.course3.note * 0.8 + this.course3.verbalNote * 0.2);
        if (this.average > 55) {
            System.out.println("Congratulations, you passed!");
            this.isPass = true;
        } else {
            System.out.println("Sorry, you failed!");
            this.isPass = false;
        }
    }

    void printNote () {
        System.out.println("Your average: " + this.average);
        System.out.println("Course 1: " + this.course1.note + " " + this.course1.verbalNote);
        System.out.println("Course 2: " + this.course2.note + " " + this.course2.verbalNote);
        System.out.println("Course 3: " + this.course3.note + " " + this.course3.verbalNote);
    }

    void addCourse (Course course) {
        if (this.classes == 3) {
            System.out.println("You can't take more than 3 courses!");
        } else {
            if (course.name == this.course1.name || course.name == this.course2.name || course.name == this.course3.name) {
                System.out.println("You can't take the same course twice!");
            } else {
                if (this.course1.name == null) {
                    this.course1 = course;
                } else if (this.course2.name == null) {
                    this.course2 = course;
                } else if (this.course3.name == null) {
                    this.course3 = course;
                }
                this.classes++;
            }
        }
    }

    
}
