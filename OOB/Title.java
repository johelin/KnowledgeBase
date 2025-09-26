

public class Title extends Books { //inheritance

    public void changeTitle(String newTitle) {
        if(newTitle == null) { //checks if title is null or not, if it is set a new title otherwise display the title
            System.out.print("Title exist: " );
            getTitle();
        } else {
            System.out.println("Title of book has been changed to: ");
            setTitle(newTitle);
            System.out.println(getTitle());

        }
    }


}
//title class has a relationship with books class
//title class contains a variable of type String
//title class extends books class
// has methods to change and display the title of the book