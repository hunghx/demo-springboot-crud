package ra.crudstudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.crudstudent.model.Student;
@Repository
public interface IStudentRepository extends JpaRepository<Student,Long> {
}
