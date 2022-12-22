public class Book{
  private String title;
  private String author;
  private int pageCount;

  Book(String title,String author,int pageCount){
    this.title=title;
    this.author=author;
    this.pageCount=pageCount;
  }
  
  public String gettitle(){
    return this.title;
  }

  public String getauthor(){
    return this.author;
  }
  
  public String toString(){
    return String.format("%s by %s",this.title,this.author);
  }

  
  
  
}
