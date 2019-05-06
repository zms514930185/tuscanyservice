package student.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import student.model.Student;
import student.service.StudentService;

class StudentMapperTest {
    ApplicationContext zms = new ClassPathXmlApplicationContext("applicationContext.xml");
    StudentService service = zms.getBean(StudentService.class);

    @Test
    void delectStudent (){
        service.deleteByPrimaryKey(15L);
    }
    @Test
    void insert(){
        Student student = new Student();
        student.setId(null);
        student.setStudentId(123123L);
        student.setName("柴生柴生");
        student.setQq(582721701L);
        student.setCareer("产品经");
        student.setData(1555430400000L);
        student.setSchool("信阳师范学院");
        student.setLink("https://www.jnshu.com/school/35937/daily");
        student.setDeclaration("励志成为行业精");
        student.setBrother("程一");
        student.setCreateAt(System.currentTimeMillis());
        student.setUpdateAt(System.currentTimeMillis());
        System.out.println(service.insert(student));
        System.out.println(student.getId());
    }
    @Test
    void selectByPrimaryKey(){
        System.out.println(service.selectByPrimaryKey(16L));
   }
    @Test
    void selectAll(){
        //System.out.println(service.selectAll());
        for(Student user:service.selectAll()){
            System.out.println("\n编号：" + user.getId() + "\n学号：" + user.getStudentId() + "\n姓名：" + user.getName() + "\nQQ：" + user.getQq() + "\n职业：" + user.getCareer() + "\n入学日期：" + user.getData() + "\n毕业院校：" + user.getSchool() + "\n日报链接：" + user.getLink() + "\n立愿：" + user.getDeclaration() + "\n线上师兄：" + user.getBrother() + "\n数据增加时间：" + user.getCreateAt() + "\n数据修改时间：" + user.getUpdateAt() + "\n\n\n");
        }
    }
    @Test
    void updateByPrimaryKey(){
        Student student = new Student();
        student.setId(40L);
        student.setStudentId(123123L);
        student.setName("第一次更改");
        student.setQq(582721701L);
        student.setCareer("产品经");
        student.setData(1555430400000L);
        student.setSchool("信阳师范学院");
        student.setLink("https://www.jnshu.com/school/35937/daily");
        student.setDeclaration("励志成为行业精");
        student.setBrother("程一");
        student.setCreateAt(System.currentTimeMillis());
        student.setUpdateAt(System.currentTimeMillis());
        System.out.println(service.updateByPrimaryKey(student));
    }
    @Test
    void selectCountId(){
        System.out.println(service.selectCountId());
    }
    @Test
    void selectName(){
        Student student= new Student();
        student.setName("柴生");
        System.out.println(service.selectName(student));
    }
    @Test
    void selectStudent() {
        Student student = new Student();
        student.setId(null);
        student.setStudentId(568L);
        student.setName("柴生瑞");
        student.setQq(null);
        student.setCareer(null);
        student.setData(null);
        student.setSchool(null);
        student.setLink(null);
        student.setDeclaration(null);
        student.setBrother(null);
        student.setCreateAt(null);
        student.setUpdateAt(null);
        for (Student user : service.selectStudent(student)) {
            System.out.println("\n编号：" + user.getId() + "\n学号：" + user.getStudentId() + "\n姓名：" + user.getName() + "\nQQ：" + user.getQq() + "\n职业：" + user.getCareer() + "\n入学日期：" + user.getData() + "\n毕业院校：" + user.getSchool() + "\n日报链接：" + user.getLink() + "\n立愿：" + user.getDeclaration() + "\n线上师兄：" + user.getBrother() + "\n数据增加时间：" + user.getCreateAt() + "\n数据修改时间：" + user.getUpdateAt() + "\n");
        }
    }
}