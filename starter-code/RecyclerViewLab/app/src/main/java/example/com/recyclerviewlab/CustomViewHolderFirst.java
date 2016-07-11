package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by andeski on 7/5/16.
 */
public class CustomViewHolderFirst extends RecyclerView.ViewHolder {

    TextView textView1a;
    TextView textView2a;
    Button mbuttonRemove;
    Button mAddItems;
    CheckBox mCheckCompleted;
    Button mbuttonRemoveAll;


        public CustomViewHolderFirst (View itemView){
        super(itemView);


        textView1a = (TextView) itemView.findViewById(R.id.textView1a);
        textView2a = (TextView) itemView.findViewById(R.id.textView2a);
        mbuttonRemove = (Button) itemView.findViewById(R.id.buttonRemove);
        mAddItems = (Button) itemView.findViewById(R.id.add_items);
        mCheckCompleted = (CheckBox) itemView.findViewById(R.id.check_box1);
        mbuttonRemoveAll = (Button) itemView.findViewById(R.id.buttonRemoveAll);

    }

}
