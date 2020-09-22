package com.boucham.csvallinone.main.ui

import android.os.Bundle
import androidx.preference.ListPreference
import androidx.preference.PreferenceFragmentCompat
import com.boucham.csvallinone.R


class FragmentSettings : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.settings, rootKey)

        val langPreference: ListPreference? = findPreference<ListPreference>("preference_lang")
        langPreference?.setOnPreferenceChangeListener { preference, newValue ->
            true;
        }
    }
}