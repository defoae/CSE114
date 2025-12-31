import java.util.ArrayList;

public abstract class MusicService {
    private static ArrayList<User> users = new ArrayList<User>();

    public MusicService(){

    }

    public MusicService(ArrayList<User> users){
        this.users = users;
    }

    public static void addUser(User user){
        if(users.contains(user))
            System.out.println("User is already in list of users");
        else
            users.add(user);
    }

    public static void remove(User user){
        if(users.contains(user))
            users.remove(user);
        else
            System.out.println("Coudln't find the user in list of users");
    }

    public static ArrayList<Playlist> getUserPlaylists(User user){
        if(users.contains(user))
            return user.getAllPlaylists();
        else{
            System.out.println("Couldn't find the user in the list of users");
            return null;
        }
    }

    public static void main(String[] args){
        User u0 = new User("Paul");
        User u1 = new User("Mary");
        MusicService.addUser(u0);
        MusicService.addUser(u1);
        Playlist p0 = new Playlist("Study Songs");
        u0.addPlaylist(p0);
        Song s1 = new Song("Studying1", "ABC", "3:00");
        p0.addSong(s1);
        Song s2 = new Song("Studying2", "XYZ", "4:50");
        p0.addSong(new Song("Studying3", "CDE", "2:50"));
        p0.addSong(new Song("Studying4", "EFG", "3:25"));
        System.out.println("ORIGINAL STUDY SONGS PLAYLIST BY "+u0.getUserName()+":");
        for(Playlist p : MusicService.getUserPlaylists(u0)) {
            System.out.println(p);
        }
        Playlist p1 = new Playlist("Workout Songs");
        u1.addPlaylist(p1);
        p1.addSong(new Song("Exercising1", "JKL", "3:00"));
        p1.addSong(new Song("Exercising2", "OPQRS", "2:50"));
        p1.addSong(new Song("Exercising3", "Wxyz", "4:35"));
        p1.addSong(new Song("Exercising3", "Stu", "3:25"));
        System.out.println("ORIGINAL STUDY SONGS PLAYLIST BY "+u1.getUserName()+":");
        for(Playlist p : MusicService.getUserPlaylists(u1)) {
           System.out.println(p);
        }
        u0.makeCollaborativePlaylist("Study Songs", u1);
        u0.getPlaylist("Study Songs").setTitle("Study Songs with "+u1.getUserName());
        u1.getPlaylist("Study Songs with "+u1.getUserName()).removeSong("Studying4");
        u1.getPlaylist("Study Songs with "+u1.getUserName()).addSong(s2);
        u1.getPlaylist("Study Songs with "+u1.getUserName()).swapSongs(s1, s2);
        u1.getPlaylist("Study Songs with "+u1.getUserName()).swapSongs(new Song("Does Not Exist", "In Playlist", "5:00"), s2);
        System.out.println("UPDATED PLAYLISTS BY "+u0.getUserName()+":");
        for(Playlist p : MusicService.getUserPlaylists(u1)) {
           System.out.println(p);
        }
        u0.getPlaylist("Study Songs with "+u1.getUserName()).sortSongs();
        u1.getPlaylist("Workout Songs").sortSongs();
        System.out.println("AFTER SORTING BOTH PLAYLISTS:");
        for(Playlist p : MusicService.getUserPlaylists(u1)) {
           System.out.println(p);
        }
    }
}
