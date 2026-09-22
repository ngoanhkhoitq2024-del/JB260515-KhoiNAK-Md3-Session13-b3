package re.edu.md3ss13.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import re.edu.md3ss13.entity.Employee;

import java.util.List;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {
    @GetMapping
    public List<Employee> getAllEmployees() {
        return List.of(new Employee("E01", "Nguyễn Thanh Một", 120000.0),
                       new Employee("E02", "Cao Văn Hai", 102367.0),
                       new Employee("E03", "Nguyễn Sang Ba", 123456.0));
    }
}
