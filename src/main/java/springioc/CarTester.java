package springioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class CarTester {
	
	public static void main(String[] args) {
		
		//ClassPathResource resource=new ClassPathResource("springioc/NewFile.xml");//this bcz of core container
	//BeanFactory factory=new XmlBeanFactory(resource);
		//Car car=(Car)factory.getBean("x");
	//	System.out.println(car);
		
		
		//Bike bike=(Bike) factory.getBean("bike");
		//System.out.println(bike);
		
		
		//Now Application context or advanced  context
		
	ApplicationContext context=new ClassPathXmlApplicationContext("springioc/NewFile.xml");
	Car car1=(Car)context.getBean("x");
		System.out.println(car1);
			
Bike bike=(Bike)context.getBean("bike");
System.out.println(bike);

			
			//Bike bike=(Bike) context.getBean("bike");
		//	System.out.println(bike); 
		
		
		
		
	}

}
