public class LibraryBook extends Book2
{
  private Person borrower;

  public LibraryBook(Person author, String title, String isbn)
  {
    super(author, title, isbn);
    borrower = null;
  }

  public void loanBook(Person borrower)
  {
    this.borrower = borrower;
  }

  public void returnBook()
  {
    this.borrower = null;
  }

  public Person whoBorrowedTheBook()
  {
    return borrower;
  }

  public String toString()
  {
    String str = super.toString();
    if (borrower != null)
      str += "It is currently borrowed by " + this.whoBorrowedTheBook().getName() + ".\n";
    return str;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof LibraryBook))
      return false;
    LibraryBook other = (LibraryBook) obj;
    return super.equals(other) && borrower.equals(other.borrower);
  }
}
