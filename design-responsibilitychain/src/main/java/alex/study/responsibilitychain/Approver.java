package alex.study.responsibilitychain;

/**
 * @author zhanghao
 * @date 2020/11/18 15:51
 */
public abstract class Approver {

    Approver approver;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理审批请求的方法，得到一个请求, 处理是子类完成，因此该方法做成抽象
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}
