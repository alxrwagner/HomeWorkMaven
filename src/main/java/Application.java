import api.CityDAO;
import api.CityDAOImpl;
import api.EmployeeDAO;
import api.EmployeeDAOImpl;
import model.City;
import model.Employee;


public class Application {

    public static void main(String[] args) {

        City city = new City("Vorcuta-City");
        Employee emp1 = new Employee("Pelmen", "Dichayishiy", "male", 26);
        emp1.setCity(city);
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();

        cityDAO.create(city);
        cityDAO.removeById(cityDAO.getById(11));
        employeeDAO.getAll().forEach(System.out::println);
        cityDAO.getAll().forEach(System.out::println);
        employeeDAO.create(emp1);
        employeeDAO.removeById(employeeDAO.getById(14));
        employeeDAO.changeById(emp1);
        System.out.println(employeeDAO.getById(4));
    }
}