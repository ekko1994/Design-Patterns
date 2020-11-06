package alex.study.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghao
 * @date 2020/11/6 14:40
 */
public class University extends Organization{

    List<Organization> colleges = new ArrayList<>();

    @Override
    public void add(Organization organization) {
        colleges.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        colleges.remove(organization);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void print() {

        System.out.println("--------------" + getName() + "	");

        for (Organization college : colleges) {
            college.print();
        }
    }
}
