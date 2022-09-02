public class Notebook
{
  private int numberOfNotes = 0;
          Note[] notes;

  public Notebook(int maxNumberOfNotes)
  {
    notes = new Note[maxNumberOfNotes];
  }

  public int getNumberOfNotes()
  {
    return numberOfNotes;
  }

  public Note getNote(int index)
  {
    return notes[index];
  }

  public String getMessage(int index)
  {
    if (notes[index] == null)
    {
      return "Insufficient index";
    }
    return notes[index].getMessage();
  }

  public void addNote(Note note)
  {
    notes[numberOfNotes] = note;
    numberOfNotes++;
  }

  public void addNote(String message)
  {
    notes[numberOfNotes] = new Note(message);
    numberOfNotes++;
  }

  public void addHighPriority(String message)
  {
    notes[numberOfNotes] = new Note(message);
    notes[numberOfNotes].setToHighPriority();
    numberOfNotes++;
  }

  public void removeNote(int index)
  {
    notes[index] = null;
    for (int i = index; i < numberOfNotes - 1; i++)
    {
      notes[i] = notes[i+1];
    }
    notes[numberOfNotes] = null;
    numberOfNotes--;
  }

  public Note[] getAllNotes()
  {
    Note[] allNotes = new Note[numberOfNotes];
    for (int i = 0; i < numberOfNotes; i++)
    {
      allNotes[i] = notes[i];
    }
    return allNotes;
  }

  public int getNumberOfHighPriorityNotes()
  {
    int counter = 0;
    for (int i = 0; i < numberOfNotes; i++)
    {
      if (notes[i].isHighPriority())
      {
        counter++;
      }
    }
    return counter;
  }

  public Note[] getAllHighPriorityNotes()
  {
    int counter = 0;
    Note[] highPriorityNotes = new Note[getNumberOfHighPriorityNotes()];
    for (int i = 0; i < numberOfNotes; i++)
    {
      if (notes[i].isHighPriority())
      {
        highPriorityNotes[counter] = notes[i];
        counter++;
      }
    }
    return highPriorityNotes;
  }

  public String toString()
  {
    String str = "";
    for (int i = 0; i < numberOfNotes; i++)
    {
      str += notes[i];
    }
    return str;
  }
}
