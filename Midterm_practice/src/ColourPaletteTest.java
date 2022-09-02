public class ColourPaletteTest
{
  public static void main(String[] args)
  {
    ColourPalette colourPalette1 = new ColourPalette(2);
    colourPalette1.add(new Colour(10, 10, 10));
    colourPalette1.add(new Colour(123, 1, 1));
    colourPalette1.add(new Colour(1, 1, 1));
    colourPalette1.add(new Colour(1, 1, 1));
    colourPalette1.add(new Colour(1, 1, 1));
    System.out.println(colourPalette1.getNumberOfGrayColours());
    colourPalette1.mixColour(0, new Colour(6, 6, 6));
    System.out.println(colourPalette1);

    ColourPalette colourPalette2 = new ColourPalette(2);
    colourPalette2.add(colourPalette1.get(0).copy());
    colourPalette2.add(new Colour(20, 20, 20));

    System.out.println(colourPalette1);
    System.out.println(colourPalette2);
    System.out.println(colourPalette1.equals(colourPalette2));
  }
}
