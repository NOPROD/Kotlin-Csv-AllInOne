package com.boucham.csvallinone.core.extends

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.boucham.csvallinone.R
import com.boucham.csvallinone.main.ui.FragmentFiles
import com.boucham.csvallinone.main.ui.FragmentFolders
import com.boucham.csvallinone.main.ui.FragmentSearch
import com.boucham.csvallinone.main.ui.FragmentSettings

private val TAB_TITLES = mapOf<Int, Int>(
    0 to R.string.title_files,
    1 to R.string.title_folder,
    2 to R.string.title_search,
    3 to R.string.title_settings
)

private val TAB_FRAGMENTS = mapOf<Int, Any>(
    0 to FragmentFiles(),
    1 to FragmentFolders(),
    2 to FragmentSearch(),
    3 to FragmentSettings()
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return TAB_FRAGMENTS.getValue(position) as Fragment
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES.getValue(position))
    }

    override fun getCount(): Int {
        return TAB_FRAGMENTS.size
    }
}