package com.miu.fooditems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_foods.*
import kotlinx.android.synthetic.main.item_food.iv_picture
import kotlinx.android.synthetic.main.item_food.tv_name

class FoodsActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_FOOD = "extra_food"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foods)
        val food = intent.getSerializableExtra(EXTRA_FOOD) as Food

        iv_picture.setImageResource(food.pictureResId)
        tv_name.text = food.name
        tv_recipe.text = food.recipe
    }
}