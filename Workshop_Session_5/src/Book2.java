public class Book2
{
  private String title, isbn;
  private Person author;

  public Book2(Person author, String title, String isbn)
  {
    this.author = author;
    this.title = title;
    this.isbn = isbn;
  }

  public String getAuthorName()
  {
    return author.getName();
  }

  public String getTitle()
  {
    return title;
  }

  public String getIsbn()
  {
    return isbn;
  }

  public String toString()
  {
    return String.format("%s (%s) was written by %s.\n", title, isbn, getAuthorName());
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Book2))
      return false;
    Book2 other = (Book2) obj;
    return super.equals(other) && title.equals(other.title) && isbn.equals(other.isbn);
  }
}
