package alex.study.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghao
 * @date 2020/11/6 14:43
 */
public class College extends Organization {

    List<Organization> departments = new ArrayList<>();

    @Override
    protected void add(Organization organization) {
        departments.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        departments.remove(organization);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "	");

        for (Organization department : departments) {
            department.print();
        }
    }
}
