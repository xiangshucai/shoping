

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class MyProxy {

    private Object target; //目标对象
    private ProMethodInterface proMethod; //前置增强
    private PostMethodInterface postMethod;//后置增强
    private LogMessage logMessage;



    public Object createProxy(){
        //三大参数
        ClassLoader loader = this.getClass().getClassLoader();
        Class<?>[] interfaces =target.getClass().getInterfaces();

        InvocationHandler handler = new InvocationHandler(){


            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                if (proMethod != null){

                  /*  Class<? extends LogMessage> log = logMessage.getClass();
                      LogMessage logMessage = log.newInstance();

                    Method fun = log.getMethod("fun", String.class, Date.class);

                    fun.invoke(logMessage,new Msg(),new Date());*/
                    Class<? extends ProMethodInterface> pro = proMethod.getClass();

                    ProMethodInterface proMethodInterface = pro.newInstance();

                    Method method01 = pro.getMethod("method01", logMessage.getClass());
                    method01.invoke(proMethodInterface,logMessage);

                }


                Object result = method.invoke(target, args);


                    if (postMethod != null){

                        Class<? extends PostMethodInterface> post = postMethod.getClass();

                        PostMethodInterface postMethodInterface = post.newInstance();

                        Method method02 =   post.getMethod("method02",logMessage.getClass());

                        method02.invoke(postMethodInterface,logMessage);
                    }


                return result;


            }
        };

                Object proxy = Proxy.newProxyInstance(loader, interfaces, handler);
                return proxy;
    }


    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public ProMethodInterface getProMethod() {
        return proMethod;
    }

    public void setProMethod(ProMethodInterface proMethod) {
        this.proMethod = proMethod;
    }

    public PostMethodInterface getPostMethod() {
        return postMethod;
    }

    public void setPostMethod(PostMethodInterface postMethod) {
        this.postMethod = postMethod;
    }
}
