package pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Ivanov");
        student.setGroup(5);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
        Calendar calendar = new GregorianCalendar(2017, Calendar.APRIL, 3);
        calendar.set(Calendar.DAY_OF_MONTH, 3);
        calendar.set(Calendar.MONTH, 3);
        calendar.set(Calendar.YEAR, 2017);
        String date =  dateFormat.format(calendar.getTime());
        student.setReceiptDate(date);
        System.out.println(student.getSurname() + " " + "enrolled in" + " "
                + student.getGroup() + " "
                + "group" + " " + student.getReceiptDate());

    }
}
