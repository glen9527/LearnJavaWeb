package danxx.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.User;
import spring.aop_anno.AopUser;

/**
 * Spring aop介绍
 * https://blog.csdn.net/qq_15096707/article/details/79602676
 * @author danxx
 *
 */
public class TestAop {
	  @Test
	    public void runUser() {
	        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
	        User user = (User) context.getBean("user");
	        user.add();
	    }
	  @Test
	    public void runAopAnno() {
	        ApplicationContext context = new ClassPathXmlApplicationContext("aopanno.xml");
	        AopUser aopUser = (AopUser) context.getBean("aopUser");
	        aopUser.add();
	    }
}
