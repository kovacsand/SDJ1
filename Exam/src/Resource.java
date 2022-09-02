public class Resource
{
  private String fileName;
  private String extension;

  public Resource(String fileName, String extension)
  {
    this.fileName = fileName;
    this.extension = extension;
  }

  public boolean isPdf()
  {
    return (extension.equals("pdf") || extension.equals("PDF"));
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Resource))
      return false;
    Resource other = (Resource) obj;
    return other.fileName.equals(fileName) && other.extension.equals(extension);
  }

  public String toString()
  {
    return fileName + "." + extension;
  }
}
