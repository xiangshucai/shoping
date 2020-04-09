public class ProMethodInterfaceImpl implements  PostMethodInterface {

    @Override
    public void method02(LogMessage logMessage) {

        System.out.println(logMessage.getMsg() + "-----"+logMessage.getDate());

    }
}
