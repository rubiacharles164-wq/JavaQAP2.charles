public class Money{
    private long dollars;
    private long cents;
    
    public Money(Money money){
        this.dollars = money.dollars;
        this.cents = money.cents;
    }


    public Money(long dollars, long cents){
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money(otherObject){
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public add(Money otherObject){
        this.dollars += otherObject.dollars;
        this.cents += otherObject.cents;
    }

    public subtract(Money otherObject){
        this.dollars -= otherObject.dollars;
        this.cents -= otherObject.cents;
    }

    public CompareTo(Money otherObject){
        if(this.dollars > otherObject.dollars){
            return 1;
        } else if(this.dollars < otherObject.dollars){
            return -1;
        } else {
            if(this.cents > otherObject.cents){
                return 1;
            } else if(this.cents < otherObject.cents){
                return -1;
            } else {
                return 0;
            }
        }
    }

    public boolean equals(Money otherObject){
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString(){
        return "$" + this.dollars + "." + this.cents;
    }
}