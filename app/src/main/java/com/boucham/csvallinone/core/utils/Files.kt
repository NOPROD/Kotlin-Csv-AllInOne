package com.boucham.csvallinone.core.utils

import android.os.Environment
import java.io.File

const val DIRECTORY_MEDIA = "media"

fun dataFolder() = Environment.getDataDirectory()

fun rootFolder() = Environment.getRootDirectory()

fun sdCard() = File("${Environment.getDataDirectory().absolutePath}/${DIRECTORY_MEDIA}/0/")

