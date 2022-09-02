import java.util.ArrayList;

public class Notebook
{
  private int numberOfNotes;
  private ArrayList<Note> notes;

  public Notebook(int maxNumberOfNotes)
  {
    numberOfNotes = maxNumberOfNotes;
    notes = new ArrayList<Note>(maxNumberOfNotes);
  }

  public void addNote(Note note)
  {
    if (notes.size() < numberOfNotes)
      notes.add(note);
  }

  public void setNote(Note note, int index)
  {
    if (index <= numberOfNotes)
      notes.set(index, note);
  }

  public void removeNote(int index)
  {
    notes.remove(index);
  }

  public Note getNote(int index)
  {
    return notes.get(index);
  }

  public int getNumberOfPriorityNotes()
  {
    int counter = 0;
    for (int i = 0; i < notes.size(); i++)
      if (notes.get(i) instanceof PriorityNote)
        counter++;
    return counter;
  }

  public PriorityNote[] getPriorityNotes()
  {
    PriorityNote[] priorityNotes = new PriorityNote[getNumberOfPriorityNotes()];
    int counter = 0;
    for (int i = 0; i < notes.size(); i++)
      if (notes.get(i) instanceof PriorityNote)
        if (((PriorityNote) notes.get(i)).getPriority() == 1)
          priorityNotes[counter++] = (PriorityNote) notes.get(i);
    for (int i = 0; i < notes.size(); i++)
      if (notes.get(i) instanceof PriorityNote)
        if (((PriorityNote) notes.get(i)).getPriority() == 2)
          priorityNotes[counter++] = (PriorityNote) notes.get(i);
    for (int i = 0; i < notes.size(); i++)
      if (notes.get(i) instanceof PriorityNote)
        if (((PriorityNote) notes.get(i)).getPriority() == 3)
          priorityNotes[counter++] = (PriorityNote) notes.get(i);
    return priorityNotes;
  }

  public String toString()
  {
    String str = "";
    for (int i = 0; i < notes.size(); i++)
      str += String.format("%d. Note: %s\n",notes.get(i));
    return str;
  }
}
