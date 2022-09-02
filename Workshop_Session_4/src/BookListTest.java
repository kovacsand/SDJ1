public class BookListTest
{
  public static void main(String[] args)
  {
    BookList bookList = new BookList(5);

    bookList.addBook(new Book("Harry Potter", 1997));
    bookList.addBook(new Book("The Versions of Us", 2015));
    bookList.addBook(new Book("The Lord of the Rings", 1954));
    bookList.addBook(new Book("The Catcher in the Rye", 1951));

    System.out.println(bookList);

    Book wantedBook = new Book("The Catcher in The Rye", 1951);
    System.out.println(bookList.contains(wantedBook));
    System.out.print(bookList.getBook(3));
    System.out.println(bookList.getYearOfBook("The Lord Of the Rings"));

  }
}
