package garousi.dev.design_system.widget
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoadingView(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
    ) {
        CircularProgressIndicator(
            modifier = Modifier
                .height(34.dp)
                .width(34.dp)
                .align(Alignment.Center)
        )
    }
}