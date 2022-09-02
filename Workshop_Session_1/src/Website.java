public class Website
{
  //FIELDS
  private String content;
  private URL url;

  //METHODS

  //Two-argument constructor
  public Website(URL url, String content)
  {
    this.url = url;
    this.content = content;
  }

  //GETTERS
  public URL getURL()
  {
    return url;
  }

  //SETTERS
  public void setContent(String content)
  {
    this.content = content;
  }

  //toString
  public String toString()
  {
    return String.format("This website: %s shows content of %s.\n", url.toString(), content);
  }
}
