import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class Event {

    private int id = (int)(Math.random()*100);
    private String msg;
    private Date date;
    private DateFormat dateFormat;

    public Event(Date date , DateFormat dateFormat){
        this.date = date;
        this.dateFormat = dateFormat;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + dateFormat.format(date) +
                '}';
    }
}
