package student.service;

import org.springframework.stereotype.Service;
import student.mapper.StudentMapper;
import student.model.Student;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Long insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public List<Student> selectByPrimaryKey(Long id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }

    @Override
    public long selectCountId() {
        return studentMapper.selectCountId();
    }

    @Override
    public List<Student> selectName(Student student ) {
        return studentMapper.selectName(student);
    }

    @Override
    public List<Student> selectStudent(Student student) {
        return studentMapper.selectStudent(student);
    }
}
