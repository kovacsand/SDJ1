public class NotebookTest
{
  public static void main(String[] args)
  {
    Note note1 = new Note("This is my first note.");
    Notebook notebook1 = new Notebook(10);

    System.out.println(notebook1.getNumberOfNotes());
    System.out.println(notebook1.getNote(0));
    System.out.println(notebook1.getMessage(1));

    notebook1.addNote(note1);
    notebook1.addNote("This is my second note.");
    notebook1.addHighPriority("This is very important!");

    System.out.println(notebook1);

    notebook1.removeNote(1);
    notebook1.addNote("This should be in the last place.");

    System.out.println(notebook1);


    //Works until this point

    System.out.println("Debug here!");
    System.out.println(notebook1.getNumberOfNotes());
    for (int i = 0; i < notebook1.getAllNotes().length; i++)
    {
      System.out.println(notebook1.getAllNotes()[i]);
    }

    System.out.println(notebook1.getNumberOfHighPriorityNotes());

    Note[] importantNotes;
    importantNotes = notebook1.getAllHighPriorityNotes();

    for (int i = 0; i < notebook1.getAllHighPriorityNotes().length; i++)
    {
      System.out.println(notebook1.getAllHighPriorityNotes()[i]);
    }
/*
    System.out.println(note1.getMessage());
    System.out.println(note1.isHighPriority());
    note1.setMessage("This is my first note.");
    note1.setToHighPriority();
    System.out.println(note1);

    Note note2 = note1.copy();
    note2.setToLowPriority();

    System.out.println(note2);*/
  }
}
