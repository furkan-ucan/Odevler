package StudentInformationSystem;

public class Course {
    Teacher courseTeacher;
    String name;   
    String code;
    String prefix;
    int note;
    int verbalNote;
    double average;
    boolean isPass;


    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
        this.average = 0.0;
        this.isPass = false;
    }

    void addTeacher (Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.courseTeacher = teacher;
            System.out.println("Teacher added successfully!");
        } else {
            System.out.println(teacher.name + " cannot teach " + this.name + " because they are not from the same branch!");
        }
    }

    void printTeacher () {
        if (courseTeacher != null) {
            System.out.println(this.name + " course teacher: " + courseTeacher.name);
        } else {
            System.out.println(this.name + " course has no teacher yet!");
        }
    }

    void addNote (int note) {
        if (note >= 0 && note <= 100) {
            if (this.note == 0) {
                this.note = note;
                System.out.println("Note added successfully!");
            } else {
                System.out.println("Note already added!");
            }
        } else {
            System.out.println("Note must be between 0 and 100!");
        }
    }

    void addVerbalNote (int verbalNote) {
        if (verbalNote >= 0 && verbalNote <= 100) {
            if (this.verbalNote == 0) {
                this.verbalNote = verbalNote;
                System.out.println("Verbal note added successfully!");
            } else {
                System.out.println("Verbal note already added!");
            }
        } else {
            System.out.println("Verbal note must be between 0 and 100!");
        }
    }

    void isPass () {
        this.average = (this.note * 0.8 + this.verbalNote * 0.2);
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
    }

    

    
}
