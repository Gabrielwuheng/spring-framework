package wh;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class  ApplicationContextTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		SimpleBean bean = context.getBean(SimpleBean.class);
//		bean.send();
		context.close();
	}
}
