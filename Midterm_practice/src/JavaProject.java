import java.util.ArrayList;

public class JavaProject
{
  private String name;
          ArrayList<JavaFile> files = new ArrayList<JavaFile>();

  public JavaProject(String name)
  {
    this.name = name;
  }

  public void addJavaFile(JavaFile file)
  {
    files.add(file);
  }

  public FileName getFileName(int index)
  {
    return files.get(index).getFileName();
  }

  public JavaFile getFirstJavaFileWithAMainMethod()
  {
    boolean found = false;
    int i = 0;
    do
    {
      if (!files.get(i).hasAMainMethod())
        found = true;
      else
        i++;
    } while (!found);
    if (found)
      return files.get(i);
    else
      return null;
  }

  public String getProjectName()
  {
    return name;
  }
}
