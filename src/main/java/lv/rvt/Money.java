package lv.rvt;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents >= 100) {
            euros += cents / 100;
            cents = cents % 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;`
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;

        return new Money(totalEuros, totalCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int totalCentsThis = this.euros * 100 + this.cents;
        int totalCentsDecreaser = decreaser.euros * 100 + decreaser.cents;
        int difference = totalCentsThis - totalCentsDecreaser;

        if (difference < 0) {
            return new Money(0, 0);
        }

        return new Money(difference / 100, difference % 100);
    }

    public String toString() {
        String zero = (cents < 10) ? "0" : "";
        return euros + "." + zero + cents + "e";
    }

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        System.out.println(a); // 10.00e
        System.out.println(b); // 3.50e

        Money c = a.plus(b);
        System.out.println(c); // 13.50e

        System.out.println(a.lessThan(b)); // false
        System.out.println(b.lessThan(c)); // true

        Money d = a.minus(b);
        System.out.println(d); // 6.50e

        Money e = d.minus(a);
        System.out.println(e); // 0.00e
    }
}
