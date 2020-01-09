package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {

    Star star = null;

    public StarHandler(Star star) {
        this.star = star;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object obj = null;
        if(method.getName().equals("sing")){
            obj = method.invoke(star,args);
        }
        return obj;
    }
}
