public class Book
{
  private String title;
          int year;

  public Book(String title, int year)
  {
    this.title = title;
    this.year = year;
  }

  public String getTitle()
  {
    return title;
  }

  public int getYear()
  {
    return year;
  }

  public String toString()
  {
    return String.format("%s was published in %d.\n", title, year);
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Book)
    {
      Book other = (Book) obj;
      return title.equals(other.title) && year == other.year;
    }
    return false;
  }
}
