import com.springMybatis.bean.User;
import com.springMybatis.dao.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2019/2/17.
 */

public class TestSpringMybatis {

    public static void main(String[] args) {
        /*spring 和 mybatis */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserMapper userMapper = (UserMapper)context.getBean("userMapper");
        User user = userMapper.selectUser(2);
        System.out.println(user);
    }
}
