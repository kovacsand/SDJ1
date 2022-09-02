public class BookList
{
  private int size;
          Book[] list;

  public BookList(int maxNumberOfBooks)
  {
    list = new Book[maxNumberOfBooks];
    size = maxNumberOfBooks;
  }

  public int getSize()
  {
    return list.length - size;
  }

  public void addBook(Book book)
  {
    list[getSize()] = book;
    size--;
  }

  public Book getBook(int index)
  {
    return list[index];
  }

  public boolean contains(Book book)
  {
    for (int i = 0; i < getSize(); i++)
      if (list[i].equals(book))
        return true;
    return false;
  }

  public int getYearOfBook(String bookTitle)
  {
    for (int i = 0; i < getSize(); i++)
      if (list[i].getTitle().equals(bookTitle))
        return list[i].getYear();
    return -1;
  }

  public String toString()
  {
    String str = String.format("The list can have %d books. Now it has %d free spaces.\n", list.length, size);
    for (int i = 0; i < getSize(); i++)
    {
      str += String.format("The %d. book: %s", i+1, list[i]);
    }
    return str;
  }
}
