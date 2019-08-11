package me.saufi.guidetogi_dle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;

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

        showRecyclerCardView();
    }

    //Add about button to actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.about, menu);
        return true;
    }
    //TODO - ADD NEW ACTIVITY TO DISPLAY ABOUT DEVELOPER

    private void showRecyclerCardView() {
        rvMembers.setLayoutManager(new LinearLayoutManager(this));
        CardViewMembersAdapter cardViewMembersAdapter = new CardViewMembersAdapter(list);
        rvMembers.setAdapter(cardViewMembersAdapter);
    }
}
