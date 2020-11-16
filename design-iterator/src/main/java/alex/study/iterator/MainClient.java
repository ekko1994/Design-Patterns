package alex.study.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghao
 * @date 2020/11/13 15:20
 */
public class MainClient {

    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<>();
        collegeList.add(new ComputerCollege());
        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();
    }
}
