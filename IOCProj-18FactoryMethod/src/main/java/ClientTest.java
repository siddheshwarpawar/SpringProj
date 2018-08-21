import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ClientTest {

	public static void main(String[] args) {
			
		// create IOC continer
		BeanFactory factory = null;
		String s1 = null;
		String s2 = null;
		String s3 = null;
		
		
		factory = new XmlBeanFactory( new ClassPathResource("applicationContext.xml"));
		
		Class c1 = factory.getBean("c1", Class.class);
		System.out.println("\t c1 Data ::"+c1+"\tc1 class name::"+c1.getClass().getName());
		
		Calendar cal = factory.getBean("c2", Calendar.class);
		System.out.println("\tc2 data ::"+cal+"\t c2 class name::"+cal.getClass().getName());
		
		s1 = factory.getBean("s1", String.class);
		System.out.println("\ts1 data ::"+s1+"\t s1 class name::"+s1.getClass().getName());
		
		s2 = factory.getBean("s2", String.class);
		System.out.println("\ts2 data ::"+s2+"\t s2 class name::"+s2.getClass().getName());
		
		s3 = factory.getBean("s3", String.class);
		System.out.println("\t s3 data ::"+s3+"\t s3 class name::"+s3.getClass().getName());
	}

}
