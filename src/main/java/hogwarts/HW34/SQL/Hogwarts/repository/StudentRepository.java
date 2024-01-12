package hogwarts.HW34.SQL.Hogwarts.repository;

import hogwarts.HW34.SQL.Hogwarts.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Collection;
import java.util.Optional;


public interface StudentRepository extends JpaRepository<Student, Long> {

    Collection<Student> findStudentByAge (Integer age);
    Collection<Student> findByAgeBetweenIgnoreCase(int min, int max);

}
