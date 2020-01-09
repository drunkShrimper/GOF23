package chainOfResp;

public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() < 3){
            System.out.println(this.name + "通过" + request.getName());
        }else{
            if(this.nextLeader != null){
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
