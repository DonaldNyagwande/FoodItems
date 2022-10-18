package com.miu.fooditems

import java.io.Serializable

data class Food(var pictureResId: Int, var name: String, var recipe: String) : Serializable