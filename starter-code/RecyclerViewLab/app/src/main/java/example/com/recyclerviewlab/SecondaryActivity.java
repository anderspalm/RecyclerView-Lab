package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondaryActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

    mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_secondary);
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
    mRecyclerView.setLayoutManager(linearLayoutManager);


        List<CustomObjectSecond> customObjectList2 = new ArrayList<>();
        customObjectList2.add(new CustomObjectSecond("A list 1", "description1","#992600"));
        customObjectList2.add(new CustomObjectSecond("A list 2", "description2","#669900"));
        customObjectList2.add(new CustomObjectSecond("A list 3", "description3","#669900"));
        customObjectList2.add(new CustomObjectSecond("A list 4", "description4","#669900"));
        customObjectList2.add(new CustomObjectSecond("A list 5", "description5","#669900"));
        customObjectList2.add(new CustomObjectSecond("A list 6", "description6","#992600"));
        customObjectList2.add(new CustomObjectSecond("A list 7", "description7","#669900"));
        customObjectList2.add(new CustomObjectSecond("A list 8", "description8","#669900"));
        customObjectList2.add(new CustomObjectSecond("A list 9", "description9","#669900"));
        customObjectList2.add(new CustomObjectSecond("A list 10", "description10","#669900"));


        CustomRecyclerViewAdapterSecond adapterFirst = new CustomRecyclerViewAdapterSecond(customObjectList2, false);
        mRecyclerView.setAdapter(adapterFirst);
    }

}
