package com.boucham.csvallinone.core.utils

import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import java.io.File
import java.text.DateFormat
import java.util.*


object CsvReader {
    var createdAt: String? = DateFormat.getDateInstance().format(Date());

    fun read(file: File) = csvReader().readAll(file)

    fun readWithHeader(file: File) = csvReader().readAllWithHeader(file)
}

