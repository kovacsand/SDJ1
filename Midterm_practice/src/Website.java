public class Website
{
  private String url;
          boolean needsUpdate;

  public Website(String url)
  {
    this.url = url;
    this.needsUpdate = false;
  }

  public String getUrl()
  {
    return url;
  }

  public boolean needsUpdate()
  {
    return needsUpdate;
  }

  public void markAsNotUpdated()
  {
    needsUpdate = true;
  }

  public void markAsUpdated()
  {
    needsUpdate = false;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Website))
      return false;
    Website other = (Website) obj;
    return (url.equals(other.url) && needsUpdate == other.needsUpdate);
  }

  public String toString()
  {
    String str = url;
    if (needsUpdate)
      str += String.format(" (Need to be updated)\n");
    else
      str += String.format(" (Does not need to be updated)\n");
    return str;
  }
}
