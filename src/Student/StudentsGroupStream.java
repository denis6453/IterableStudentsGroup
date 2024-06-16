package Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsGroupStream implements Iterable<StudentGroup>{
    protected List<StudentGroup> studentGroups = new ArrayList<>();

    public void addStudentGroup (StudentGroup studentGroup) {
        studentGroups.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupStreamIterator(this);
    }

    @Override
    public String toString() {
        return "StudentsGroupStream{" +
                "studentGroups=" + studentGroups +
                '}' + " \n";
    }
}
