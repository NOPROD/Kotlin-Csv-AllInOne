package com.boucham.csvallinone

import android.app.Application
import androidx.preference.PreferenceManager
import com.yariksoffice.lingver.Lingver
import com.yariksoffice.lingver.store.PreferenceLocaleStore

class App : Application() {

    @Suppress("UNUSED_VARIABLE")
    override fun onCreate() {
        super.onCreate()

        val prefs = PreferenceManager.getDefaultSharedPreferences(applicationContext)

        val store = PreferenceLocaleStore(this)
        lingerInstance = Lingver.init(this, store)
    }

    companion object {
        const val LANGUAGE_ENGLISH = "en"
        const val LANGUAGE_ENGLISH_COUNTRY = "US"
        const val LANGUAGE_FRENCH = "fr"
        const val LANGUAGE_FRENCH_COUNTRY = "FR"
        lateinit var lingerInstance: Lingver;
    }
}