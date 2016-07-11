package example.com.recyclerviewlab;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andeski on 7/5/16.
 */
public class CustomRecyclerViewAdapterSecond extends RecyclerView.Adapter<CustomViewHolderSecond> {

    ArrayList<CustomObjectSecond> marrayitem;

    public CustomRecyclerViewAdapterSecond(ArrayList<CustomObjectSecond> arrayitem, boolean b) {
        marrayitem = arrayitem;
    }

    @Override
    public CustomViewHolderSecond onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View word = inflater.inflate(R.layout.custom_secondary, parent, false);
        CustomViewHolderSecond viewHolderSecond = new CustomViewHolderSecond(word);
        return viewHolderSecond;
    }

    @Override
    public void onBindViewHolder(CustomViewHolderSecond holder, int position) {
        String a = marrayitem.get(position).getmTitle();
        String b = marrayitem.get(position).getmDescription();
        holder.textView1b.setText(a);
        holder.textView2b.setText(b);

//        holder.mbuttonRemoveItem.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                marrayitem.removeAll(marrayitem);
//                notifyDataSetChanged();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return marrayitem.size();
    }

}
