import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public class School implements Comparable<School> {

    private final String name;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(@NotNull School o) {
        return name.compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        School school = (School) o;
        return Objects.equals(getName(), school.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
