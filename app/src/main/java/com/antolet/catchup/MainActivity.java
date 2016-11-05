package com.antolet.catchup;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.common.view.SlidingTabLayout;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class MainActivity extends ActionBarActivity {

	private CallbackManager callBackManager;
	private DrawerLayout mDrawerLayout;
	private LinearLayout mDrawer;
	private ActionBarDrawerToggle mDrawerToggle;
    private ActionBar actionBar;

	private ViewPager mViewPager;
    private SlidingTabLayout mSlidingTabLayout;

	// Titoli delle tab
	private String[] tabsTitles = {"Home", "NearBy You", "CatchUP points", "Archievements"};


	@Override
	protected void onCreate(Bundle savedInstanceState) {

		FacebookSdk.sdkInitialize(getApplicationContext());
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//costruzione actionBar

		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeAsUpIndicator(R.drawable.logo_back);
		getSupportActionBar().setDisplayShowTitleEnabled(false);

		Window window = this.getWindow();
		window.setStatusBarColor(this.getResources().getColor(R.color.statusColor));
		final TextView testoFrag = (TextView)findViewById(R.id.textName);

		//Fragment sx
		mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
		mDrawer = (LinearLayout)findViewById(R.id.drawer);
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
		mDrawerLayout.setBackgroundResource(R.drawable.drawer);

		mDrawerToggle = new ActionBarDrawerToggle(
				this,
				mDrawerLayout,
				R.drawable.logo,
				R.string.drawer_open,
				R.string.drawer_close) {

			//mettere i metodi privati per set-up grafica -> farli parlare con il logger

			public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
			}

			public void onDrawerOpened(View drawerView) {
				//super.onDrawerOpened(drawerView);
				drawerView= getLayoutInflater().inflate(R.layout.fragment_content, null);
				LoginButton loginButton = (LoginButton) drawerView.findViewById(R.id.login_button);
				loginButton.setReadPermissions("email");

				callBackManager = CallbackManager.Factory.create();

				loginButton.registerCallback(callBackManager, new FacebookCallback<LoginResult>() {

					@Override
					public void onSuccess(LoginResult loginResult) {

						Profile profile = Profile.getCurrentProfile();
						String  idUtente= profile.getId();

						String msgWelcome = "Benvenuto " + profile.getFirstName() + "!";
						String infoUser= "\n \n id: "+ idUtente;
						testoFrag.setText(msgWelcome + infoUser);


					}

					@Override
					public void onCancel() {

						//TODO

					}

					@Override
					public void onError(FacebookException exception) {

						//TODO

					}


				});


			}
		};
		
		mDrawerLayout.setDrawerListener(mDrawerToggle);
		actionBar = getSupportActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ed4949")));
        // ViewPager -> tabSlide
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), tabsTitles));

        mSlidingTabLayout = (SlidingTabLayout) findViewById(R.id.sliding_tabs);
        mSlidingTabLayout.setViewPager(mViewPager);
    }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == android.R.id.home) {
			if (mDrawerLayout.isDrawerOpen(mDrawer)) {
				mDrawerLayout.closeDrawer(mDrawer);
			} else {
				mDrawerLayout.openDrawer(mDrawer);
			}
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		mDrawerToggle.syncState();
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

	//per Login su Facebook
	@Override
	protected void onActivityResult ( int requestCode, int resultCode, Intent data){
		super.onActivityResult(requestCode, resultCode, data);
		callBackManager.onActivityResult(requestCode, resultCode, data);

	}

}
