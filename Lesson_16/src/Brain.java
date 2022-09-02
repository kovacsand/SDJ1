public class Brain
{
  private String[] memories;

  public Brain(int numberOfMemories)
  {
    memories = new String[numberOfMemories];
  }

  public int getIQ()
  {
    boolean above20 = false;
    boolean allAbove10 = true;
    for (int i = 0; i < memories.length; i++)
    {
      if (memories[i] == null)
      {
        return 70;
      }
      if (memories[i].length() >= 20)
      {
        above20 = true;
      }
      if (memories[i].length() < 10)
      {
        allAbove10 = false;
      }
    }

    if (above20 && allAbove10)
    {
      return 130;
    }
    if (allAbove10)
    {
      return 100;
    }
    return 70;
  }

  public boolean isBrainDamaged()
  {
    for (int i = 0; i < memories.length; i++)
    {
      if (memories[i] == null)
        return true;
    }
    return false;
  }

  public void remember(String info)
  {
    for (int i = memories.length - 1; i > 0; i--)
    {
      memories[i] = memories[i - 1];
    }
    memories[0] = info;
  }

  public void refreshMemory(String info)
  {
    int index = -1;
    for (int i = 0; i < memories.length; i++)
    {
      if (memories[i] != null && memories[i].equals(info))
      {
        index = i;
      }
    }

    System.out.println(index + 1);

    if (index != -1)
    {
      String tempMemory = memories[index];
      for (int i = index; i > 0; i--)
      {
        memories[i] = memories[i - 1];
      }
      memories[0] = tempMemory;
    }
  }

  public boolean recall(String info)
  {
    for (int i = 0; i < memories.length; i++)
    {
      if (memories[i] != null && memories[i].equals(info))
        return true;
    }
    return false;
  }

  public String recall()
  {
    return memories[0];
  }

  public String toString()
  {
    String str = String.format("Their IQ is: %d.\n", getIQ());

    for (int i = 0; i < memories.length; i++)
    {
      str += String.format("Their %d. memory is: %s.\n", i + 1, memories[i]);
    }
    return str;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Brain)
    {
      Brain other = (Brain) obj;
      for (int i = 0; i < memories.length; i++)
      {
        if (!memories[i].equals(other.memories[i]) || (memories[i] == null && other.memories[i] != null)|| (memories[i] != null && other.memories[i] == null)  )
          return false;
      }
      return true;
    }
    return false;
  }
}
