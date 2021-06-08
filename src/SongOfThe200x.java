import java.util.ArrayList;
import java.util.Iterator;

public class SongOfThe200x implements SongIterator {

    ArrayList<SongInfo> bestSongs;

    public SongOfThe200x() {
        bestSongs = new ArrayList<SongInfo>();

        addSong("It's My Life", "Bon Jovi", 2000);
        addSong("Saturday", "Fall Out Boy", 2003);
        addSong("Last Night on Earth", "Green Day", 2009);
    }
    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.add(songInfo);
    }

    public ArrayList<SongInfo> getBestSongs(){
        return bestSongs;
    }

    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
