package com.example.justi.todaytv;

import android.net.Uri;

/**
 * Created by justin on 4/17/2017.
 */

class Weather {
    private String apiKey = "bbbb60c3a23903f6";
    Integer zip;



    protected Weather(int zip){
        this.zip=zip;
    }

    private void getAPI(){

        Uri builtUri = Uri.parse("http://api.wunderground.com/api/bbbb60c3a23903f6/conditions/q/")
                .buildUpon()
                .appendPath(zip.toString())
                .appendPath(".json")
                .build();

        System.out.println(builtUri.toString());
    }

}
