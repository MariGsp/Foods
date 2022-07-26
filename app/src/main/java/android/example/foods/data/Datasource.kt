package android.example.foods.data

import android.example.foods.R
import android.example.foods.model.Food

class Datasource {

    fun loadFoods(): List<Food> {
        return listOf<Food>(
            Food(R.string.bread, R.drawable.bread),
            Food(R.string.cookie, R.drawable.cookie),
            Food(R.string.macarons, R.drawable.macarons),
            Food(R.string.pancakes, R.drawable.pancakes),
            Food(R.string.pasta, R.drawable.pasta),
            Food(R.string.salmon, R.drawable.salmon),
            Food(R.string.strawberry_dessert, R.drawable.strawberry_dessert),
            Food(R.string.vegetables, R.drawable.vegetables),

        )
    }
}