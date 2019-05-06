package student;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import student.model.Student;
import student.service.StudentService;


public class StudentMain {
    private static final Logger logger = LogManager.getLogger(StudentMain.class.getName());

    public static void main(String[] args) {
        ApplicationContext zms = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService service = zms.getBean(StudentService.class);


        logger.info("开始查询学员总数");
        try {
            long t = System.currentTimeMillis();
            System.out.println("学员记录总数为：" + service.selectCountId() + "条");
            long t1 = System.currentTimeMillis() - t;
            logger.info("完成查询，共耗时" + t1 + "毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }

        logger.info("开始进行增加记录操作");
        try {
            long t = System.currentTimeMillis();
            Student student = new Student();
            student.setId(null);
            student.setStudentId(123123L);
            student.setName("柴生生");
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
            long tt = System.currentTimeMillis() - t;
            logger.info("完成增加记录操作，增加后学员编号："+student.getId()+" 记录总数："+service.selectCountId()+"共耗时" + tt + "毫秒");
        } catch (Exception e) {
            logger.error("增加记录操作错误");
        }


        //按照ID修改记录
        logger.info("开始更改学员记录");
        try {
            long t = System.currentTimeMillis();
            Student student = new Student();
            student.setId(9L);
            student.setStudentId(123123L);
            student.setName("生柴生");
            student.setQq(582721701L);
            student.setCareer("产品经理");
            student.setData(1555430400000L);
            student.setSchool("信阳师范学院");
            student.setLink("https://www.jnshu.com/school/35937/daily");
            student.setDeclaration("励志成为行业精");
            student.setBrother("程一");
            student.setUpdateAt(System.currentTimeMillis());
            System.out.println(service.updateByPrimaryKey(student));
            long t1 = System.currentTimeMillis() - t;
            logger.info("更改操作结束，共耗时" + t1 + "毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }

        logger.info("开始更改学员记录");
        try {
            long t = System.currentTimeMillis();
            for(Student student:service.selectByPrimaryKey(9L)){
                System.out.println(student.toString());
            }
            long t1 = System.currentTimeMillis() - t;
            logger.info("更改操作结束，共耗时" + t1 + "毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*logger.info("删除学员记录");
        try {
            long t = System.currentTimeMillis();
            service.deleteByPrimaryKey(1L);
            long t1 = System.currentTimeMillis() - t;
            logger.info("完成删除操作，删除学员后记录总数"+service.selectCountId()+"共耗时" + t1 + "毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
