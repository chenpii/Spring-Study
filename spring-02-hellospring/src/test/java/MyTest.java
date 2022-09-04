import com.kuang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenpi
 * @create 2022-09-04 21:38
 */
public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象！
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中管理了，
        //我们要使用，直接去里面取出来可以了！
        //getBean:参数即为spring配置文件中bean的id

        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }
}
