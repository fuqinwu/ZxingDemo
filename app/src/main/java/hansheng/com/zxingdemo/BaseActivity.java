package hansheng.com.zxingdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by hansheng on 2015/12/30.
 */
public class BaseActivity extends AppCompatActivity {


    protected void onPreCreate() {
        final Theme currentTheme = PreferenceManager.getCurrentTheme(this);

        switch (currentTheme) {
            case Blue:
                this.setTheme(R.style.BlueTheme);
                break;
            case Green:
                this.setTheme(R.style.GreenTheme);
                break;
            case Red:
                this.setTheme(R.style.RedTheme);
                break;
            case Indigo:
                this.setTheme(R.style.IndigoTheme);
                break;
            case BlueGrey:
                this.setTheme(R.style.BlueGreyTheme);
                break;
            case Black:
                this.setTheme(R.style.BlackTheme);
                break;
            case Orange:
                this.setTheme(R.style.OrangeTheme);
                break;
            case Purple:
                this.setTheme(R.style.PurpleTheme);
                break;
            case Pink:
                this.setTheme(R.style.PinkTheme);
                break;
            default:
                this.setTheme(R.style.BlueTheme);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        onPreCreate();
        super.onCreate(savedInstanceState);
    }

    public Context getContext() {
        return this;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
