public class Song implements Comparable{
    private String songName;
    private String artistName;
    private String duration;

    public Song(){

    }

    public Song(String songName, String artistName, String duration){
        this.songName = songName;
        this.artistName = artistName;
        this.duration = duration;
    }

    public String getSongName(){
        return this.songName;
    }

    public String getDuration(){
        return this.duration;
    }

    public String getArtistName(){
        return this.artistName;
    }

    public int compareTo(Object o){
        if(o instanceof Song){
            Song g = (Song)o;
            if(this.songName.compareTo(g.songName) == 0){
                return this.artistName.compareTo(g.artistName);
            } else
                return this.songName.compareTo(g.songName);
        }
        else return -1;
    }

    public String toString(){
        return this.getSongName() + " by " + this.getArtistName() + " (" + this.getDuration() + ")";
    }
}
