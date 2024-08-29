public class Main {
    public static void main(String[] args) {
        //create a user
        User user = new User("cool guy");

        //create different types of playlists
        PlayList popPlaylist = user.createPlaylist("pop playlist", "pop");
        PlayList rockPlaylist = user.createPlaylist("rock playlist", "rock");
        PlayList jazzPlaylist = user.createPlaylist("jazz playlist", "jazz");

        //create songs
        Song song1 = new Song("song one", "band one", 3.53);
        Song song2 = new Song("song two", "band two", 5.32);
        Song song3 = new Song("song three", "band three", 3.58);

        //sdd songs to playlists
        user.addSongToPlaylist(popPlaylist, song1);
        user.addSongToPlaylist(rockPlaylist, song2);
        user.addSongToPlaylist(jazzPlaylist, song3);

        //play all songs
        System.out.println("\nplaying all songs from the pop playlist:");
        popPlaylist.playAllSongs();

        System.out.println("\nplaying all songs from the rock playlist:");
        rockPlaylist.playAllSongs();

        System.out.println("\nplaying all songs from the jazz playlist:");
        jazzPlaylist.playAllSongs();

        //delete a playlist
        user.deletePlaylist(rockPlaylist);

    }
}
