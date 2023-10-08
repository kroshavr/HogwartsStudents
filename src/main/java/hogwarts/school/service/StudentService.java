package hogwarts.school.service;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import hogwarts.school.model.Faculty;
import hogwarts.school.model.Student;
import hogwarts.school.repository.StudentRepository;
import java.util.*;
@Service
@AllArgsConstructor
@NoArgsConstructor
public class StudentService {
    private StudentRepository studentRepository;
    public Student newStudent(Student student) {
        return studentRepository.save(student);
    }
    public Student getStudentById(long id) {
        return studentRepository.findById(id).get();
    }
    public Student updatingStudentData (Student student) {
        return studentRepository.save(student);
    }
    public Student updatingStudentData (long id, Student student) {
        Student student1 = new Student();
        student1.setId(id);
        student1.setName(student.getName());
        student1.setAge(student.getAge());
        return studentRepository.save(student1);
    }
    public void deleteStudentData (long id) {
        studentRepository.deleteById(id);
    }
    public Collection<Student> findByAgeBetween(int min, int max) {
        return studentRepository.findStudentByAgeBetween(min, max);
    }
    public Faculty getFacultyOfStudent(long id) {
        return studentRepository.findById(id).get().getFaculty();
    }
}