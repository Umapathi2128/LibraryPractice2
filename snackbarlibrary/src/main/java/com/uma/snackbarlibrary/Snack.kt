package com.uma.snackbarlibrary

import android.support.design.widget.Snackbar
import android.view.View

/**
 * Created by Kavinraj on 17/10/18.
 * Copyright Indyzen Inc, @2018
 */
class Snack {

    fun bar(view:View,value:String)
    {
        Snackbar.make(view,value,Snackbar.LENGTH_LONG).show()
    }

}