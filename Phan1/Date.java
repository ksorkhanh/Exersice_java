public class Date {
    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 0;
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.day = 0;
        }
        if (year >= 1900 && year <= 9999) {
            this.year = year;
        } else {
            this.year = 0;
        }
    }

    // getter and setter of day
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    // getter and setter of month
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    // getter and setter of year
    public int getYear() {
        return year;
    }
    public void setYear (int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
       this.day = day;
       this.month = month;
       this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public static void main(String[] args) {
        Date d1 = new Date(56, 89, 1790);
        System.out.println(d1);

        d1.setDay(5);
        d1.setMonth(7);
        d1.setYear(2006);
        System.out.println("day:"+d1.getDay());
        System.out.println("month:"+d1.getMonth());
        System.out.println("years: "+d1.getYear());
        d1.setDate(12,6,2015);
        System.out.println(d1);

    }
}
