import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) throws ParseException {
        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try{
            System.out.println(sdf.parse("Amsterdam 14 de Janeiro de 2020"));
        }catch (ParseException e ){
            e.printStackTrace();
        }
    }
}
