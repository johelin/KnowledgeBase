public class Books implements Stock.InnerStock{ 
    private int pages; private String author; private String cover; private String title; //constructor. When using getters and setters you should initialize the variables as private bc we dont want the user to access them directly
  //getters & setters - encapsulation 
    
         //getters / we are using return because we are returning a value
        public int getpages(){ 
            return pages; } 
        public String getCover(){ 
            return cover; } 
        public String getAuthor(){ 
            return author; } 
        public String getTitle(){ 
            return title; } //setters / we are using void because we are not returning anything
        public void setPages(int Newpages){
                    pages = Newpages; 
            } // here is an example without constuctor 
        public void setCover(String NewCover){ 
                    cover = NewCover; } 
        public void setAuthor(String NewAuthor){ 
                     author = NewAuthor; } 
        public void setTitle(String NewTitle){ 
                    title = NewTitle; } 
                                        
                                        
                                        
                                        public static void main(String[] args) {
                                        
                                        Books myBook = new Books();
                                        Author myAuthor = new Author();
                                        myBook.setAuthor("J.K. Rowling");
                                        myBook.setTitle("Harry Potter and the Philosopher's Stone");
                                        myBook.setPages(223);
                                        myBook.setCover("Hardcover");
                                        System.out.println("Author: " + myBook.getAuthor());
                                        System.out.println("Title: " + myBook.getTitle());
                                        System.out.println("Pages: " + myBook.getpages());
                                        System.out.println("Cover: " + myBook.getCover());
                                        myAuthor.changeNickname();
                                        myAuthor.changeNickname("Jo");
                                        myAuthor.changeNickname("Johansson");
                                        
                                        //create implementation example
                                           
                                         Books stockCheck = new Books();
                                         stockCheck.checkStock(); //set to true to see the output
                                 Rating rating = new fiveStarRating();
                                 rating.displayRating();
                                 rating.fiveStarRating();
                                            
                                         //set to false to see the other output
                                        }

                                        @Override
                                        public void checkStock() {
                                         System.out.println("Checking stock from main method");
                                        }
                                    }


                      //Thursday - run javac Books.java Title.java , finish up encapsulation, inheritance and polymorphism, abstract classes and interfaces - start with Day 2 - Java Collections Framework
                      // think about small changes and run the code after each change to see how it works and to understand it better
                      //polymorphism - method overloading and overriding
                      // means many forms - same method name but different parameters
                      //works with inheritance - parent class and child class
                        //method overloading - same method name but different parameters within the same class
                        //method overriding - same method name and same parameters but in different classes (parent class and child class)
                        //you can extend a class with another call but when you call that class that is extending another class, it stilll knows how to sing
                        //copy and paste the void main method of the class into the extended class to specify new things
                        // it will prioritize the class you are in unless you specify a parameter in the new class with extended then when you call itit will need the same parameters otherwise it will inherit the parent class output


                        //inheritance - when a class inherits the properties and methods of another class
                        //if multiple classes have the same variables or methods they can be inherited from a parent class
                        // now put extend the subclass with the parent class name

                        //abstract
//  extend classes
// no variables just methods
                        //
