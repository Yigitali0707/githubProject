import java.io.Serializable;
import java.util.UUID;

public class Student implements Serializable {
    private String name;
    private UUID id=UUID.randomUUID();
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
