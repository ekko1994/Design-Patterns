package alex.study.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author zhanghao
 * @date 2020/11/16 14:13
 */
public class OutPutImpl {

    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println(college.getName());
            printDepartment(college);
        }
    }

    private void printDepartment(College college) {
        Iterator iterator = college.createIterator();
        while (iterator.hasNext()){
            Department next = (Department) iterator.next();
            System.out.println(next.getName());
        }
    }
}
