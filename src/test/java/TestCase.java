import com.sunyx.dao.IUserDao;
import com.sunyx.domain.User;
import com.sunyx.service.IUserService;
import com.sunyx.test.ExampleBean;
import com.sunyx.util.MyDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by liuli on 2018/12/26.
 */
public class TestCase {
    @Test
    public void test1() {
        String conf = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        System.out.println("123:" + applicationContext);
    }

    @Test
    public void test2() {
        String conf = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        Calendar calendar = applicationContext.getBean("calendarObj1", Calendar.class);
        System.out.println("123:" + calendar);
    }
    @Test
    public void test3() {
        String conf = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        Calendar calendar = applicationContext.getBean("calendarObj2", Calendar.class);
        System.out.println("123:" + calendar);
    }
    @Test
    public void test4() {
        String conf = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        Date date = applicationContext.getBean("dataObj", Date.class);
        System.out.println("123:" + date);
    }
    @Test
    public void test5() {
        String conf = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        ExampleBean exampleBean1 = applicationContext.getBean("exampleBean", ExampleBean.class);
        ExampleBean exampleBean2 = applicationContext.getBean("exampleBean", ExampleBean.class);
        System.out.println(exampleBean1 == exampleBean2);
        AbstractApplicationContext aac = (AbstractApplicationContext)applicationContext;
        aac.close();
    }
    @Test
    public void test6() {
        String conf = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        AbstractApplicationContext aac = (AbstractApplicationContext)applicationContext;
        aac.close();
    }
    @Test
    public void test7() {
        String conf = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        MyDataSource ds = applicationContext.getBean("dataSource", MyDataSource.class);
        try {
            Connection conn = ds.getConnection();
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test8() {
        String conf = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        IUserDao userDao = applicationContext.getBean("userDaoImpl", IUserDao.class);
        User user = userDao.findByName("hehe");
        System.out.println(user);
    }

    @Test
    public void test9() {
        String conf = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        IUserService userService = applicationContext.getBean("userServiceImpl", IUserService.class);
        System.out.println(userService.login("haha","123"));
    }

}
