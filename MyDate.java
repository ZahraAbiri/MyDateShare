import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isValidDate(int year, int month, int day) {
        if ((year >= 1 && year <= 9999) && (month >= 1 && month <= 12)) {
            if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) ||
                    (month == 12)) && (day >= 1) && (day <= 31)) {
                return true;
            } else if (((month == 4) || (month == 6) || (month == 9) || (month == 11)) &&
                    ((day >= 1) && (day <= 30))) {
                return true;
            } else if ((month == 2) &&
                    ((day >= 1) && (day <= 28))) {
                return true;
            } else
                return false;
        }
        return false;
    }


    /* public int getMonthLastDay(int month) {

        Calendar cal = Calendar.getInstance();
        month=month+1;
        cal.set(month, 1);
        int dayInt = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);

        return dayInt;
    } */
    public int getMonthLastDay(int month) {
        int lastDayOfMonth;
        if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)) {
            lastDayOfMonth = 31;
        } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            lastDayOfMonth = 30;

        } else {
            lastDayOfMonth = 28;
        }
        return lastDayOfMonth;

    }
     public String nextDate()
    {
        String name="";
        switch(mon)
        {
            case 1:name="Farvardin";
                if(day>=1||day<=30){
                    day+=1;
                }
                break;
            case 2:name="Ordibehesht";
                if(day>=1||day<=30){
                    day+=1;
                }
                break;
            case 3:name="Khordad";
                if(day>=1||day<=30){
                    day+=1;
                }
                break;
            case 4:name="Tir";
                if(day>=1||day<=30){
                    day+=1;
                }
                break;
            case 5:name="Mordad";
                if(day>=1||day<=30){
                    day+=1;
                }
                break;
            case 6:name="Shahrivar";
                if(day>=1||day<=30){
                    day+=1;
                }
                break;
            case 7:name="Mehr";
                if(day>=1||day<=29){
                    day+=1;
                }
                break;
            case 8:name="Aban";
                if(day>=1||day<=29){
                    day+=1;
                }
                break;
            case 9:name="Azar";
                if(day>=1||day<=29){
                    day+=1;
                }
                break;
            case 10:name="Dey";
                if(day>=1||day<=29){
                    day+=1;
                }
                break;
            case 11:name="Bahman";
                if(day>=1||day<=29){
                    day+=1;
                }
                break;
            case 12:name="Esfand";
                if(day>=1||day<=28){
                    day+=1;
                }
                break;

        }
        name=(" nex day is : "+day+"-"+ name +"-" + year );

    public String toString()
    {
        String name="";

        switch(month)
        {
            case 1:name="Farvardin"; break;
            case 2:name="Ordibehesht"; break;
            case 3:name="Khordad"; break;
            case 4:name="Tir"; break;
            case 5:name="Mordad"; break;
            case 6:name="Shahrivar"; break;
            case 7:name="Mehr"; break;
            case 8:name="Aban"; break;
            case 9:name="Azar"; break;
            case 10:name="Dey"; break;
            case 11:name="Bahman"; break;
            case 12:name="Esfand"; break;

        }
        name=(day+"-"+ name +"-" + year );
        return name;
    }
}
