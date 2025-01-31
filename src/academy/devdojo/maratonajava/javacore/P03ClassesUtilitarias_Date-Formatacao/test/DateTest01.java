import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1000000000); // Long 1000000, essa classe trabalha com milisegundos
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }

}
