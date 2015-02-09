package com.stfalcon.lostandfound;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Roody on 2/9/2015.
 */
public class NewActivity {

    /**
     * Created by Alexander Klimov on 01.12.2014.
     */
    public class AboutActivity extends Activity {

        @Override
        protected void onPostCreate(Bundle savedInstanceState) {
            super.onPostCreate(savedInstanceState);

            setContentView(R.layout.activity_new);
        }
    }
}
