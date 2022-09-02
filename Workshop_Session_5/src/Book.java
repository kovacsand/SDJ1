public class Book extends Item
{
  private String title;
  private int year;

  public Book(double price, String title, int year)
  {
    super(price);
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
    return String.format("%s was published in %d.\n%s", title, year, super.toString());
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Book))
      return false;
    Book other = (Book) obj;
    return super.equals(other) && title.equals(other.title) && year == other.year;
  }

  public String getType()
  {
    return "Book";
  }

  public Item copy()
  {
    return new Book(this.getPrice(), this.title, this.year);
  }
}
