package com.rahimnejhad.rtlNavigationDrawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;

import com.rahimnejhad.rtlNavigationDrawer.utility.NavigationDrawer;

public class MainActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar mToolbar;

    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar=findViewById(R.id.toolbar);

        mDrawerLayout=findViewById(R.id.drawer_layout);

        NavigationDrawer mNavigationDrawer=new NavigationDrawer();
        mDrawerToggle=mNavigationDrawer.init(MainActivity.this,mDrawerLayout,mToolbar);

        //open drawer
//        mDrawerLayout.openDrawer(Gravity.END);

        //close drawer
//        mDrawerLayout.closeDrawer(Gravity.END);

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mDrawerLayout.closeDrawers();
    }
}
