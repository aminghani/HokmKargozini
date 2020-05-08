package Employee;

import javafx.geometry.Pos;

public class PostSazmani {
    String onvanPost;
    int shomare;

    public PostSazmani(String onvanPost, int shomare) {
        this.onvanPost = onvanPost;
        this.shomare = shomare;
    }

    public PostSazmani(){

    }

    public String getOnvanPost() {
        return onvanPost;
    }

    public void setOnvanPost(String onvanPost) {
        this.onvanPost = onvanPost;
    }

    public int getShomare() {
        return shomare;
    }

    public void setShomare(int shomare) {
        this.shomare = shomare;
    }
}
