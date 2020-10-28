package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
    private String age;

    public void setAge(String age) {
        System.out.println(age);
        this.age=age;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean("age");
    }
}
