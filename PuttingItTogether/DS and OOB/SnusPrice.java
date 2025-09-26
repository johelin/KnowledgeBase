abstract class SnusPrice {
    protected int strengthValue;

    public SnusPrice(int strengthValue) {
        this.strengthValue = strengthValue;
    }

    public abstract double discount(double price);
}
