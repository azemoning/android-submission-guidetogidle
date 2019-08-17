package me.saufi.guidetogi_dle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMembers;
    private ArrayList<Members> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMembers = findViewById(R.id.rv_main);
        rvMembers.setHasFixedSize(true);

        list.addAll(MembersData.getListData());

        showRecyclerList();


    }

    //Add about button to actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about_button:
                Intent aboutIntent = new Intent (this, AboutActivity.class);
                startActivity(aboutIntent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            default:
                return super.onOptionsItemSelected(item);


        }
        return false;
    }

    private void showRecyclerList(){
        rvMembers.setLayoutManager(new LinearLayoutManager(this));
        ListMembersAdapter listMembersAdapter = new ListMembersAdapter(list);
        rvMembers.setAdapter(listMembersAdapter);
    }
}
