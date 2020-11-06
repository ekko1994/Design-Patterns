package alex.study.composite;

/**
 * @author zhanghao
 * @date 2020/11/6 14:41
 */
public class Department extends Organization {

    @Override
    public void add(Organization organization) {
        super.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        super.remove(organization);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void print() {
        System.out.println("--------------" + getName() + "	");
    }
}
