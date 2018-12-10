package app.mrquan.frame_layout;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonShow;
    private Button buttonOneself;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOneself = findViewById(R.id.button_oneself);
        buttonShow = findViewById(R.id.button_show);
        buttonOneself.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager. beginTransaction();
                transaction.replace(R.id.upup, new OneselfFragment());
//                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager. beginTransaction();
                transaction.replace(R.id.upup, new ShowFragment());
//                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
    }
}
