import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
}
