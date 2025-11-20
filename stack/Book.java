
import java.io.PrintWriter;

class Book
{
  public int id;
  public String title;
  public String author;

    public Book() {
   
        id=1;
        title="rich dad poor dad";
        author="robert";
    }

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    public void serialize(PrintWriter writer){
        writer.println(id+"|"+title+"|"+author+"|");
    }

    public Book deserialize(String line){
        String[] parts=line.split("\\|");
        Book b1=new Book();
        b1.id=Integer.parseInt(parts[0]);
        b1.title=parts[1];
        b1.author=parts[2];
        return b1;
    }

   
}