import com.kuang.demo02.UserService;
import com.kuang.demo02.UserServiceImpl;
import com.kuang.demo02.UserServiceProxy;

import java.lang.reflect.InvocationHandler;

public class UserServiceTest {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserServiceImpl((UserServiceImpl) userService);

        userServiceProxy.add();
        userServiceProxy.delete();
        userServiceProxy.update();
        userServiceProxy.query();

    }
}
