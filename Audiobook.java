public class Audiobook extends Book{
  private int runTime;
  
  Audiobook(String title,String author,int runTime){
    super(title, author, 0);
    this.runTime=runTime;
  }
}
  
