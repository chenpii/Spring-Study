import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.dao.UserDaoSqlserverImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.junit.Test;

/**
 * @author chenpi
 * @create 2022-09-04 20:31
 */
public class MyTest {
    @Test
    public void test() {
        //用户实际调用的是业务层，dao层他们不需要接触
        UserService userService = new UserServiceImpl();

        ((UserServiceImpl) userService).setUserDao(new UserDaoSqlserverImpl());
        userService.getUser();

    }

}
