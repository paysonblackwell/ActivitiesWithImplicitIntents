package itad299.lwtech.activitieswithimplicitintents;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SelectTimer(View v){
        Intent intent = new Intent(this, TimerActivity.class);
        startActivity(intent);
    }

    public void SelectAlarm(View v){
        Intent intent = new Intent(this, AlarmActivity.class);
        startActivity(intent);
    }

    public void SelectText(View v){
        Intent intent = new Intent(this, TextMessageActivity.class);
        startActivity(intent);
    }

}
