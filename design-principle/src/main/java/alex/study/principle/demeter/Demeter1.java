package alex.study.principle.demeter;

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
        List<CollegeEmployee> collegeEmployees = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId(String.valueOf(i));
            collegeEmployees.add(collegeEmployee);
        }
        return collegeEmployees;
    }
}

class SchoolManger {

    /**
     * 返回学校员工工号
     */
    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<Employee>();
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

        //分析问题
        //1. 这 里 的  CollegeEmployee 不是	SchoolManager 的直接朋友
        //2. CollegeEmployee 是以局部变量方式出现在 SchoolManager
        //3. 违反了迪米特法则
        List<CollegeEmployee> allEmployee = collegeManager.getAllEmployee();
        System.out.println("------------学院员工-------------");
        for (CollegeEmployee employee : allEmployee) {
            System.out.println(employee.getId());
        }

        System.out.println("------------学校员工-------------");
        List<Employee> allEmployee1 = getAllEmployee();
        for (Employee employee : allEmployee1) {
            System.out.println(employee.getId());
        }
    }
}
