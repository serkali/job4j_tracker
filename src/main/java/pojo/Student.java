package pojo;

import java.util.Calendar;
import java.util.Date;

public class Student {
    private String surname;
    private int groupNumber;
    private String receiptDate;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroup() {
        return groupNumber;
    }

    public void setGroup(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }
}