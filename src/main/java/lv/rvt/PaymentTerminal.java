package lv.rvt;

public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        double affordableMealPrice = 2.50;
        if (payment >= affordableMealPrice) {
            this.money += affordableMealPrice;
            this.affordableMeals++;
            return payment - affordableMealPrice;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        double heartyMealPrice = 4.30;
        if (payment >= heartyMealPrice) {
            this.money += heartyMealPrice;
            this.heartyMeals++;
            return payment - heartyMealPrice;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        double affordableMealPrice = 2.50;
        if (card.takeMoney(affordableMealPrice)) {
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double heartyMealPrice = 4.30;
        if (card.takeMoney(heartyMealPrice)) {
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + this.money + ", number of sold affordable meals: " + this.affordableMeals 
                + ", number of sold hearty meals: " + this.heartyMeals;
    }
}