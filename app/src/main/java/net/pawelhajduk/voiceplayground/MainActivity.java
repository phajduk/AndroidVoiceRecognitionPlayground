package net.pawelhajduk.voiceplayground;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import com.google.android.gms.actions.SearchIntents;

/*
* Launch via:
* adb shell am start -a com.google.android.gms.actions.SEARCH_ACTION -e query myQuery net.pawelhajduk.voiceplayground
* */
public class MainActivity extends ActionBarActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();

        if (SearchIntents.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            textView.setText(query);
        }
    }
}
