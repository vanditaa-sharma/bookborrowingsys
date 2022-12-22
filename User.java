import java.time.*;
import java.util.*;
public class User{
  private String name;//in-order to make the code more secure we use private instead of public access modifier
  private LocalDate birthDay;
  private ArrayList<Book> books=new ArrayList<>();

  User (String name, String birthDay){
    this.name=name;
    this.birthDay=LocalDate.parse(birthDay);
  }

  public String getname(){
    return this.name;
    
  }
  public String getbirthDay(){
    return this.birthDay.toString();
    
  }

  public String borrowedBooks(){
    return this.books.toString();
  }
  
  public void borrow(Book book){
    this.books.add(book);
  }
  public int age(){
    int age=Period.between(this.birthDay,LocalDate.now()).getYears();
    return age;
  }
}
