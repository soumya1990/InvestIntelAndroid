package com.srm.investintelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.srm.investintelapp.model.Stock
import com.srm.investintelapp.ui.theme.InvestIntelAppTheme

class MainActivity : ComponentActivity() {

    private val testStocks = listOf(
        Stock(
            "NIFTY 50",
            "22,231.20", "22,368.65", "22,185.20", "22,302.50",
            "22,302.50", "-", "-", "22,794.70", "18,060.40",
            "-0.94", "50"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InvestIntelAppTheme {
                // A surface container using the 'background' color from the theme

                StockListView(stocks = testStocks)
            }
        }
    }


    @Composable
    fun StockListView(stocks: List<Stock>) {
        LazyColumn {
            items(stocks.size) { idx ->
                Card(
                    modifier = Modifier.padding(8.dp),
                    elevation = 8.dp,
                    backgroundColor = MaterialTheme.colors.surface
                ) {
                    Text(text = stocks[idx].symbol, style = MaterialTheme.typography.h6)
                }

            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewStockListView() {
        StockListView(stocks = testStocks)
    }

}