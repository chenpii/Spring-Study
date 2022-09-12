import com.kuang.mapper.UserMapper;
import com.kuang.mapper.UserMapperImpl;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenpi
 * @create 2022-09-08 22:39
 */
public class MyTest {
    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.getUsers());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapperImpl userMapper = context.getBean("userMapper", UserMapperImpl.class);
        System.out.println(userMapper.getUsers());
    }
}
