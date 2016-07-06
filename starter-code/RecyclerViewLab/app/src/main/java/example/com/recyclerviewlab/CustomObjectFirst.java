package example.com.recyclerviewlab;

/**
 * Created by andeski on 7/5/16.
 */
public class CustomObjectFirst {
    String mTitle;
    String mDescription;
    String mColor;

    public CustomObjectFirst(String color, String title, String description){
        mTitle = title;
        mDescription = description;
        mColor = color;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmColor() {
        return mColor;
    }

    public void setmColor(String mColor) {
        this.mColor = mColor;
    }

}
