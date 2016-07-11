package example.com.recyclerviewlab;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerViewAccessibilityDelegate;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;

public class SecondaryActivity extends AppCompatActivity {

    Button mAddItems;
    TextView mItemTitle;
    TextView mItemDescription;
    String mtitle;
    String mdescription;
    String mlistTitle;
    Button mbuttonRemoveItem;

    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_secondary);
        mItemTitle = (TextView) findViewById(R.id.textView1b);
        mItemDescription = (TextView) findViewById(R.id.textView2b);
        mAddItems = (Button) findViewById(R.id.add_items);
        mbuttonRemoveItem = (Button) findViewById(R.id.buttonRemoveItem);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        mAddItems = (Button) findViewById(R.id.add_items);
//
//       final List<CustomObjectSecond> customObjectList2 = new ArrayList<>();
            Singleton single = Singleton.getInstance();
            Intent intent = getIntent();
            final int position = intent.getIntExtra("key", -10);
//            if (position >= 0) {
            final CustomObjectFirst currentList = single.getArrayList().get(position);
//          finished creating the new intane and assigning the Custom object to it

            final CustomRecyclerViewAdapterSecond adapterSecond = new CustomRecyclerViewAdapterSecond(currentList.grabSecondsInfo(), false);
            mRecyclerView.setAdapter(adapterSecond);

           final Singleton singleton = Singleton.getInstance();

//            final ArrayList<> name = temp.getArrayList().get(position);

            mAddItems = (Button) findViewById(R.id.add_items);

        CustomObjectFirst name = new CustomObjectFirst();


            mAddItems.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(SecondaryActivity.this);
                    LayoutInflater inflater = getLayoutInflater();
                    View inflated = inflater.inflate(R.layout.alert2, null);
                    builder.setView(inflated);

                    final EditText mEditTextOne = (EditText) inflated.findViewById(R.id.add_block1b);
                    final EditText mEditTextTwo = (EditText) inflated.findViewById(R.id.add_block2b);

                    builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            if (mEditTextOne.getText().toString() != null && mEditTextTwo.getText().toString() != null) {

                                String one = mEditTextOne.getText().toString();
                                String two = mEditTextTwo.getText().toString();
                                currentList.msetArrayitem(one,two);

                                adapterSecond.notifyDataSetChanged();
                            } else {
                                mEditTextOne.setError("Hello");
                            }
                        }
                    });
                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    builder.setTitle("New Items");
                    AlertDialog bundlr = builder.create();
                    bundlr.show();
                }
            });
//        }
//        else {
//            finish();
//        }
    }
}
