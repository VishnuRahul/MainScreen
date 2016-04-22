package com.example.app.mains;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Adapter.*;
import android.view.View.OnClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] mobileArray = {"Navigation Drawer", "Use Floating Action Button", "View Images"};
        ListAdapter adaptr = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mobileArray);
        ListView listView2 = (ListView) findViewById(R.id.listView1);
        listView2.setAdapter(adaptr);

        listView2.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {https://github.com/VishnuRahul/MainScreen
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if(position==0)
                        {
                            Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.nav.example.app.navig");
                            startActivity(launchIntent);
                        }
                        if(position==1)
                        {
                            Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.fab.example.app.fab");
                            startActivity(launchIntent);
                        }

                        if(position==2)
                        {
                            Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.img.example.app.imageslider");
                            startActivity(launchIntent);
                        }

                    }
                }
        );

    }

}