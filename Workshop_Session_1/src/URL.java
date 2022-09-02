public class URL
{
  //FIELDS
  private String topDomain,
                 subDomain,
                 path;

  //METHODS

  //Three-argument constructor
  public URL(String topDomain, String subDomain, String path)
  {
    this.topDomain = topDomain;
    this.subDomain = subDomain;
    this.path = path;
  }

  //Two-argument constructor
  public URL(String topDomain, String subDomain)
  {
    this.topDomain = topDomain;
    this.subDomain = subDomain;
    this.path = "";
  }

  //GETTERS
  public String getTopDomain()
  {
    return topDomain;
  }

  public String getSubDomain()
  {
    return subDomain;
  }

  public String getPath()
  {
    return path;
  }

  //toString
  public String toString()
  {
    return String.format("http://%s.%s/%s\n", subDomain, topDomain, path);
  }
}
