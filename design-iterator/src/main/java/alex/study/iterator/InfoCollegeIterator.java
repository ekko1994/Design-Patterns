package alex.study.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author zhanghao
 * @date 2020/11/16 13:35
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departmentList;
    // 索引
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index > departmentList.size() - 1){
            return false;
        }else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departmentList.get(index);
        return department;
    }

    @Override
    public void remove() {

    }
}
