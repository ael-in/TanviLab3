package tanvi.tanvi.s301044096;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class tanviActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.tanvi_bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.tanvi_draw:
                            selectedFragment = new tanvifragment();
                            break;
                        case R.id.tanvi_animate:
                            selectedFragment = new tanviifragment();
                            break;
                        case R.id.tanvi_transform:
                            selectedFragment = new s301044096fragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.tanvi_fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };
}