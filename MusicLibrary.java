
/**
 * This program creates a music library and stores the info to be called
 * upon by the client class.
 *
 * @Gregory
 * @3/5/2021
 */
public class MusicLibrary
{
    private Album[] library;
    private double totalPlayTime;
    private int totalSongs;
    private int openIndex;
    public MusicLibrary()
    {
        library = new Album[10];
        totalPlayTime = 0;
        totalSongs = 0;
        openIndex = 0;
    }
    public void add(Album album)
    {
        library[openIndex] = album;
        totalSongs += album.getNumSongs();
        totalPlayTime += album.getPlayTime();
    }
    public void doubleSize(){
        Album[] newLibrary = new Album[library.length * 2];
        for(int i=0; i < library.length; i++){
            newLibrary[i] = library[i];
        }
        library = newLibrary;
    }
    public void remove(int index)
    {
        if(library[index] == null){
            return;
        }
        else {
        totalSongs -= library[index].getNumSongs();
        totalPlayTime -= library[index].getPlayTime();
        library[index] = null;
        }
    }
    public String toString(){
        String summary = "Number of Tracks = " + totalSongs + "\n"
        + "Total Play Time = " + totalPlayTime + " minutes" + "\n"
        + "Number of Albums = " + library.length + "Albums" + "\n";
        for(int i=0; i<library.length; i++){
            if(library[i] != null){
                summary += library[i] + "\n\n";
            }
        }
        return summary;
    }
    public int linSearch(String target){
        for(int i=0; i<library.length; i++){
            if(library[i].getSongName().equals(target)){
                return i;
            }
        }
        return -1;
    }
    public void selectionSort( int[] numbers){
       int min, temp;
       for( int i = 0; i < library.length - 1; i++){
           min = i;
           for(int scan = i + 1; scan < library.length; scan++){
               if(library[scan].getPlayTime() < library[min].getPlayTime()){
                   min = scan;
                }
           }
           temp = numbers[min];
           numbers[min] = numbers[i];
           numbers[i] = temp;
       }
    }
    public void insertionSort(){
       for(int i = 1; i < library.length; i++){
           int key = library[i].getNumSongs();
           int position = i;
           while (position > 0 && library[position - 1].getNumSongs() > key){
               library[position] = library[position - 1];
           position--;
           }
       }
    }
    public int binarySearch(int target, int[] arr) {
       int low = 0, high = arr.length-1, middle = (low + high)/2;
       while (arr[middle] != target && low <= high){
           if (target < arr[middle])
               high = middle - 1;
           else
               low = middle + 1;
           middle = (low + high)/2;
       }
       if (arr[middle] == target)
           return middle;
       else
           return -1;
    }
}
/**
 * I had some trouble with this program with a formatting issue but it works 
 * correctly now.
 */