package mbhs.pettyofficecrimesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SubmitCrime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_crime);
    }

    public void cancel(View v)    {
        Intent cancel = new Intent(this, CrimesList.class);
        finish();
    }

    public void submit(View v)  {
        Intent submit = new Intent(this, CrimesList.class);
        EditText culprit = (EditText) findViewById(R.id.editTextName);
        EditText time = (EditText) findViewById(R.id.editTextTime);
        EditText date = (EditText) findViewById(R.id.editTextDate);
        EditText crime = (EditText) findViewById(R.id.editTextCrime);

        submit.putExtra("culprit", culprit.toString());
        submit.putExtra("time", time.toString());
        submit.putExtra("date", date.toString());
        submit.putExtra("crime", crime.toString());

        startActivity(submit);
    }
}
