package EqualsAndHashCode;

public class StudentTest {
    public static void main(String[] args) {
        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");
        System.out.println(std1.equals(std2));
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());
    }
}
