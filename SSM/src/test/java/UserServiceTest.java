import com.wpf.config.SpringConfig;
import com.wpf.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/19 - 16:32
 * @projectName:尚硅谷javaweb
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void testQuery(){
        System.out.println(userService.query(1));
    }
    @Test
    public void testQueryList(){
        System.out.println(userService.queryUserList().toString());
    }

}
