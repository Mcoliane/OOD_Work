import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<PlayList> playlists;

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

    public PlayList createPlaylist(String name, String type) {
        PlayList playlist = null;

        //creates a type of playlist based on the input
        if ("pop".equals(type)) {
            playlist = new PopPlayList(name);
        } else if ("rock".equals(type)) {
            playlist = new RockPlayList(name);
        } else if ("jazz".equals(type)) {
            playlist = new JazzPlayList(name);
        }

        //if a playlist was created add it to the list of playlists
        if (playlist != null) {
            playlists.add(playlist);
        }
        return playlist;
    }

    public void deletePlaylist(PlayList playlist) { //delete playlist
        playlists.remove(playlist);
    }

    public void addSongToPlaylist(PlayList playlist, Song song) { //add a song to a playlist
        if (playlists.contains(playlist)) {
            playlist.addSong(song);
        }
    }

    public void removeSongFromPlaylist(PlayList playlist, Song song) { //delete a song from a playlist
        if (playlists.contains(playlist)) {
            playlist.removeSong(song);
        }
    }
    public List<PlayList> getPlaylists() {
        return playlists;
    }
}
