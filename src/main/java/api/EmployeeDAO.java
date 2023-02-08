package api;

import model.Employee;

import java.util.List;

public interface EmployeeDAO {
    void create(Employee employee) ;
    Employee getById(int id);
    List<Employee> getAll();
    void changeById(Employee employee);
    void removeById(Employee employee);
}
