import java.util.HashMap;
import java.util.Map;

class Film {
    private int duration;
    private String title;
    private boolean watched;
    public Film(int duration, String title, boolean watched) {
        this.duration = duration;
        this.title = title;
        this.watched = watched;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public void displayDetails() {
        System.out.println("Film{" +
                "duration=" + duration +
                ", title='" + title + '\'' +
                ", watched=" + watched +
                '}');
    }
}

class Horror extends Film {
    public final String type = "Horror";
    public Horror(int duration, String title, boolean watched) {
        super(duration, title, watched);
    }

    public String getType() {
        return type;
    }

    public void displayDetails() {
        System.out.println("Title: " + getTitle() + ", Duration: " + getDuration() + ", Type: " + getType() + ", Watched: " + isWatched());
    }
}

class Comedy extends Film {
    public final String type = "Comedy";

    public Comedy(int duration, String title, boolean watched) {
        super(duration, title, watched);
    }

    public String getType() {
        return type;
    }

    public void displayDetails() {
        System.out.println("Title: " + getTitle() + ", Duration: " + getDuration() + ", Type: " + getType() + ", Watched: " + isWatched());
    }
}

class Main {
    private Map < Integer, Film > privateCollection = new HashMap < > ();
    public Main() {
        privateCollection.put(1, new Horror(120, "Scary Movie", true));
        privateCollection.put(2, new Comedy(100, "The Hangover", false));
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.displayCollection();
    }

    public Map < Integer, Film > getPrivateCollection() {
        return privateCollection;
    }

    public void setPrivateCollection(Map < Integer, Film > privateCollection) {
        this.privateCollection = privateCollection;
    }

    public void displayCollection() {
        for (Map.Entry < Integer, Film > entry: privateCollection.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            entry.getValue().displayDetails();
        }
    }
}