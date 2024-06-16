package Student;

public class Student implements Comparable<Student>{
    public int id;
    private static int nextId = 1;

    public String name;

    public Student(String name) {
        this.name = name;
        this.id = generateId();
    }

    private static int generateId () {
        return nextId++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.name.length() - this.name.length();
    }
}
