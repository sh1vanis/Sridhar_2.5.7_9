/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  public static String owner = "PLTW";
  
  private static int numEntries = 0;
  private static int numBook = 0;
  private static int numMovie = 0;
  private static int numSong = 0;

  private Book book;
  private Movie movie;
  private Song song;

  
  public void addBook(Book b)
  {
    if (numBook ==0){
      book = b;
      numEntries += 1;
      numBook += 1;
    }
    else{
      System.out.println("You can only have one book in your library.");
    }
  }

  
  public void addMovie(Movie m)
  {
    if (numMovie ==0){
      movie = m;
      numEntries += 1;
      numMovie += 1;
    }
    else{
      System.out.println("You can only have one movie in your library.");
    }
  }

  
  public void addSong(Song s)
  {
    if (numSong ==0){
      song = s;
      numEntries += 1;
      numSong += 1;
    }
    else{
      System.out.println("You can only have one song in your library.");
    }
  }

  
  public String toString()  
  {
  String info = "";
  if (book != null)
    info += "Book: " + book + "\n";
  if (movie != null)
    info += "Movie: " + movie + "\n";
    if (song != null)
      info += "Song: " + song + "\n";

  return info;
  }

  // public static String getOwner(){
  //   return owner;
  // }
  public static void changeOwner(String newOwner){
    owner = newOwner;
  }
  
  public static int getNumEntries(){
    // System.out.println("Test: Owner is " + owner);
    // System.out.println("Test: Info is " + info);
    return numEntries;
  }
}
