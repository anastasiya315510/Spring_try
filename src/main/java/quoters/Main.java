package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("con.xml");
        context.getBeansOfType(Quoters.class).values().forEach(System.out::println);



    }
}
