package com.boucham.csvallinone.core.utils

import android.os.Environment
import java.io.File

const val DIRECTORY_MEDIA = "media"

fun dataFolder() = Environment.getDataDirectory()

fun rootFolder() = Environment.getRootDirectory()

fun scanAll() = rootFolder().walkBottomUp().forEach { println(it) }