import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student stu = (Student) context.getBean("stu");
        System.out.println(stu.toString());

        /*
        Student{
            name='张三',
            address=Address{address='中国'},
            books=[红楼梦, 西游记, 水浒传, 三国演义],
            hobbys=[听歌, 看电影, 打游戏],
            card={身份证=111122222222223333, 银行卡=888888888},
            games=[塞尔达, 巫师三, 黑神话],
            wife='null',
            info={学号=202209060101, 性别=女, 专业=计算机}
         }
         */

    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans2.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user);
    }

}
