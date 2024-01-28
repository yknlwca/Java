package ref;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student(); // x001
        initStident(student1, "학생 1", 15, 90);


        Student student2 = new Student();
        initStident(student2, "학생 2", 16, 80);

        printStudent(student1);
        printStudent(student2);


    }

    static void printStudent(Student student){
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }

    static void initStident(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
}
