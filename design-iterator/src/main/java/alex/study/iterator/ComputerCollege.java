package alex.study.iterator;

import java.util.Iterator;

/**
 * @author zhanghao
 * @date 2020/11/16 13:45
 */
public class ComputerCollege implements College{

    Department[] departments;
    int num = 0;

    @Override
    public String getName() {
        return "计算机学院";
    }

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java","Java开发");
        addDepartment("PHP","PHP开发");
        addDepartment("Python","Python开发");

    }

    @Override
    public void addDepartment(String name, String desc) {
        departments[num] = new Department(name,desc);
        num += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
