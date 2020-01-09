package simplefactory;

public class CarFactory {

    public static Car creatCar(String type){
        if("Auto".equals(type)){
            return new Auto();
        } else if ("Ben".equals(type)) {
            return new Ben();
        }else{
            return null;
        }
    }
}
