import java.util.Date;

public class Test {

    public static void main(String[] args) {


        MyProxy myProxy = new MyProxy();

        myProxy.setTarget(new MyStudent() {
        });


        myProxy.setProMethod(new ProMethodInterface() {
            @Override
            public void method01(LogMessage logMessage) {
                LogMessage logMessage1 = new LogMessage();
                logMessage.fun("你好啊", new Date());

            }
        });

        myProxy.setPostMethod(new PostMethodInterface() {
            @Override
            public void method02(LogMessage logMessage) {
                LogMessage logMessage1 = new LogMessage();
                logMessage.fun("再见", new Date());
            }
        });


        Student s =  (Student) myProxy.createProxy();
        s.myNameAge();








    }
}
