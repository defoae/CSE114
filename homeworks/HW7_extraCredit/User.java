import java.util.ArrayList;

public class User {
    private String userName;
    private ArrayList<Playlist> playlists = new ArrayList<Playlist>();

    public User(){

    }

    public User(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void addPlaylist(Playlist playlist){
        if(this.playlists.contains(playlist))
            System.out.println("Playlist is already in the list");
        else
            this.playlists.add(playlist);
    }

    public void removePlaylist(String playlistTitle){
        int index = 0;
        for(Playlist playlist : this.playlists){
            if(playlist.getPlaylistTitle().equals(playlistTitle)){
                this.playlists.remove(index);
                return;
            }
            index++;
        }
        System.out.println("Couldn't find the playlist");
    }

    public ArrayList<Playlist> getAllPlaylists(){
        return this.playlists;
    }

    public Playlist getPlaylist(String playlistTitle){
        int index = 0;
        for(Playlist playlist : this.playlists){
            if(playlist.getPlaylistTitle().equals(playlistTitle)){
                return this.playlists.get(index);
            }
            index++;
        }
        return null;
    }

    public void makeCollaborativePlaylist(String playlistTitle, User friend){
        if(this.playlists.contains(this.getPlaylist(playlistTitle)))
            friend.addPlaylist(this.getPlaylist(playlistTitle));
    }

    public String toString(){
        String message = "User: " + this.getUserName() + ", Playlists: ";
        for(Playlist p : this.playlists){
            message += "\n" + p.toString();
        }
        return message;
    }
}
