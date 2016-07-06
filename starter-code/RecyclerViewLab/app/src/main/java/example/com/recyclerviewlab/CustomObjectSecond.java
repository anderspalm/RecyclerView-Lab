package example.com.recyclerviewlab;

/**
 * Created by andeski on 7/5/16.
 */
public class CustomObjectSecond {
    String mTitle;
    String mDescription;
    String mColor;
    Boolean mcheck;

    public CustomObjectSecond(String title, String description, String color){
        mTitle = description;
        mDescription = title;
        mColor = color;
        mcheck = false;
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

    public Boolean getmcheck(){
        return mcheck;
    }

    public void setmcheck(Boolean mcheck){
        this.mcheck = mcheck;
    }
}
