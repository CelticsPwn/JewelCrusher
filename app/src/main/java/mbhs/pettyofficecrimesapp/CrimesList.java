package mbhs.pettyofficecrimesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CrimesList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crimes_list);
    }

    public void openSubmitCrime(View v)    {
        Intent open = new Intent(this, SubmitCrime.class);
        startActivity(open);
        finish();
    }

    public void onNewIntent() {
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("culprit");
        TextView culprit = new TextView(CrimesList.this);
        culprit.setText(name);
        RelativeLayout list = (RelativeLayout) findViewById(R.id.activity_crimes_list);
        list.addView(culprit);
    }
}
