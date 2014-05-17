package progress.menu.item.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import progress.menu.item.ProgressMenuItemHelper;

public class MainActivity extends ActionBarActivity {

    private ProgressMenuItemHelper progressHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.refresh_menu, menu);
        progressHelper = new ProgressMenuItemHelper(menu, R.id.action_refresh, true);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_refresh:
                new ReloadAsyncTask(progressHelper).execute();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}