package hogwarts.HW34.SQL.Hogwarts.repository;

import hogwarts.HW34.SQL.Hogwarts.model.Faculty;
import hogwarts.HW34.SQL.Hogwarts.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Collection;


public interface StudentRepository extends JpaRepository<Student, Long> {

    Collection<Student> findStudentByAge (Integer age);
    Collection<Student> findByAgeBetweenIgnoreCase(int min, int max);
    Student findFaculty (Faculty faculty);

}
