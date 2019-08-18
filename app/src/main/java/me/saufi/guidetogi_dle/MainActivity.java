package me.saufi.guidetogi_dle;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


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

            case R.id.about_gidle_button:
                AlertDialog.Builder builder
                        = new AlertDialog.Builder(MainActivity.this);

                builder.setTitle("About (G)I-DLE");
                builder.setMessage("G)I-DLE (Hangul: (여자)아이들; RR: Yeoja Aideul; lit. Young Girls / Individual Girls; short for Girl-Idle) is a South Korean girl group formed by Cube Entertainment in 2018. The group consists of six members: Miyeon, Minnie, Soojin, Soyeon, Yuqi, and Shuhua. The group debuted on May 2, 2018 with their first extended play titled \"I Am\".");
                builder.setCancelable(false);

                builder.setPositiveButton(
                        "OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                //Just do nothing hehe
                            }
                        }
                );

                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            default:
                return super.onOptionsItemSelected(item);


        }
        return false;
    }

    private void showRecyclerList(){
        rvMembers.setLayoutManager(new LinearLayoutManager(this));
        ListMembersAdapter listMembersAdapter = new ListMembersAdapter(list);
        rvMembers.setAdapter(listMembersAdapter);

        listMembersAdapter.setOnItemClickCallback(new ListMembersAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Members data) {
                showSelectedMember(data);
            }
        });
    }

    private void showSelectedMember(Members members) {
        Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
        detailIntent.putExtra(DetailActivity.EXTRA_DETAIL, members.getDetail());
        detailIntent.putExtra(DetailActivity.EXTRA_IMAGE, members.getPhoto());
        detailIntent.putExtra(DetailActivity.EXTRA_INFORMATION, members.getInformation());
        detailIntent.putExtra(DetailActivity.EXTRA_CONTENT, members.getContent());
        startActivity(detailIntent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
