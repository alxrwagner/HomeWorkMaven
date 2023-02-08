package api;

import model.City;
import model.Employee;

import java.util.List;

public interface CityDAO {
    void create(City city) ;
    City getById(int id);
    List<City> getAll();
    void changeById(City city);
    void removeById(City city);
}
