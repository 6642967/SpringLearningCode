package first;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpring {
	public static void main(String[] args) {
		//启动spring容器
		ApplicationContext ac=
				new ClassPathXmlApplicationContext(
						"applicationContext.xml");//spring的配置文件
		
		//System.out.println(ac);
		//获得对象
		Student stu=ac.getBean("stu1", 
				Student.class);//反射：学生类的class对象
		System.out.println(stu);
		
		//java.util.Date = new
		Date date = ac.getBean("date1",Date.class);
		System.out.println(date);
		
		//静态工厂方法获取对象
		Calendar cal1= 
				ac.getBean("cal1", 
						Calendar.class);
		System.out.println(cal1);
	}
}
