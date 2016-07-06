package example.com.recyclerviewlab;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.List;

/**
 * Created by andeski on 7/5/16.
 */
public class CustomRecyclerViewAdapterSecond extends RecyclerView.Adapter<CustomViewHolderSecond> {

    List<CustomObjectSecond> mcustomObjectSeconds;

    public CustomRecyclerViewAdapterSecond(List<CustomObjectSecond> name, boolean check){
        mcustomObjectSeconds = name;

    }

    public CustomViewHolderSecond onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View word = inflater.inflate(R.layout.custom_secondary, (ViewGroup) parent, false);
        CustomViewHolderSecond viewHolderSecond = new CustomViewHolderSecond(word);
        return  viewHolderSecond;
    }

    @Override
    public int getItemCount() {
        return mcustomObjectSeconds.size();
    }

    public void onBindViewHolder(final CustomViewHolderSecond holder, final int position) {
        holder.textView2b.setText(mcustomObjectSeconds.get(position).getmDescription());
        holder.textView1b.setText(mcustomObjectSeconds.get(position).getmTitle());
        holder.buttonbS.setBackgroundColor(Color.parseColor(mcustomObjectSeconds.get(position).getmColor()));
        holder.checkboxb.setChecked(mcustomObjectSeconds.get(position).getmcheck());


        final int myPosition = position;
//         We now have an object that comes from the list
//        CustomObjectSecond customObject = CustomObjectSecondList.get(position);

        holder.checkboxb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            if (holder.checkboxb.isChecked()) {
                mcustomObjectSeconds.get(position).setmcheck(true);
                holder.checkboxb.setChecked(true);
                Toast.makeText(view.getContext(), "You checked the checkbox" + position, Toast.LENGTH_SHORT).show();
                }
            else {
                mcustomObjectSeconds.get(position).setmcheck(true);
                holder.checkboxb.setChecked(false);
                Toast.makeText(view.getContext(), "You unchecked the checkbox" + position, Toast.LENGTH_SHORT).show();
            }
            }
        });
    }
}
