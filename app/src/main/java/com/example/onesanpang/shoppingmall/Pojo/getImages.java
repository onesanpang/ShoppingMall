package com.example.onesanpang.shoppingmall.Pojo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by onesanpang on 19-4-30.
 */

public class getImages {
    private static Context context;

    public static Bitmap getBitmaps(String imageUrl){
        Bitmap bitmap = null;

        try {
            URL url = new URL(imageUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            connection.setConnectTimeout(500);
            if (connection.getResponseCode() == 200){
                InputStream inputStream = connection.getInputStream();
                bitmap = BitmapFactory.decodeStream(inputStream);

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;

    }
    public static void setImage(String imageUrl, ImageView imageView){
        Glide.with(context).load(imageUrl).into(imageView);
    }
}
