package com.necherem.restaurantsapp

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

/*RestaurantViewModel Inherits from the ViewModel class*/
class RestaurantsViewModel(): ViewModel() {
    val state = mutableStateOf(dummyRestaurants)

    fun toggleFavorite(id: Int) {
        val restaurants = state.value.toMutableList()
        val itemIndex =
            restaurants.indexOfFirst { it.id == id }
        val item = restaurants[itemIndex]
        restaurants[itemIndex] =
            item.copy(isFavorite = !item.isFavorite)
        state.value = restaurants
    }
}
