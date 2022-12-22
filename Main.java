// import java.util.*; //because now main class has no business in knowing what type of entries are bieng made ie we are hiding the complexities of the program--Abstraction
// import java.time.*;

public class Main {
  public static void main(String args[]) {
    // User user = new User("Preeti","1963-05-03");
    // user.name = "Preeti";  because we already created constructor in User class
    // user.birthDay = LocalDate.parse("1963-05-03");

    Book carmilla=new Book("Carmila","Sheridan le Fanu",270);
    // book.title="Carmilla";
    // book.author="Sheridan Le Fanu";

    Audiobook dracula = new Audiobook("Dracula","Bram Stoker",3000);

    Ebook jeeves = new Ebook("Carry on Jeeves","P.G. Wodehouse" ,280,"PDF");
    
    // user.borrow(carmilla);
    
    // System.out.printf("%s was born in %s and she is now %d years old \n",user.getname(),user.getbirthDay(),user.age());

    // System.out.printf("%s has borrowed these books : %s \n",user.getname(),user.borrowedBooks());

    System.out.println(dracula.toString());//no need to make tostring() func. again as Audiobook already INHERITS book class
    System.out.println(jeeves.toString());
  }
}
