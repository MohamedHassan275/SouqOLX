package com.mohmedhassan.souqolx;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeScreenActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TextView Tv_login_menu,Tv_register_menu;
    LinearLayout linearlayout_PropertiesAndBuild, linearLayout_Vehicles, linearlayout_mobils, linearlayout_electronic,
            linearlayout_homeAndGarden, linearlayout_fashions, linearlayout_kids, linearlayout_pets, linearlayout_SportingAndBikes,
            linearlayout_HobbiesAndMuisc, linearlayout_jobs, linearlayout_business, linearlayout_services;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        HomeScreenActivity.this.setTitle("OLX");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DivineView();
        SetonClickLisner();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void DivineView() {

        linearlayout_PropertiesAndBuild = findViewById(R.id.linearlayout_PropertiesAndBuild);
        linearLayout_Vehicles = findViewById(R.id.linearLayout_vehicles);
        linearlayout_mobils = findViewById(R.id.linearlayout_mobils);
        linearlayout_electronic = findViewById(R.id.linearlayout_electronic);
        linearlayout_homeAndGarden = findViewById(R.id.linearlayout_homeAndGarden);
        linearlayout_fashions = findViewById(R.id.linearlayout_fashions);
        linearlayout_kids = findViewById(R.id.linearlayout_kids);
        linearlayout_pets = findViewById(R.id.linearlayout_pets);
        linearlayout_SportingAndBikes = findViewById(R.id.linearlayout_sportingAndBikes);
        linearlayout_HobbiesAndMuisc = findViewById(R.id.linearlayout_HobbiesAndMuisc);
        linearlayout_jobs = findViewById(R.id.linearlayout_jobs);
        linearlayout_business = findViewById(R.id.linearlayout_business);
        linearlayout_services = findViewById(R.id.linearlayout_services);
        /*Tv_login_menu = findViewById(R.id.Tv_login_menu);
        Tv_register_menu = findViewById(R.id.Tv_register_menu);*/


    }

    private void SetonClickLisner() {

        linearlayout_PropertiesAndBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this, PropertiesAndBuildScreenActivity.class);
                startActivity(intent);

            }
        });
        linearLayout_Vehicles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,VehiclesActivity.class);
                startActivity(intent);

            }
        });
        linearlayout_mobils.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,MobileScreenActivity.class);
                startActivity(intent);

            }
        });
        linearlayout_electronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,ElectronicsScreenActivity.class);
                startActivity(intent);

            }
        });
        linearlayout_homeAndGarden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,HomeAndGardenScreenActivity.class);
                startActivity(intent);

            }
        });
        linearlayout_fashions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,FashionsAndBeautyScreenActivity.class);
                startActivity(intent);

            }
        });
        linearlayout_kids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,KidsScreenActivity.class);
                startActivity(intent);

            }
        });
        linearlayout_pets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,PetsScreenActivity.class);
                startActivity(intent);

            }
        });
        linearlayout_SportingAndBikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,SportingAndBikesScreenAcitivty.class);
                startActivity(intent);

            }
        });
        linearlayout_HobbiesAndMuisc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,HobbiesScreenActivity.class);
                startActivity(intent);

            }
        });
        linearlayout_jobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,JobsScreenActivity.class);
                startActivity(intent);

            }
        });
        linearlayout_business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,BusinessScreenActivity.class);
                startActivity(intent);

            }
        });
        linearlayout_services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,ServicesScreenActivity.class);
                startActivity(intent);

            }
        });
      /*  Tv_login_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,LoginActivity.class);
                startActivity(intent);

            }
        });
        Tv_register_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,RegisterActivity.class);
                startActivity(intent);

            }
        });*/


    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home_menu) {
          /*  Intent intent = new Intent(MainActivity.this,BuyAndSell.class);
            startActivity(intent);*/
        } else if (id == R.id.browse_menu) {
         /*   Intent intent = new Intent(MainActivity.this,About_Us.class);
            startActivity(intent);*/

        } else if (id == R.id.my_ads_menu) {
           /* Intent intent = new Intent(MainActivity.this,Country_Souq.class);
            startActivity(intent);*/

        } else if (id == R.id.chats_menu) {
          /*  Intent intent = new Intent(MainActivity.this,Login.class);
            startActivity(intent);*/

        } else if (id == R.id.favorites_menu) {
          /*  Intent intent = new Intent(MainActivity.this,Login.class);
            startActivity(intent);*/

        } else if (id == R.id.place_an_ad_menu) {
          /*  Intent intent = new Intent(MainActivity.this,Login.class);
            startActivity(intent);*/

        } else if (id == R.id.contact_menu) {
           /*  Intent intent = new Intent(MainActivity.this,Login.class);
            startActivity(intent);*/

        } else if (id == R.id.chate_with_us_menu) {
           /* Intent intent = new Intent(MainActivity.this,Register.class);
            startActivity(intent);*/

        } else if (id == R.id.choose_country_menu) {
           /* Intent intent = new Intent(MainActivity.this,Register.class);
            startActivity(intent);*/

        } else if (id == R.id.choose_language_menu) {
           /* Intent intent = new Intent(MainActivity.this,Register.class);
            startActivity(intent);*/

        } else if (id == R.id.about_app_menu) {
           /* Intent intent = new Intent(MainActivity.this,Register.class);
            startActivity(intent);*/

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
