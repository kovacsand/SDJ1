public class Note
{
  private String message;
          boolean highPriority;

  public Note(String message)
  {
    this.message = message;
    highPriority = false;
  }

  public String getMessage()
  {
    return message;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  public boolean isHighPriority()
  {
    return highPriority;
  }

  public void setToHighPriority()
  {
    highPriority = true;
  }

  public void setToLowPriority()
  {
    highPriority = false;
  }

  public Note copy()
  {
    return new Note(message);
  }

  public String toString()
  {
    String str = message;
    if (highPriority)
    {
      str += String.format(" (It is a high priority note.)\n");
    }
    else
    {
      str += String.format(" (It is a low priority note.)\n");
    }
    return str;
  }
}
