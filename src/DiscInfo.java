import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Enumeration;

public class DiscInfo {

    SongOfThe200x songs200x;
    SongOfThe201x songs201x;
    SongOfThe202x songs202x;

    SongIterator iter200xSongs;
    SongIterator iter201xSongs;
    SongIterator iter202xSongs;

    public DiscInfo(SongIterator newSongs200x, SongIterator newSongs201x, SongIterator newSongs202x) {
        iter200xSongs = newSongs200x;
        iter201xSongs = newSongs201x;
        iter202xSongs = newSongs202x;
    }
    public void showTheSongs() {

        ArrayList aL200xSongs = songs200x.getBestSongs();
        System.out.println("Songs of the 200x \n");
        for (int i=0; i < aL200xSongs.size(); i++) {
            SongInfo bestSongs = (SongInfo) aL200xSongs.get(i);

                System.out.println(bestSongs.getSongName());
                System.out.println(bestSongs.getBandName());
                System.out.println(bestSongs.getYearReleased() + "\n");
        }
        SongInfo[] array201xSongs = songs201x.getBestSongs();
        System.out.println("Songs of the 201x \n");
        for (int j=0; j < array201xSongs.length; j++) {
            SongInfo bestSongs = array201xSongs[j];

                System.out.println(bestSongs.getSongName());
                System.out.println(bestSongs.getBandName());
                System.out.println(bestSongs.getYearReleased() + "\n");
        }
        Hashtable<Integer, SongInfo> ht202xSongs = songs202x.getBestSongs();
        System.out.println("Songs of the 202x \n");
        for (Enumeration<Integer> e = ht202xSongs.keys(); e.hasMoreElements();){
            SongInfo bestSongs = ht202xSongs.get(e.nextElement());

                System.out.println(bestSongs.getSongName());
                System.out.println(bestSongs.getBandName());
                System.out.println(bestSongs.getYearReleased() + "\n");
        }
    }
    public void showTheSongs2() {
        System.out.println("New iterator\n");

        Iterator Songs200x = iter200xSongs.createIterator();
        Iterator Songs201x = iter201xSongs.createIterator();
        Iterator Songs202x = iter202xSongs.createIterator();

            System.out.println("Songs of the 200x \n");
            printTheSongs(Songs200x);
            System.out.println("Songs of the 201x \n");
            printTheSongs(Songs201x);
            System.out.println("Songs of the 202x \n");
            printTheSongs(Songs202x);
    }
    public void printTheSongs(Iterator iterator) {
        while (iterator.hasNext()) {
            SongInfo songInfo = (SongInfo) iterator.next();

                System.out.println(songInfo.getSongName());
                System.out.println(songInfo.getBandName());
                System.out.println(songInfo.getYearReleased() + "\n");
        }
    }
}
