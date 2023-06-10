package com.necherem.restaurantsapp

import androidx.lifecycle.ViewModel

/*RestaurantViewModel Inherits from the ViewModel class*/
class RestaurantViewModel (): ViewModel() {
    fun getRestaurants() = dummyRestaurants
}
