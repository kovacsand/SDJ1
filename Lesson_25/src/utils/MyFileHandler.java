package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileHandler
{
  public static void writeToTextFile(String fileName, String str)
      throws FileNotFoundException
  {
    PrintWriter write = null;
    try
    {
      write = new PrintWriter(new FileOutputStream(fileName));
      write.println(str);
    }
    finally
    {
      if (write != null)
        write.close();
    }
  }

  public static void appendToTextFile(String fileName, String str)
      throws FileNotFoundException
  {
    PrintWriter write = null;
    try
    {
      write = new PrintWriter(new FileOutputStream(fileName, true));
      write.println(str);
    }
    finally
    {
      if (write != null)
        write.close();
    }
  }

  public static void writeArrayToTextFile(String fileName, String[] strs)
      throws FileNotFoundException
  {
    PrintWriter write = null;
    try
    {
      write = new PrintWriter(new FileOutputStream(fileName));
      for (int i = 0; i < strs.length; i++)
        write.println(strs[i]);
    }
    finally
    {
      if (write != null)
        write.close();
    }
  }

  public static void appendArrayToTextFile(String fileName, String[] strs)
      throws FileNotFoundException
  {
    PrintWriter write = null;
    try
    {
      write = new PrintWriter(new FileOutputStream(fileName, true));
      for (int i = 0; i < strs.length; i++)
        write.println(strs[i]);
    }
    finally
    {
      if (write != null)
        write.close();
    }
  }

  public static String readFromTextFile(String fileName)
      throws FileNotFoundException
  {
    Scanner read = null;
    String str = "";
    try
    {
      read = new Scanner(new FileInputStream(fileName));
      str = read.nextLine();
    }
    finally
    {
      if (read != null)
        read.close();
    }
    return str;
  }

  public static String[] readArrayFromTextFile(String fileName)
      throws FileNotFoundException
  {
    Scanner read = null;
    ArrayList<String> strings = new ArrayList<String>();

    try
    {
      read = new Scanner(new FileInputStream(fileName));
      while (read.hasNext())
        strings.add(read.nextLine());
    }
    finally
    {
      if (read != null)
        read.close();
    }
    return strings.toArray(new String[strings.size()]);
  }

  public static void writeToBinaryFile(String fileName, Object obj)
      throws FileNotFoundException, IOException
  {
    ObjectOutputStream write = null;
    try
    {
      write = new ObjectOutputStream(new FileOutputStream(fileName));
      write.writeObject(obj);
    }
    finally
    {
      if (write != null)
      {
        try
        {
          write.close();
        }
        catch (IOException e)
        {
          System.err.println("IO Error closing file " + fileName);
        }
      }
    }
  }

  public static void writeArrayToBinaryFile(String fileName, Object[] objs)
      throws FileNotFoundException, IOException
  {
    ObjectOutputStream write = null;
    try
    {
      write = new ObjectOutputStream(new FileOutputStream(fileName));
      for (int i = 0; i < objs.length; i++)
        write.writeObject(objs[i]);
    }
    finally
    {
      if (write != null)
      {
        try
        {
          write.close();
        }
        catch (IOException e)
        {
          System.err.println("IO Error closing file " + fileName);
        }
      }
    }
  }

  public static Object readFromBinaryFile(String fileName)
      throws FileNotFoundException, IOException, ClassNotFoundException
  {
    ObjectInputStream read = null;
    Object obj = null;
    try
    {
      read = new ObjectInputStream(new FileInputStream(fileName));
      try
      {
        obj = read.readObject();
      }
      catch (EOFException e)
      {
        //We expect the file to end, so there is nothing to do
      }
    }
    finally
    {
      if (read != null)
      {
        try
        {
          read.close();
        }
        catch (IOException e)
        {
          System.err.println("IO Error closing file " + fileName);
        }
      }
    }
    return obj;
  }

  public static Object[] readArrayFromBinaryFile(String fileName)
      throws FileNotFoundException, IOException, ClassNotFoundException
  {
    ObjectInputStream read = null;
    ArrayList<Object> objs = new ArrayList<Object>();
    try
    {
      read = new ObjectInputStream(new FileInputStream(fileName));
      while (true)
      {
        try
        {
          objs.add(read.readObject());
        }
        catch (EOFException e)
        {
          //We expect the file to end, so there is nothing to do
          break;
        }
      }
    }
    finally
    {
      if (read != null)
      {
        try
        {
          read.close();
        }
        catch (IOException e)
        {
          System.err.println("IO Error closing file " + fileName);
        }
      }
    }
    return objs.toArray(new Object[objs.size()]);
  }
}
