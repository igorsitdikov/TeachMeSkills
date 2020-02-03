package class_tasks.lesson17.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class CountryRepository {
    private Statement statement;

    public CountryRepository(Statement statement) {
        this.statement = statement;
    }

    public Collection<Country> getAllCountries() throws SQLException {
        String sql = "SELECT * FROM countries;";
        ResultSet rs = this.statement.executeQuery(sql);
        Collection<Country> countries = new ArrayList<>();
        while (rs.next()){
            countries.add(new Country(rs.getInt("id"), rs.getString("name"), rs.getString("code"), rs.getInt("population")));
        }
        return countries;
    }
    public Optional<Country> getCountryByCode(String code) throws SQLException {
        String sql = "SELECT * FROM countries WHERE code = '" + code + "';";
        ResultSet rs = this.statement.executeQuery(sql);
        if (rs.next()){
            return Optional.of(new Country(rs.getInt("id"), rs.getString("name"), rs.getString("code"), rs.getInt("population")));
        }
        return Optional.empty();
    }
    public Country addCountry(Country country) throws SQLException {
        String sql = "INSERT INTO countries (name, code, population) VALUES (" + country.toString() + ");";
        this.statement.executeUpdate(sql);
        return getCountryByCode(country.getCode()).orElse(new Country(1,"test","te",10));
    }
}
