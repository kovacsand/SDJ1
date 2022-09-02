public class Brain
{
  private String activeMemoryItem,
                 passiveMemoryItemOne,
                 passiveMemoryItemTwo;

  public Brain()
  {
    activeMemoryItem = "";
    passiveMemoryItemOne = "";
    passiveMemoryItemTwo = "";
  }

  public int getIQ()
  {
    if ( (activeMemoryItem.length() >= 20 && passiveMemoryItemOne.length() >= 10 && passiveMemoryItemTwo.length() >= 10)
        || (activeMemoryItem.length() >= 10 && passiveMemoryItemOne.length() >= 20 && passiveMemoryItemTwo.length() >= 10)
        || (activeMemoryItem.length() >= 10 && passiveMemoryItemOne.length() >= 10 && passiveMemoryItemTwo.length() >= 20) )
    {
      return 130;
    }
    else if(activeMemoryItem.length() >= 10 && passiveMemoryItemOne.length() >= 10 && passiveMemoryItemTwo.length() >= 10)
    {
      return 100;
    }
    else
    {
      return 70;
    }
  }

  public boolean isBrainDamaged()
  {
    return (activeMemoryItem == "" || passiveMemoryItemOne == null || passiveMemoryItemTwo == null);
  }

  public void remember(String info)
  {
    passiveMemoryItemTwo = passiveMemoryItemOne;
    passiveMemoryItemOne = activeMemoryItem;
    activeMemoryItem = info;
  }

  public void refreshMemory(String info)
  {
    if (passiveMemoryItemOne.equals(info))
    {
      String tempMemory = activeMemoryItem;
      activeMemoryItem = passiveMemoryItemOne;
      passiveMemoryItemOne = tempMemory;
    }
    if (passiveMemoryItemTwo.equals(info))
    {
      String tempMemory = activeMemoryItem;
      activeMemoryItem = passiveMemoryItemTwo;
      passiveMemoryItemTwo = passiveMemoryItemOne;
      passiveMemoryItemOne = tempMemory;
    }
  }

  public boolean recall(String info)
  {
    return (activeMemoryItem.equals(info) || passiveMemoryItemOne.equals(info) || passiveMemoryItemTwo.equals(info));
  }

  public String recall()
  {
    return activeMemoryItem;
  }

  public String toString()
  {
    String str =  String.format("Their IQ is: %d.\nTheir active memory is: %s.\nTheir first passive memory is: %s."
        + "\nTheir second passive memory is: %s.", getIQ(), activeMemoryItem, passiveMemoryItemOne, passiveMemoryItemTwo);
    if (isBrainDamaged())
    {
      str += String.format("\nThey are also brain-damaged...");
    }
    return str;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Brain)
    {
      Brain other = (Brain) obj;
      return (other.activeMemoryItem.equals(activeMemoryItem) && other.passiveMemoryItemOne.equals(passiveMemoryItemOne) && other.passiveMemoryItemTwo.equals(passiveMemoryItemTwo));
    }
    else
    {
      return false;
    }
  }
}
