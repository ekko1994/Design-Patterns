package alex.study.composite;

/**
 * @author zhanghao
 * @date 2020/11/6 14:31
 */
public abstract class Organization {

    private String name;
    private String desc;

    protected abstract void print();

    protected void add(Organization organization){
        throw new UnsupportedOperationException();
    }

    protected void remove(Organization organization){
        throw new UnsupportedOperationException();
    }

    public Organization(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
