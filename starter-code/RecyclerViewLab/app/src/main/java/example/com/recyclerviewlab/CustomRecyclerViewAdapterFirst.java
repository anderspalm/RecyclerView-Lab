package example.com.recyclerviewlab;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by andeski on 7/5/16.
 */
public class CustomRecyclerViewAdapterFirst extends RecyclerView.Adapter<CustomViewHolderFirst> {


    ArrayList<CustomObjectFirst> mCustomObjectFirst;


    public CustomRecyclerViewAdapterFirst(ArrayList<CustomObjectFirst> customObjectFirsts){
        // instantiating the list
        mCustomObjectFirst = customObjectFirsts;
    }

    public CustomViewHolderFirst onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflating the Recycler View
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View word = inflater.inflate(R.layout.custom_primary, parent, false);
        CustomViewHolderFirst viewHolderFirst = new CustomViewHolderFirst(word);
        return viewHolderFirst;
    }

    @Override
    public void onBindViewHolder(CustomViewHolderFirst holder, final int position) {
        holder.textView2a.setText(mCustomObjectFirst.get(position).getmDescription());
        holder.textView1a.setText(mCustomObjectFirst.get(position).getmTitle());

        holder.mbuttonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCustomObjectFirst.remove(position);
                notifyItemRemoved(position);
                Toast.makeText(view.getContext(), "You removed " + position, Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent i = new Intent(view.getContext(), SecondaryActivity.class);
                i.putExtra("key", position);
                view.getContext().startActivity(i);

                Toast.makeText(view.getContext(), "List " + position, Toast.LENGTH_SHORT).show();
                return true;
            }
        });


        holder.mCheckCompleted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Checked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mCustomObjectFirst.size();
    }
}
