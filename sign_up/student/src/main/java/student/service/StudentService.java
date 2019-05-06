package student.service;

import student.model.Student;

import java.util.List;

public interface StudentService {
    int deleteByPrimaryKey(Long id);

    Long insert(Student student);

    List<Student> selectByPrimaryKey(Long id);

    List<Student> selectAll();

    int updateByPrimaryKey(Student record);

    long selectCountId();

    List<Student> selectName(Student student);

    List<Student> selectStudent(Student student);
}
