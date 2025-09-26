public class Stock {
    boolean inStock;

     interface InnerStock { //interface method to check if book is in stock
        void checkStock();
        
    }
    public class CheckStock implements InnerStock {
        public void checkStock() {
            if (inStock) {
                System.out.println("The item is in stock.");
            } else {
                System.out.println("The item is out of stock.");
            }
        }
    }
}
