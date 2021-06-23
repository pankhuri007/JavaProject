import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeInDifferentFormat {
    public static void main(String[] args){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
        Date d=new Date();
        String formatteddate=sdf.format(d);
        System.out.println(formatteddate);
    }
}
