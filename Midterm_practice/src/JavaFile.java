public class JavaFile
{
  private boolean hasAMainMethod;
          FileName fileName;

  public JavaFile(String fileName)
  {
    this.hasAMainMethod = false;
    this.fileName = new FileName(fileName, "java");
  }

  public FileName getFileName()
  {
    return fileName;
  }

  public boolean hasAMainMethod()
  {
    return hasAMainMethod;
  }

  public void addAMainMethod()
  {
    hasAMainMethod = true;
  }

  public String toString()
  {
    String str = fileName.getFullName();
    if (hasAMainMethod)
      str += "(has a main method)\n";
    else
      str += "(does not have a main method)\n";
    return str;
  }
}
