package Student;

import java.util.Iterator;

public class StudentGroupStreamIterator implements Iterator<StudentGroup> {
    protected StudentsGroupStream studentsGroupStream;
    private int index = 0;

    public StudentGroupStreamIterator(StudentsGroupStream studentsGroupStream) {
        this.studentsGroupStream = studentsGroupStream;
    }



    @Override
    public boolean hasNext() {
        return index < this.studentsGroupStream.studentGroups.size();
    }

    @Override
    public StudentGroup next() {
        return this.studentsGroupStream.studentGroups.get(index++);
    }
}
