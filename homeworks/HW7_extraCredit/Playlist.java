import java.util.ArrayList;
import java.util.Arrays;

public class Playlist {
    private String playlistTitle;
    private ArrayList<Song> songs = new ArrayList<Song>();

    public Playlist(){

    }

    public Playlist(String playlistTitle){
        this.playlistTitle = playlistTitle;
    }

    public String getPlaylistTitle(){
        return this.playlistTitle;
    }

    public void setTitle(String playlistTitle){
        this.playlistTitle = playlistTitle;
    }

    public void addSong(Song song){
        if(!this.songs.contains(song)){
            this.songs.add(song);
        }
    }

    public void removeSong(String songTitle){
        int index = 0;
        for(Song song : this.songs){
            if(song.getSongName().equals(songTitle)){
                this.songs.remove(index);
                return;
            }
            index++;
        }
        //System.out.println("Couldn't find the song in the playlist");
    }

    public void swapSongs(Song song1, Song song2){
        if (!(this.songs.contains(song1) && this.songs.contains(song2))){
            // System.out.println("Can't find some song[s] to swap");
        } else {
            int indexOfSong2 = this.songs.indexOf(song2);
            this.songs.set(songs.indexOf(song1), song2);
            this.songs.set(indexOfSong2, song1);
        }
    }

    public String getDuration(){
        int min = 0;
        int sec = 0;
        for (Song song : songs){
            int minCurr;
            int secCurr;
            String currSongDuration = song.getDuration();
            if(currSongDuration.substring(0, currSongDuration.indexOf(":")).equals("00"))
                minCurr = 0;
            else if(currSongDuration.substring(0, currSongDuration.indexOf(":")).equals("0\\d"))
                minCurr = Integer.parseInt(currSongDuration.substring(1, currSongDuration.indexOf(":")));
            else
                minCurr = Integer.parseInt(currSongDuration.substring(0, currSongDuration.indexOf(":")));

            if(currSongDuration.substring(currSongDuration.indexOf(":") + 1).equals("00"))
                secCurr = 0;
            else if(currSongDuration.substring(currSongDuration.indexOf(":") + 1).equals("0\\d"))
                secCurr = Integer.parseInt(String.valueOf(currSongDuration.charAt(4)));
            else
                secCurr = Integer.parseInt(currSongDuration.substring(currSongDuration.indexOf(":") + 1));

            sec += secCurr;
            min += minCurr + (sec / 60);
            sec %= 60;
        }
        return (min + " min" + ", " + sec +" sec");
    }
    public void sortSongs(){
        Song[] songsArr = this.songs.toArray(new Song[0]);
        java.util.Arrays.sort(songsArr);
        this.songs = new ArrayList<Song>(Arrays.asList(songsArr));
    }

    public String toString(){
        String message = this.playlistTitle + " - " + this.getDuration();
        int count = 1;
        for(Song song : this.songs){
            message += "\n" + count++ + ". " + song.toString();
        }
        return message;
    }
}
