package com.example.toaster;

import android.content.Context;
import android.widget.Toast;


public class Toasty {
    public static void SimpleToast(Context context, String message,int LENGTH)
    {

        if(LENGTH==0)
        {
            Toast.makeText(context,message,Toast.LENGTH_SHORT);
        }else if(LENGTH==1){
            Toast.makeText(context,message,Toast.LENGTH_LONG);
        }
        else{
            Toast.makeText(context,message,Toast.LENGTH_SHORT);
        }


    }
}
