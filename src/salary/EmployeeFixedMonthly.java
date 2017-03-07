package salary;


import java.util.Random;


/**
 * Created by Taras on 05.03.2017.
 */
public class EmployeeFixedMonthly implements Salary{

    private Random random = new Random();
    private int monthNumber = random.nextInt(13 - 1) + 1;

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    @Override
    public int salary() {
        return monthNumber * 1600;
    }
}
