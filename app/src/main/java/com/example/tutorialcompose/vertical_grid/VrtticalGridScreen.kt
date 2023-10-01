package com.example.tutorialcompose.vertical_grid

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@Composable
fun VerticalGridScreen() {


    val scope  = rememberCoroutineScope()
    val state = rememberLazyGridState(
        initialFirstVisibleItemIndex = 99
    ).apply {
        scope.launch {
            animateScrollToItem(99,1)
        }

    }
    LazyVerticalGrid(
        columns = GridCells.Adaptive(100.dp),
        state = state,
        content = {
            items(100) { index ->

                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .aspectRatio(1f)
                        .background(Color.Green)
                        .clip(RoundedCornerShape(10.dp)), contentAlignment = Alignment.Center
                ) {
                    Text("item $index")
                }

            }

        }

    )

}