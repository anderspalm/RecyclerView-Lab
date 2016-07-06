package example.com.recyclerviewlab;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by andeski on 7/5/16.
 */
public class CustomRecyclerViewAdapterFirst extends RecyclerView.Adapter<CustomViewHolderFirst> {

    List<CustomObjectFirst> mcustomObjectFirst;

    public CustomRecyclerViewAdapterFirst(List<CustomObjectFirst> customObjectFirsts){
        mcustomObjectFirst = customObjectFirsts;
    }

    public CustomViewHolderFirst onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View word = inflater.inflate(R.layout.custom_primary, parent, false);
        CustomViewHolderFirst viewHolderFirst = new CustomViewHolderFirst(word);
        return viewHolderFirst;
    }

    @Override
    public int getItemCount() {
        return mcustomObjectFirst.size();
    }

    @Override
    public void onBindViewHolder(CustomViewHolderFirst holder, final int position) {

        holder.textView2a.setText(mcustomObjectFirst.get(position).getmDescription());
        holder.textView1a.setText(mcustomObjectFirst.get(position).getmTitle());
        holder.buttona.setBackgroundColor(Color.parseColor(mcustomObjectFirst.get(position).getmColor()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), "You clicked" + position, Toast.LENGTH_SHORT).show();
            }
        });

    }



}
