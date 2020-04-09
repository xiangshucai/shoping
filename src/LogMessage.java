import java.text.SimpleDateFormat;
import java.util.Date;

public class LogMessage {

    private String msg;
    private Date date;



    //目标方法
    public void fun(String msg,Date date) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(msg + "----" + simpleDateFormat.format(date));

    }

    public LogMessage() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LogMessage(String msg, Date date) {

        this.msg = msg;
        this.date = date;
    }
}
