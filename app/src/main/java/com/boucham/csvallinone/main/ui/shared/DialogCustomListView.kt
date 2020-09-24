package com.boucham.csvallinone.main.ui.shared

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.Window
import com.boucham.csvallinone.R

class DialogCustomListView(context: Context, items: Array<String>) : AlertDialog(context) {
    private val builder = Builder(context)

    init {
        setCancelable(false)

        builder.setItems(items) { dialog, which ->
            when (which) {
                0 -> {
                    dialog.dismiss()
                }
            }
        }
        builder.show()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.custom_dialog_list)
    }

}