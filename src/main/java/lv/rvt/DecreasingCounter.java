package lv.rvt;
import java.util.*;
public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("Value: " + this.value);
    }

    public void decrement() {
        if (this.value > 0) {
            this.value = value - 1;
        }
    else{
        this.value = value;
    }
    }
    public void reset(){
        this.value = 0;
    }
    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }
    /*
     The method could have been written more succinctly in the following way:

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }
    */
    
}
