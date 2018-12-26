import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

/**
 * Created by liuli on 2018/12/26.
 */
public class TestCase {
    @Test
    public void test1()
    {
        String conf = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        System.out.println("123:"+applicationContext);
    }
    @Test
    public void test2()
    {
        String conf = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        Calendar calendar = applicationContext.getBean("calendarObj1", Calendar.class);
        System.out.println("123:"+calendar);
    }


}
