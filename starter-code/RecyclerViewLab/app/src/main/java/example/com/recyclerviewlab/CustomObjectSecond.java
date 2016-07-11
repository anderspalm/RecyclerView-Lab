package example.com.recyclerviewlab;

/**
 * Created by andeski on 7/5/16.
 */
public class CustomObjectSecond {
    String mTitle;
    String mDescription;
    String mListName;
    Boolean mcheck;
    String mListTitle;

    public CustomObjectSecond(String title, String description){
        mTitle = description;
        mDescription = title;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String title){
        mTitle = title;
    }

    public String getmDescription(){
        return mDescription;
    }

    public void setmDescription(String description){
        mDescription = description;
    }

    public String getmListName(){
        return mListName;
    }

}
