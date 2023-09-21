import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
        UserDao userDao = ctx.getBean(UserDao.class);
        // User user1 = userDao.findById(1);
        // User user2 = userDao.findById(1);
        DataSource dataSource = ctx.getBean(DataSource.class);
    }
}