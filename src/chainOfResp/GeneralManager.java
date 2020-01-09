package chainOfResp;

public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() < 30){
            System.out.println(this.name + "通过" + request.getName());
        }else{
            System.out.println("error");
        }
    }
}
