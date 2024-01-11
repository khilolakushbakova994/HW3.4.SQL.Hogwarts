package hogwarts.HW34.SQL.Hogwarts.service;


import hogwarts.HW34.SQL.Hogwarts.model.Faculty;
import hogwarts.HW34.SQL.Hogwarts.model.Student;
import hogwarts.HW34.SQL.Hogwarts.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

@Service
public class FacultyService {
    @Autowired
    private final FacultyRepository facultyRepository;


    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }


    public Faculty createFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty findFaculty(long id) {
        return facultyRepository.findById(id).get();
    }


    public Faculty changeFacultyInfo(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public void removeFaculty(long id) {
        facultyRepository.deleteById(id);
    }

    public Collection<Faculty> findFacultyByColorOrName( String color, String name) {
        return facultyRepository.findFacultyByColorOrNameContainsIgnoreCase(color, name);
    }
    public Collection<Faculty>findFacultyByName (String name){
        return facultyRepository.findFacultyByNameIgnoreCase(name);

    }
    public Collection<Faculty>findFacultyByColor (String color){
        return facultyRepository.findFacultyByColorIgnoreCase(color);
    }
    public Collection<Faculty>findAllFaculties(){
        return facultyRepository.findAll();
    }

    public List <Student> findAllByFaculty (Student name, Student id){
        return facultyRepository.findAllByFaculty(name, id);
    }

}
