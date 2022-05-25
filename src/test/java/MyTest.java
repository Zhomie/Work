import com.homie.pojo.Students;
import com.homie.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentServiceImpl = (StudentService) context.getBean("StudentServiceImpl");
        for (Students students : studentServiceImpl.findAllStudent()) {
            System.out.println(students);
        }
    }
}
