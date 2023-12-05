package les_3.practice.classwork;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcConnector {

    public static final String URL = "jdbc:postgresql://localhost:5432/mashinki";
    public static final String USERNAME = "postgres";

    public static final String PASSWORD = "docker";
    public static final String SELECT_AUTO_HOUSE = "select * from auto_house";

    
   /* public static void main(String[] args) {
        JdbcConnector jdbcConnector = new JdbcConnector();
        jdbcConnector.runQuery();
    }
    public void runQuery() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SELECT_AUTO_HOUSE);
            List<Car> cars = new ArrayList<>();

            while (rs.next()){
                long carId = rs.getLong(1);
                String producer = rs.getString(2);
                String vin = rs.getString(3);
                long fuel = rs.getLong(4);
                long wheel = rs.getLong(5);
                Car car = new Car (carId, producer, vin, fuel, wheel);
                cars.add(car);
            }
            cars.forEach(System.out::println);

            Statement update = connection.createStatement();
            int counter = update.executeUpate("DELETE");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } */
}
