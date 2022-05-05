package tobys;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
            UserDao dao = new DaoFactory().userDao();
    }
}
