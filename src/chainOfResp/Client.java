package chainOfResp;

public class Client {
    public static void main(String[] args) {
        Leader a = new Director("zhang");
        Leader b = new Manager("li");
        Leader c = new GeneralManager("wang");
        a.setNextLeader(b);
        b.setNextLeader(c);

        LeaveRequest request1 = new LeaveRequest("zhou",35,"9527");

        a.handleRequest(request1);
    }
}
