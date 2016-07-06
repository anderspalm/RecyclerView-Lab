package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by andeski on 7/5/16.
 */
public class CustomViewHolderFirst extends RecyclerView.ViewHolder {

    TextView textView1a;
    TextView textView2a;
//    TextView textView1b;
//    TextView textView2b;
    Button buttona;
//    Button buttonb;

    public CustomViewHolderFirst (View itemView){
        super(itemView);

        textView1a = (TextView) itemView.findViewById(R.id.textView1a);
        textView2a = (TextView) itemView.findViewById(R.id.textView2a);
//        textView1b = (TextView) itemView.findViewById(R.id.textView1b);
//        textView2b = (TextView) itemView.findViewById(R.id.textView2b);
        buttona = (Button) itemView.findViewById(R.id.button1a);
//        buttonb = (Button) itemView.findViewById(R.id.button1b);

    }

}
