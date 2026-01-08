package org.example.simspring;
import org.example.simspring.beans.Engine;
import org.example.simspring.beans.Sim;
import org.example.simspring.config.AppConfig;
import org.example.simspring.model.Car;
import org.example.simspring.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SimSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(SimSpringApplication.class, args);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Sim s=ctx.getBean("jio",Sim.class);
        Sim s2=ctx.getBean("Airtel",Sim.class);
        Engine e1=ctx.getBean("engine", Engine.class);
        s.Calling();
//        s2.setName("iuytrfghjkm");
        System.out.println(s2.getName());
        Sim s3 = s2;
        s3.Calling();
        ApplicationContext ctx2= new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ctx2.getBean(User.class);
        user.setUsersim(s2);
        Car car = ctx2.getBean(Car.class);
        car.setCarenginr(e1);
        System.out.println(user.toString());
        System.out.println(car.toString());
        User user1= new User("jhgf","ayush");
        user1.setUsersim(s);
        user1.setUserengine(e1);
        System.out.println(user1.toString());
    }

}
