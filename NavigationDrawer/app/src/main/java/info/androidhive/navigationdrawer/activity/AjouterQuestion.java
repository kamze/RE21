package info.androidhive.navigationdrawer.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import info.androidhive.navigationdrawer.R;

public class AjouterQuestion extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_addquestion);
        EditText editText = (EditText)findViewById(R.id.editTextquestion);
        editText.setSelection(0);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            // finish the activity
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.publier:
                Log.d("publier", "test publier");
                Snackbar.make(view, "La demande est passé à la verification par l'administrateur", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;

            default:
                break;
        }
    }
}
