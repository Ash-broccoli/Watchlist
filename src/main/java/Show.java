public class Show {
    private String title;
    private int amtSeasons;
    private int amtEpisodePerSeason;

    public Show(String title, int amtSeasons, int amtEpisodePerSeason) {
        this.title = title;
        this.amtSeasons = amtSeasons;
        this.amtEpisodePerSeason = amtEpisodePerSeason;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAmtSeasons() {
        return amtSeasons;
    }

    public void setAmtSeasons(int amtSeasons) {
        this.amtSeasons = amtSeasons;
    }

    public int getAmtEpisodePerSeason() {
        return amtEpisodePerSeason;
    }

    public void setAmtEpisodePerSeason(int amtEpisodePerSeason) {
        this.amtEpisodePerSeason = amtEpisodePerSeason;
    }

    @Override
    public String toString() {
        return title + ", Seasons: " + amtSeasons + ", Episodes per season: " + amtEpisodePerSeason;
    }
}
