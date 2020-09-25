package alex.study.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghao
 * @date 2020/9/25 09:42
 */
public class Demeter1 {

    public static void main(String[] args) {
        SchoolManger schoolManger = new SchoolManger();
        schoolManger.printAllEmployee(new CollegeManager());
    }
}

class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager {

    /**
     * 返回学院员工的工号
     */
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> collegeEmployees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId(String.valueOf(i));
            collegeEmployees.add(collegeEmployee);
        }
        return collegeEmployees;
    }

    public void printAllEmployee(){
        List<CollegeEmployee> allEmployee = getAllEmployee();
        for (CollegeEmployee collegeEmployee : allEmployee) {
            System.out.println(collegeEmployee.getId());
        }
    }
}

class SchoolManger {

    /**
     * 返回学校员工工号
     */
    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId(String.valueOf(i));
            employees.add(employee);
        }
        return employees;
    }


    /**
     * 打印所有员工的工号
     */
    public void printAllEmployee(CollegeManager collegeManager) {

        System.out.println("------------学院员工-------------");
        collegeManager.printAllEmployee();

        System.out.println("------------学校员工-------------");
        List<Employee> allEmployee1 = getAllEmployee();
        for (Employee employee : allEmployee1) {
            System.out.println(employee.getId());
        }
    }
}
