package example.com.recyclerviewlab;

import android.widget.CheckBox;

import java.util.ArrayList;

/**
 * Created by andeski on 7/5/16.
 */
public class CustomObjectFirst {
    String mTitle;
    String mDescription;

    ArrayList<CustomObjectSecond> mArrayItem;

    /* Because we have access to the second object through the instantiation of the array in this
    screenm we can greate an setter method and populate with instances of that object's class
     */
    public void msetArrayitem(String title, String description){
        mArrayItem.add(new CustomObjectSecond(title,description));
    }

    public ArrayList<CustomObjectSecond> getmArrayItem() {
        return mArrayItem;
    }

    public CustomObjectFirst(String title, String description) {
        mTitle = title;
        mDescription = description;
        mArrayItem = new ArrayList<>();
    }

    public ArrayList<CustomObjectSecond> grabSecondsInfo(){
        return mArrayItem;
    }

    public CustomObjectFirst() {}

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

    public void removeAllItems(){
        mArrayItem.removeAll(mArrayItem);
    }


}
