package ra.crudstudent.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ra.crudstudent.model.Student;
import ra.crudstudent.repository.IStudentRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private  final IStudentRepository studentRepository;
    @GetMapping
    public List<Student> findAll(){
        return studentRepository.findAll();
    }
    @GetMapping("/{id}")
    public Student findAll(@PathVariable Long id){
        return studentRepository.findById(id).orElse(null);
    }
    @PostMapping
    public Student add(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @PutMapping("/{id}")
    public Student update(@RequestBody Student student,@PathVariable Long id){
        student.setId(id);
        return studentRepository.save(student);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        studentRepository.deleteById(id);
        return "Delete Success";
    }
}
