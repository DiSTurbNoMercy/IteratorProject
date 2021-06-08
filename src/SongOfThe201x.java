import java.util.Arrays;
import java.util.Iterator;

public class SongOfThe201x implements SongIterator {

    SongInfo[] bestSongs;

    int arrayValue = 0;

    public SongOfThe201x() {
        bestSongs = new SongInfo[3];

        addSong("Way Down We Go", "Kaleo", 2015);
        addSong("Believer", "Imagine Dragons", 2017);
        addSong("The Kid I Used to Know", "Arrested Youth", 2019);
    }
    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo song = new SongInfo(songName, bandName, yearReleased);
        bestSongs[arrayValue] = song;
        arrayValue++;
    }
    public SongInfo[] getBestSongs() {
        return bestSongs;
    }

    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
