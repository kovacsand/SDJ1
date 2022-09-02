import java.util.ArrayList;

public class ColourPalette
{
  private int numberOfColours;
          ArrayList<Colour> colours = new ArrayList<Colour>();

  public ColourPalette(int maxNumberOfColours)
  {
    this.numberOfColours = maxNumberOfColours;
  }

  public int getNumberOfColours()
  {
    return colours.size();
  }

  public void add(Colour colour)
  {
    if (getNumberOfColours() < numberOfColours)
      colours.add(colour);
  }

  public Colour get(int index)
  {
    return colours.get(index);
  }

  public int getNumberOfGrayColours()
  {
    int counter = 0;
    for (int i = 0; i < colours.size(); i++)
      if (colours.get(i).isGray())
        counter++;
    return counter;
  }

  public void mixColour(int index, Colour colour2)
  {
    colours.get(index).mixWith(colour2);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ColourPalette))
      return false;
    ColourPalette other = (ColourPalette) obj;
    if (getNumberOfColours() != other.getNumberOfColours() || colours.size() != other.colours.size())
      return false;
    for (int i = 0; i < colours.size(); i++)
      if (!colours.get(i).equals(other.colours.get(i)))
        return false;
    return true;
  }

  public String toString()
  {
    String str = "Maximum number of colours on the palette: " + numberOfColours + "\n";
    for (int i = 0; i < colours.size(); i++)
      str += colours.get(i);
    return str;
  }
}
