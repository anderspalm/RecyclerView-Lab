package example.com.recyclerviewlab;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button mAddLists;
    RecyclerView mRecyclerView;
    CheckBox mCheckCompleted;
    LinearLayout mItemView;
    Button mbuttonRemove;
    Button mbuttonRemoveAll;

    public static final CustomObjectFirst tool = new CustomObjectFirst();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCheckCompleted = (CheckBox) findViewById(R.id.check_box1);
        mItemView = (LinearLayout) findViewById(R.id.list_item_to_next_page);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_main);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        mRecyclerView.setLayoutManager(linearLayoutManager);

//      final List<CustomObjectFirst> customObjectList1 = new ArrayList<>();
//      customObjectList1.add(new CustomObjectFirst("#669900", "title1", "description1"));
        ArrayList<ArrayList> something = new ArrayList<>();
        Singleton singleton = Singleton.getInstance();

        // adding the array items to the recycle view for some reason

       final Singleton temp = Singleton.getInstance();
       final CustomRecyclerViewAdapterFirst adapterFirst = new CustomRecyclerViewAdapterFirst(temp.getArrayList());

//  CustomRecyclerViewAdapterFirst adapterFirst = new CustomRecyclerViewAdapterFirst();
        mRecyclerView.setAdapter(adapterFirst);
        mAddLists = (Button) findViewById(R.id.add_lists);
        mbuttonRemove = (Button) findViewById(R.id.buttonRemove);
        mbuttonRemoveAll = (Button) findViewById(R.id.buttonRemoveAll);



//  creating AlertDialog to capture TodoList title & Description
        mAddLists.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view) {
                final AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();

                dialogBuilder.setView(R.layout.alert);


                dialogBuilder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Dialog dialog = (Dialog) dialogInterface;

                        final EditText mEditTextOne = (EditText) dialog.findViewById(R.id.add_block1);
                        final EditText mEditTextTwo = (EditText) dialog.findViewById(R.id.add_block2);

                        String one = mEditTextOne.getText().toString().trim();
                        String two = mEditTextTwo.getText().toString().trim();;

                        if( one == "" || two == "") {
                            mEditTextOne.setError("Computer says no...");
                        }

                        else if(one.isEmpty() || two.isEmpty()){
                            mEditTextOne.setError("Nope");
                            mEditTextTwo.setError("Nope");
                        }

                        else{
                            temp.addItems(one, two);
                            adapterFirst.notifyDataSetChanged();
//                            dialogInterface.dismiss();
                        }
                    }
                });
                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                dialogBuilder.setTitle("New Todo List");

                final AlertDialog bundler = dialogBuilder.create();

                bundler.show();
//
//                bundler.setOnShowListener(new DialogInterface.OnShowListener(){
//                    @Override
//                    public void onShow(DialogInterface dialog) {
//                        bundler.getButton(DialogInterface.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
//
//                            @Override
//                            public void onClick(View view) {
//
//                                final EditText mEdittextOne = (EditText) view.findViewById(R.id.add_block1);
//                                final EditText mEdittextTwo = (EditText) view.findViewById(R.id.add_block2);
//                                if (mEdittextOne.getText().length() == 0 || mEdittextTwo.length() == 0) {
//                                    String one = mEdittextOne.toString().trim();
//                                    String two = mEdittextTwo.getText().toString().trim();
//
//                                    if (one == "" || two == "") {
//                                        mEdittextOne.setError("Computer says no...");
//                                    } else if (one.isEmpty() || two.isEmpty()) {
//                                        mEdittextOne.setError("Nope");
//                                        mEdittextTwo.setError("Nope");
//                                    } else {
//                                        temp.addItems(one, two);
//                                        adapterFirst.notifyDataSetChanged();
//                                    }
//                                }
//                            }
//
//                        });
//                    }
//                });


            }
        });
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(MainActivity.this,SecondaryActivity.class);
        startActivity(intent);
    }

    public static String getInstance(){
        return tool.getmDescription();
    }


    public String getItemIitle(){
        CustomObjectFirst name = new CustomObjectFirst();
        return name.getmTitle();
    }
    public String getItemDescription(){
        CustomObjectFirst name = new CustomObjectFirst();
        return name.getmDescription();
    }
}

