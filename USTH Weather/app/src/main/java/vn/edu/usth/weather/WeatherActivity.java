package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {

    public WeatherActivity() {
        super();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("weather", "onStart here");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("weather", "onStop here");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("weather", "onDestroy here");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("weather", "onResume here");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("weather", "onPause here");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main, firstFragment).commit();
    }
}