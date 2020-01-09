package observer2;

import java.util.Observable;

public class ConcreteSubject extends Observable {
    private int state;
    public void set(int s){
        state = s;
        setChanged();//Observable类已经定义好的，表示对象已经做了更改
        notifyObservers(state);// 通知观察者
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
