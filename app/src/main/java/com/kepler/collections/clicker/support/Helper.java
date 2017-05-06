package com.kepler.collections.clicker.support;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.widget.Toast;

/**
 * Created by Amit on 05-05-2017.
 */

public class Helper {
    //    public static void showSnack() {
//        Snackbar.
//    }
    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();

    }
}
