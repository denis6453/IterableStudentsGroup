package Student;

import java.util.Iterator;

public class StudentGroup  implements Iterable<Student>{
    public StringBuilder students = new StringBuilder();

    public void addStudent( Student student) {
        this.students.append(student).append(' ');
    }


    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }
}
