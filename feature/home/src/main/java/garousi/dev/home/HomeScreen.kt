package garousi.dev.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    HomeScreen()
}


@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
        .fillMaxSize()
        .drawBehind { drawRect(Color.DarkGray) }
    ) {

    }
}