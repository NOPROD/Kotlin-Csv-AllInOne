package com.boucham.csvallinone.main.ui.shared

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Window
import com.boucham.csvallinone.R

class DialogCustomListView(context: Context) : Dialog(context) {

    init {
        setCancelable(false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.custom_dialog_list)
    }

}