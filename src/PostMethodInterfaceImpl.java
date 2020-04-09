import com.sun.org.apache.xerces.internal.xs.PSVIProvider;

public class PostMethodInterfaceImpl implements PostMethodInterface {

    @Override
    public void method02(LogMessage logMessage) {

        System.out.println(logMessage.getMsg() + "-----"+logMessage.getDate());

    }
}
