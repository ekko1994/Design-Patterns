package alex.study.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zhanghao
 * @date 2020/11/12 15:44
 */
public class ObjectStructure {

    List<Person> personList = new LinkedList<>();



    public void attach(Person person){
        personList.add(person);
    }

    public void detach(Person person){
        personList.remove(person);
    }

    public void display(Action action){
        for (Person person : personList) {
            person.accept(action);
        }
    }

}
