package chainOfResp;

public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() < 10){
            System.out.println(this.name + "通过" + request.getName());
        }else{
            if(this.nextLeader != null){
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
