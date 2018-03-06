package com.rahimnejhad.rtlNavigationDrawer.utility;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Gravity;
import android.view.View;

import com.rahimnejhad.rtlNavigationDrawer.R;

/**
 * Created by Rahimnejhad on 3/6/2018.
 */

public class NavigationDrawer {

    public ActionBarDrawerToggle init(Activity mContext, final DrawerLayout mDrawerLayout, final android.support.v7.widget.Toolbar mToolbar)
    {
        ActionBarDrawerToggle mDrawerToggle= new ActionBarDrawerToggle(mContext,mDrawerLayout,mToolbar, R.string.app_name,R.string.app_name)
        {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

        };

        mDrawerLayout.addDrawerListener(mDrawerToggle);

        //support rtl navigation Drawer
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mDrawerLayout.isDrawerOpen((Gravity.END)))
                    mDrawerLayout.closeDrawer(Gravity.END);
                else
                    mDrawerLayout.openDrawer(Gravity.END);
            }
        });

        return mDrawerToggle;
    }

}
