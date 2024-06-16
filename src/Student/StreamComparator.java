package Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamComparator implements Comparator<StudentsGroupStream> {

    @Override
    public int compare(StudentsGroupStream o1, StudentsGroupStream o2) {
        return o2.studentGroups.size() - o1.studentGroups.size();
    }
}
