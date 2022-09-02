import java.util.ArrayList;

public class Notebook
{
  private int sizeOfNoteboook = 0;
          ArrayList<Note> notes;

  public Notebook()
  {
    notes = new ArrayList<Note>(5);
    this.sizeOfNoteboook = 5;
  }

  public Notebook(int sizeOfNotebook)
  {
    notes = new ArrayList<Note>(sizeOfNotebook);
    this.sizeOfNoteboook = sizeOfNotebook;
  }

  public int getNumberOfNotes()
  {
    return notes.size();
  }

  public Note getNote(int index)
  {
    return notes.get(index);
  }

  public String getMessage(int index)
  {
    if (notes.get(index) == null)
    {
      return "Insufficient index";
    }
    return notes.get(index).getMessage();
  }

  public void addNote(Note note)
  {
    if (notes.size() < sizeOfNoteboook)
      notes.add(note);
  }

  public void addNote(String message)
  {
    if (notes.size() < sizeOfNoteboook)
      notes.add(new Note(message));
  }

  public void addHighPriority(String message)
  {
    Note temp = new Note(message);
    temp.setToHighPriority();
    notes.add(temp);
  }

  public void removeNote(int index)
  {
    notes.remove(index);
  }

  public Note[] getAllNotes()
  {
    return notes.toArray(new Note[notes.size()]);
  }

  public int getNumberOfHighPriorityNotes()
  {
    int counter = 0;
    for (int i = 0; i < notes.size(); i++)
    {
      if (notes.get(i).isHighPriority())
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
    for (int i = 0; i < notes.size(); i++)
    {
      if (notes.get(i).isHighPriority())
      {
        highPriorityNotes[counter] = notes.get(i);
        counter++;
      }
    }
    return highPriorityNotes;
  }

  public String toString()
  {
    String str = "";
    for (int i = 0; i < notes.size(); i++)
    {
      str += notes.get(i);
    }
    return str;
  }
}
