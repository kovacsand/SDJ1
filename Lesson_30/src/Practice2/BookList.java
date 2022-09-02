package Practice2;

import java.util.ArrayList;

public class BookList
{
  private ArrayList<Book> books;

  public BookList()
  {
    books = new ArrayList<>();
  }

  public int getNumberOfBooks()
  {
    return books.size();
  }

  public void addBook(Book book)
  {
    books.add(book);
  }

  public Book getBook(int index)
  {
    return books.get(index);
  }

  public Book getBook(String isbn)
  {
    for (int i = 0; i < getNumberOfBooks(); i++)
      if (books.get(i).getIsbn().equals(isbn))
        return books.get(i);
    return null;
  }

  public void removeBook(int index)
  {
    books.remove(index);
  }

  public int getIndexOfFirstPrintedBook()
  {
    for (int i = 0; i < getNumberOfBooks(); i++)
      if (books.get(i) instanceof PrintedBook)
        return i;
    return -1;
  }

  public int getNumberOfBooksByType(String bookType)
  {
    int counter = 0;
    for (int i = 0; i < getNumberOfBooks(); i++)
      if (books.get(i).getBookType().equals(bookType))
        counter++;
    return counter;
  }

  public Book[] getBooksByType(String bookType)
  {
    Book[] temp = new Book[getNumberOfBooksByType(bookType)];
    int counter = 0;
    for (int i = 0; i < getNumberOfBooks(); i++)
      if (books.get(i).getBookType().equals(bookType))
        temp[counter++] = books.get(i);
    return temp;
  }

  public EBook[] getAllEBooks()
  {
    return (EBook[]) getBooksByType("EBook");
  }

  public String toString()
  {
    String str = "This BookList has " + getNumberOfBooks() + " number of books.\n";
    for (int i = 0; i < getNumberOfBooks(); i++)
      str += "\n" + books.get(i);
    return str;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof BookList))
      return false;
    BookList other = (BookList) obj;
    return books.equals(other.books);
  }
}
