public class Author extends Books { //inheritance
    String nickname;

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String Newnickname){
        nickname = Newnickname;
    }

    public String changeNickname(){
        if(nickname == null){
            System.out.println("No nickname exist");
            return nickname;
        } else {
            System.out.println("Nickname exist: " + getNickname());
            return nickname;
        }
    }

    public String changeNickname(String newNickname){ //inhertiace with method overloading
        if(nickname == null){
            setNickname(newNickname);
            System.out.println("Nickname has been changed to: " + getNickname());
            return nickname;
        } else {
            System.out.println("Nickname exist: " + getNickname());
            return nickname;
        }
    }

}
