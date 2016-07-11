package example.com.recyclerviewlab;

import java.util.ArrayList;

/**
 * Created by andeski on 7/7/16.
 */
public class Singleton {

    private static Singleton singleton;

    // setting the arrays in Singleton Class
    ArrayList<CustomObjectFirst> arrayList;

    //set array list
    private void setArrayList(ArrayList<CustomObjectFirst> arrayList) {
        this.arrayList = arrayList;
    }

    // get array list
    public ArrayList<CustomObjectFirst> getArrayList() {
        return arrayList;
    }

    private Singleton() {
        arrayList = new ArrayList<>();
    }

    /* Because we have the array of objects in this singleton class we can populate the
    array here with the instances of the object's class and create a method of it */
    public void addItems(String title, String description) {
        arrayList.add( new CustomObjectFirst (title, description));
    }



    /*  check if there is a current singleton instance occurring as we only want
        one for performance reasons */
    public static synchronized Singleton getInstance( ) {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

}
