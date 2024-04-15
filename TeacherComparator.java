import java.util.Comparator;

public class TeacherComparator<T extends Teacher> implements Comparator<T> {
    @Override
    public int compare(T teacher1, T teacher2) {
        return teacher1.getFullName().compareTo(teacher2.getFullName());
    }
}
