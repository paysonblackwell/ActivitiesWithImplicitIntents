package itad299.lwtech.activitieswithimplicitintents;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class AlarmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
    }

    public void createAlarm(View v) {
        EditText editText = (EditText) findViewById(R.id.alarmHours);
        int hour = Integer.parseInt(editText.getText().toString());
        editText = (EditText) findViewById(R.id.alarmMinutes);
        int minutes = Integer.parseInt(editText.getText().toString());
        editText = (EditText) findViewById(R.id.alarmMessage);
        String message = editText.getText().toString();
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes)
                .putExtra(AlarmClock.EXTRA_SKIP_UI, true);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}