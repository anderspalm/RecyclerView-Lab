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

//    TextView textView1aS;
//    TextView textView2aS;
    TextView textView1b;
    TextView textView2b;
//    Button buttonaS;
    Button buttonbS;
    CheckBox checkboxb;

    public CustomViewHolderSecond (View itemView){
        super(itemView);

//        textView1aS = (TextView) itemView.findViewById(R.id.textView1aS);
//        textView2aS = (TextView) itemView.findViewById(R.id.textView2aS);
        textView1b = (TextView) itemView.findViewById(R.id.textView1b);
        textView2b = (TextView) itemView.findViewById(R.id.textView2b);
//        buttonaS = (Button) itemView.findViewById(R.id.button1aS);
        buttonbS = (Button) itemView.findViewById(R.id.button1b);
        checkboxb = (CheckBox) itemView.findViewById(R.id.check_box);

    }


}
