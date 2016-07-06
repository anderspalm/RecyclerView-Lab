package example.com.recyclerviewlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_main);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        List<CustomObjectFirst> customObjectList1 = new ArrayList<>();
        customObjectList1.add(new CustomObjectFirst("#669900", "title1", "description1"));
        customObjectList1.add(new CustomObjectFirst("#669900", "title2", "description2"));
        customObjectList1.add(new CustomObjectFirst("#669900", "title3", "description3"));
        customObjectList1.add(new CustomObjectFirst("#669900", "title4", "description4"));
        customObjectList1.add(new CustomObjectFirst("#669900", "title5", "description5"));
        customObjectList1.add(new CustomObjectFirst("#669900", "title6", "description6"));
        customObjectList1.add(new CustomObjectFirst("#669900", "title7", "description7"));
        customObjectList1.add(new CustomObjectFirst("#669900", "title8", "description8"));
        customObjectList1.add(new CustomObjectFirst("#669900", "title9", "description9"));
        customObjectList1.add(new CustomObjectFirst("#669900", "title10", "description10"));


        CustomRecyclerViewAdapterFirst adapterFirst = new CustomRecyclerViewAdapterFirst(customObjectList1);
        mRecyclerView.setAdapter(adapterFirst);

    }
    public void sendMessage(View view) {
        Intent intent = new Intent(MainActivity.this,SecondaryActivity.class);
        startActivity(intent);
    }
}
