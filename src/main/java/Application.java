import api.EmployeeDAO;
import api.EmployeeDAOImpl;
import model.Employee;


public class Application {

    public static void main(String[] args) {

        Employee emp1 = new Employee(11, "Pelmen", "Dichayishiy", "male", 26, 4);
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        employeeDAO.getAll().forEach(System.out::println);
        employeeDAO.create(emp1);
        employeeDAO.removeById(employeeDAO.getById(12));
        employeeDAO.changeById(emp1);
        System.out.println(employeeDAO.getById(4));
    }
}
