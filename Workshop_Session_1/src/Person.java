public class Person
{
  //FIELDS
  private String name;
  private Pet pet;

  //METHODS

  //One-argument constructor
  public Person(String name)
  {
    this.name = name;
    this.pet = null;
  }

  //SETTERS

  public void setPet(Pet pet)
  {
    this.pet = pet;
  }

  //GETTERS

  public String getName()
  {
    return name;
  }

  public Pet getPet()
  {
    return pet;
  }

  public String getPetsName()
  {
    return pet.getName();
  }

  //toString
  public String toString()
  {
    if (pet != null)
    {
      return String.format("%s owns a/an %s, whose name is %s.", name, pet.getType(), pet.getName());
    }
    else
    {
      return String.format("%s doesn't own a pet :(", name);
    }
  }
}
