package hogwarts.HW34.SQL.Hogwarts.service;

import hogwarts.HW34.SQL.Hogwarts.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    @InjectMocks
    StudentService studentService;

    @Mock
    StudentRepository studentRepositoryMock;

    @Test
    void createStudent() {
    }

    @Test
    void find() {
    }

    @Test
    void changeStudentInfo() {
    }

    @Test
    void removeStudent() {
    }

    @Test
    void getAllStudents() {
    }

    @Test
    void sortStudentByAge() {
    }

    @Test
    void findByAgeBetween() {
    }
}