package Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupStreamService  {
    public List<StudentsGroupStream> sort(List<StudentsGroupStream> studentsGroupStreams, StreamComparator streamComparator) {
        List<StudentsGroupStream> sortedStreams = new ArrayList<>(studentsGroupStreams);
        Collections.sort(sortedStreams, streamComparator);
        return sortedStreams;
    }
}
