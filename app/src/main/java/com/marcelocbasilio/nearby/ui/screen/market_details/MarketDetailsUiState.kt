package com.marcelocbasilio.nearby.ui.screen.market_details

import com.marcelocbasilio.nearby.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon: String? = null,
)