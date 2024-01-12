package hogwarts.HW34.SQL.Hogwarts.repository;
import hogwarts.HW34.SQL.Hogwarts.model.Faculty;
import hogwarts.HW34.SQL.Hogwarts.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Collection<Faculty> findFacultyByColorOrNameContainsIgnoreCase  (String color,String name);
    Collection<Faculty>findFacultyByNameIgnoreCase (String name);
    Collection<Faculty>findFacultyByColorIgnoreCase (String color);


}

