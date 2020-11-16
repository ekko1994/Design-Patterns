package alex.study.iterator;

import java.util.Iterator;

/**
 * @author zhanghao
 * @date 2020/11/13 15:22
 */
public class ComputerCollegeIterator implements Iterator {

    Department[] departments;
    // 遍历的位置
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }



    @Override
    public boolean hasNext() {
        if (position > departments.length || departments[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = this.departments[position];
        position +=1;
        return department;
    }

    @Override
    public void remove() {

    }
}
