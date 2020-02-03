package class_tasks.lesson17;

import class_tasks.lesson17.domain.Country;
import class_tasks.lesson17.domain.CountryRepository;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lesson17", "root", "root");
        System.out.println("Connection to Store DB succesfull!");
        Statement statement = connection.createStatement();
//        ResultSet rs = statement.executeQuery("SELECT * FROM cities");
//        while (rs.next()){
//            System.out.println(rs.getString("name"));
//        }
        CountryRepository countryRepository = new CountryRepository(statement);
        countryRepository.getAllCountries().forEach(el -> System.out.println(el.getName()));

        System.out.println(countryRepository.getCountryByCode("EN").orElse(new Country(1, "test", "te", 10)).getName());
        System.out.println(countryRepository.addCountry(new Country("Albania", "Al", 20000040)).getId());
        statement.close();
        connection.close();
    }
}
