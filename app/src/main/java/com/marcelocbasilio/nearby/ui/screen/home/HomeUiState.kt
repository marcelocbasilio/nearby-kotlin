package com.marcelocbasilio.nearby.ui.screen.home

import com.google.android.gms.maps.model.LatLng
import com.marcelocbasilio.nearby.data.model.Category
import com.marcelocbasilio.nearby.data.model.Market

data class HomeUiState(
    val categories: List<Category>? = null,
    val markets: List<Market>? = null,
    val marketLocations: List<LatLng>? = null
)