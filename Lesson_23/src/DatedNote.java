public class DatedNote extends Note
{
  private ExamMyDate date;

  public DatedNote(String message, ExamMyDate date)
  {
    super(message);
    this.date = date;
  }

  public ExamMyDate getDate()
  {
    return date;
  }

  public Note copy()
  {
    return new DatedNote(getMessage(), date);
  }

  public String toString()
  {
    return String.format("%s (date: %s)\n", getMessage(), date.toString());
  }
}
