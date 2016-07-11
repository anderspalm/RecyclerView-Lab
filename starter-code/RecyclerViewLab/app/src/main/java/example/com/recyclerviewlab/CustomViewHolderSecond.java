package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by andeski on 7/5/16.
 */
public class CustomViewHolderSecond extends RecyclerView.ViewHolder {


    TextView textView1b;
    TextView textView2b;
    Button mAddItemss;
    Button mbuttonRemoveItem;

    public CustomViewHolderSecond (View itemView){
        super(itemView);

        textView1b = (TextView) itemView.findViewById(R.id.textView1b);
        textView2b = (TextView) itemView.findViewById(R.id.textView2b);
        mAddItemss = (Button) itemView.findViewById(R.id.add_items);
        mbuttonRemoveItem = (Button) itemView.findViewById(R.id.buttonRemoveItem);

    }


}
