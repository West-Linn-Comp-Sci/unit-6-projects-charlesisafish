
/**
 * Write a description of class Album here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Album
{
    private String songName;
    private String songArtist;
    private int numSongs;
    private double playTime;
    public Album(String songName, String songArtist, int numSongs, double playTime)
    {
        this.songName = songName;
        this.songArtist = songArtist;
        this.numSongs = numSongs;
        this.playTime = playTime;
    }
    public String getSongName(){
        return songName;
    }
    public String getSongArtist(){
        return songArtist;
    }
    public int getNumSongs(){
        return numSongs;
    }
    public double getPlayTime(){
        return playTime;
    }
    public String toString(){
        String summary = "Title = " + songName + "\n"
        + "Artist = " + songArtist + "\n"
        + "Number of songs = " + numSongs + "\n"
        + "Total play time = " + playTime + " minutes";
        return summary;
    }
}
