import com.sunyx.dao.IUserDao;
import com.sunyx.domain.Car;
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
import java.util.*;

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
        applicationContext.getBean("exampleBean",ExampleBean.class);
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
    @Test
    public void test10() {
        String conf= "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        ExampleBean exampleBean = applicationContext.getBean("exampleBean", ExampleBean.class);
        exampleBean.execute();
    }
    @Test
    public void test11() {
        String conf= "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
    @Test
    public void test12() {
        String conf= "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        User user = applicationContext.getBean("user3", User.class);
        System.out.println(user);
    }
    @Test
         public void test13() {
        String conf= "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        User user = applicationContext.getBean("user4", User.class);
        System.out.println(user);
    }

    @Test
    public void test14() {
        String conf= "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        User user = applicationContext.getBean("user5", User.class);
        System.out.println(user);
    }
    @Test
    public void test15() {
        String conf= "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        Car car = applicationContext.getBean("car1", Car.class);
        System.out.println(Arrays.toString(car.getStrs()));
        System.out.println(car.getList());
        System.out.println(car.getSet());
        Map<String,String> map = car.getMap();
        for(String key:map.keySet()){
            String value= map.get(key);
            System.out.println(key+":"+value);
        }
        Properties properties = car.getProp();
        System.out.println(properties);
    }

}
