package malebo.ac.za;
import java.util.*;

public class Back {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //The method checks if the number is even or not
    public boolean Check(int number){
        boolean isEven=false;
        if(number%2==0){
            isEven=true;
        }

        return isEven;
    }

    //This method calculates your age
    public int GetAge(int currentYear, int yearBorn){
        int age=(currentYear-yearBorn);
        return age;
    }

}
