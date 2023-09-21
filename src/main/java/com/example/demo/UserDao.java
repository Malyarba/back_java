import javax.sql.DataSource;
import MyApplication;

public class UserDao {

    private DataSource dataSource;

    public UserDao(DataSource dataSource) { 
        this.dataSource = dataSource;
    }

    public User findById(Integer id) {
        try (Connection connection = dataSource.getConnection()) { 
               PreparedStatement selectStatement = connection.prepareStatement("select * from users where id =  ?");
        }
    }

    public User findByFirstName(String firstName) {
        try (Connection connection = dataSource.getConnection()) { 
               PreparedStatement selectStatement = connection.prepareStatement("select * from users where first_name =  ?");
        }
    }
}