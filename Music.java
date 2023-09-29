public class Music {
    private String title;
    private Artist artist;
    private double duration;
    private String genera;
    private String album;
    private Date releaseDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenera() {
        return genera;
    }

    public void setGenera(String genera) {
        this.genera = genera;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    Music(String title, Artist artist, double duration, String genera, String album, Date releaseDate) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genera = genera;
        this.album = album;
        this.releaseDate = releaseDate;
    }

    public String toString() {
        String artt = String.format("%-12s %14s  %.2f   %s  %-15s  %s",title,artist,duration,genera,album,releaseDate);
        return artt;
    }


}
