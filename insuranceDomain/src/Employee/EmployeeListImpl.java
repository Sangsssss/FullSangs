package Employee;

import java.util.List;

import repository.EmployeeRepository;


public class EmployeeListImpl implements EmployeeList{

    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findSalesmanList() {
        return employeeRepository.findAll();
    }
}
