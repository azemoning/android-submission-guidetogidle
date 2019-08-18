package me.saufi.guidetogi_dle;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_IMAGE = "extra_image";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_INFORMATION = "extra_information";
    public static final String EXTRA_CONTENT = "extra_content";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Member");
        }

        ImageView imageViewReceived = findViewById(R.id.member_detail_image);
        TextView textViewDetailReceived = findViewById(R.id.member_detail_description);
        TextView textViewInformationReceived = findViewById(R.id.member_detail_information);
        TextView textViewContentReceived = findViewById(R.id.member_detail_information_content);
        String image = getIntent().getStringExtra(EXTRA_IMAGE);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String information = getIntent().getStringExtra(EXTRA_INFORMATION);
        String content = getIntent().getStringExtra(EXTRA_CONTENT);

        Glide.with(this)
                .load(getIntent().getStringExtra(EXTRA_IMAGE))
                .apply(new RequestOptions().override(230,250))
                .into(imageViewReceived);

        textViewDetailReceived.setText(detail);
        textViewInformationReceived.setText(information);
        textViewContentReceived.setText(content);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
