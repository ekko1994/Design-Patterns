package alex.study.iterator;

import java.util.Iterator;

/**
 * @author zhanghao
 * @date 2020/11/16 13:42
 */
public interface College {

    String getName();

    void addDepartment(String name, String desc);

    Iterator createIterator();
}
