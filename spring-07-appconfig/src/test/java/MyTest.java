import com.kuang.config.MyConfig;
import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenpi
 * @create 2022-09-06 21:46
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类的方式去做，就只能通过 AnnotationConfig 上下文来获取上下文，通过配置类的class对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        User user = context.getBean("user", User.class);
        User user2 = context.getBean("getUser", User.class);
        System.out.println(user.toString());
        System.out.println(user == user2);
    }
}
