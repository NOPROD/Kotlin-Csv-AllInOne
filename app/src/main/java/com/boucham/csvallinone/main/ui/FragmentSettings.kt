package com.boucham.csvallinone.main.ui

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.boucham.csvallinone.R


class FragmentSettings : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.settings, rootKey)
    }
}