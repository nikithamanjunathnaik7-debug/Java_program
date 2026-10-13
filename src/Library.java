public class Library {
    String title,author;
    double price;
    static int count=0;
    Library(String title,String author,double price)
    {
      this.title=title;
      this.author=author;
      this.price=price;
      count++;
    }
    void display()
    {
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
    }
    static void showCount()
    {
        System.out.println("Total books:"+count);
    }
    public static void main(String[]args)
    {
        Library l=new Library("Java","James",300);
        Library l2=new Library("python","Guide",400);
        l.display();
        l2.display();
        Library.showCount();
    }


}
