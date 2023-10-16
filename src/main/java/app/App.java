package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.MessageBean;
import bo.SampleBO;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		SampleBO bo = (SampleBO)ac.getBean("bo.sample");
		SampleBO bo2 = (SampleBO)ac.getBean("bo.sample");		
		
		MessageBean msg = bo.processData();
		MessageBean msg2 = bo2.processData();		
		System.out.println(msg);		
		System.out.println(msg2);
		
		ac.close();
	}

}
