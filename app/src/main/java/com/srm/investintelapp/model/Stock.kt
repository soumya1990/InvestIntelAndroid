package com.srm.investintelapp.model

data class Stock(
    val symbol: String,
    val open: String,
    val high: String,
    val low: String,
    val prev: String,
    val price: String,
    val change: String,
    val percent_change: String,
    val year_high: String,
    val year_low: String,
    val month_change: String,
    val lotSize: String
)
