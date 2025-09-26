abstract class Rating{
    public void displayRating(){
        System.out.println("This book is rated."); // display based on rating
    }

    public abstract void fiveStarRating();
}

    class fiveStarRating extends Rating{
        public void displayRating(){
            System.out.println("This book is rated 5 stars.");
        }
    
    
        @Override
        public void fiveStarRating() {
            System.out.println("⭐⭐⭐⭐⭐");
        }
    }
    
    

// I can see how this works if you have a main class and you check if it's rated or not and then you check the average rating etc
