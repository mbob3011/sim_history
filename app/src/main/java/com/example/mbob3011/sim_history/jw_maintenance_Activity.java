package com.example.mbob3011.sim_history;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class jw_maintenance_Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    String user;
    String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jw_maintenance);

        Intent intent = getIntent();
        user = intent.getStringExtra("username");
        pass = intent.getStringExtra("password");


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        View hView =  navigationView.inflateHeaderView(R.layout.nav_header_main);
        TextView nav_user = (TextView)hView.findViewById(R.id.textView1);
        nav_user.setText(user);
        TextView nav_pass = (TextView)hView.findViewById(R.id.textView2);
        nav_pass.setText(pass);

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
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();

        if (id == R.id.nav_home) {

            Intent intent = new Intent(jw_maintenance_Activity.this, MainActivity.class);
            intent.putExtra("username", user.toString());
            intent.putExtra("password", pass.toString());
            startActivity(intent);

        } else if (id == R.id.nav_jw_kerja) {

            Intent intent = new Intent(jw_maintenance_Activity.this, jw_kerja_Activity.class);
            intent.putExtra("username", user.toString());
            intent.putExtra("password", pass.toString());
            startActivity(intent);

        } else if (id == R.id.nav_jw_maintenance) {

            Intent intent = new Intent(jw_maintenance_Activity.this, jw_maintenance_Activity.class);
            intent.putExtra("username", user.toString());
            intent.putExtra("password", pass.toString());
            startActivity(intent);

        } else if (id == R.id.nav_gallery) {

            Intent intent = new Intent(jw_maintenance_Activity.this, GalleryActivity.class);
            intent.putExtra("username", user.toString());
            intent.putExtra("password", pass.toString());
            startActivity(intent);

        } else if (id == R.id.nav_about) {

            Intent intent = new Intent(jw_maintenance_Activity.this, AboutActivity.class);
            intent.putExtra("username", user.toString());
            intent.putExtra("password", pass.toString());
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}
