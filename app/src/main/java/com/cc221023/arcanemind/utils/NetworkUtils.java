package com.cc221023.arcanemind.utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


//did not delete that yet, bc perhaps we need if for the images
public class NetworkUtils {
    public static String getResponseFromHttpUrl(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        try {
            Scanner sc = new Scanner(httpURLConnection.getInputStream());
            sc.useDelimiter("\\A");

            return sc.hasNext() ? sc.next() : null;
        } finally {
            httpURLConnection.disconnect();
        }
    }
}