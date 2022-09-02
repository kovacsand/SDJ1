import java.util.ArrayList;

public class TVSeries
{
  private String title;
          int numberOfEpisodes;
          ArrayList<Actor> actors = new ArrayList<Actor>();

  public TVSeries(String title)
  {
    this.title = title;
    numberOfEpisodes = 0;
  }

  public void hireActor(Actor actor)
  {
    actors.add(actor);
  }

  public int getNumberOfActors()
  {
    return actors.size();
  }

  public Actor getActor(int index)
  {
    return actors.get(index);
  }

  public void awardEmmy(String name)
  {
    for (int i = 0; i < actors.size(); i++)
    {
      if (actors.get(i).getName().equals(name))
        actors.get(i).awardEmmy();
    }
  }

  public void makeNextEpisode()
  {
    numberOfEpisodes++;
    for (int i = 0; i < actors.size(); i++)
      actors.get(i).participateInEpisode();
  }

  public ArrayList<Actor> getEmmyWinners()
  {
    ArrayList<Actor> temp = new ArrayList<Actor>();
    for (int i = 0; i < actors.size(); i++)
    {
      if (actors.get(i).getNumberOfEmmys() > 0)
        temp.add(actors.get(i));
    }
    return temp;
  }

  public String toString()
  {
    String str = "";
    str += title + "\n";
    str += numberOfEpisodes + " episodes\nCast:\n";
    for (int i = 0; i < actors.size(); i++)
      str += "\t" + (i+1) + ". " + actors.get(i).getName() + "\n";
    return str;
  }
}
