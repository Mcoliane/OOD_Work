import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private String name;
    private List<Song> songs;

    public PlayList(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public void playAllSongs() {
        for (Song song : songs) {
            System.out.println("Playing: " + song.getTitle() + " by " + song.getArtist());
        }
    }


    public String getName() {
        return name;
    }
}
