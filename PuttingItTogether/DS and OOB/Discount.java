class Discount extends SnusPrice {
    public Discount(int strengthValue) {
        super(strengthValue);
    }

    @Override
    public double discount(double price) {
        if (strengthValue < 3) {
            double discountedPrice = price * 0.5;
            System.out.println("The discounted price is: " + discountedPrice);
            System.out.println("The orgininal price is: " + price);
            return discountedPrice;
            

        } else {
            System.out.println("The discounted price is: " + price);
            return price;
        }
    }
}
