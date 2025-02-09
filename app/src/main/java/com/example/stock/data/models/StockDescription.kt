package com.example.stock.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "details")
data class StockDescription(
    @SerializedName("200DayMovingAverage")
    val dayMovingAverage200: String,
    @SerializedName("50DayMovingAverage")
    val DayMovingAverage50: String,
    @SerializedName("52WeekHigh")
    val WeekHigh52: String,
    @SerializedName("52WeekLow")
    val WeekLow52: String,
    val Address: String,
    val AnalystRatingBuy: String,
    val AnalystRatingHold: String,
    val AnalystRatingSell: String,
    val AnalystRatingStrongBuy: String,
    val AnalystRatingStrongSell: String,
    val AnalystTargetPrice: String,
    val AssetType: String,
    val Beta: String,
    val BookValue: String,
    val CIK: String,
    val Country: String,
    val Currency: String,
    val Description: String,
    val DilutedEPSTTM: String,
    val DividendDate: String,
    val DividendPerShare: String,
    val DividendYield: String,
    val EBITDA: String,
    val EPS: String,
    val EVToEBITDA: String,
    val EVToRevenue: String,
    val ExDividendDate: String,
    val Exchange: String,
    val FiscalYearEnd: String,
    val ForwardPE: String,
    val GrossProfitTTM: String,
    val Industry: String,
    val LatestQuarter: String,
    val MarketCapitalization: String,
    val Name: String,
    val OperatingMarginTTM: String,
    val PEGRatio: String,
    val PERatio: String,
    val PriceToBookRatio: String,
    val PriceToSalesRatioTTM: String,
    val ProfitMargin: String,
    val QuarterlyEarningsGrowthYOY: String,
    val QuarterlyRevenueGrowthYOY: String,
    val ReturnOnAssetsTTM: String,
    val ReturnOnEquityTTM: String,
    val RevenuePerShareTTM: String,
    val RevenueTTM: String,
    val Sector: String,
    val SharesOutstanding: String,
    @PrimaryKey
    val Symbol: String,
    @ColumnInfo("timestamp")
    val timestamp: Long = System.currentTimeMillis(),
    val TrailingPE: String
)