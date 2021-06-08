import java.util.Hashtable;
import java.util.Iterator;

public class SongOfThe202x implements SongIterator {

    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();

    int hashKey = 0;

    public SongOfThe202x() {

        addSong("Ghost", "Marvin Brooks", 2021);
        addSong("Let It All Burn", "Graffiti Ghosts", 2020);
        addSong("Backbone", "Kaleo", 2021);
    }
    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
    }
    public Hashtable<Integer, SongInfo> getBestSongs() {
        return bestSongs;
    }

    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
