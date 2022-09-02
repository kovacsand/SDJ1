public class Pet
{
  //FIELDS
  private String name,
                 type;

  //METHODS

  //Constructor

  //Two-argument constructor
  public Pet(String type, String name)
  {
    this.type = type;
    this.name = name;
  }

  //One-argument constructor
  public Pet(String name)
  {
    this.name = name;
    this.type = "";
  }

  //SETTERS

  public void setName(String name)
  {
    this.name = name;
  }

  //GETTERS

  public String getName()
  {
    return name;
  }

  public String getType()
  {
    return type;
  }

  //toString
  public String toString()
  {
    return String.format("%s is a %s.", name, type);
  }
}