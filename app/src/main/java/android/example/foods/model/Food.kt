package android.example.foods.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class Food(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
