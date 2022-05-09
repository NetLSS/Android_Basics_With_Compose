package com.lilcode.test.composables_practice_problems

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lilcode.test.composables_practice_problems.ui.theme.Composables_practice_problemsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composables_practice_problemsTheme {

            }
        }
    }
}

// https://developer.android.com/codelabs/basic-android-kotlin-compose-composables-practice-problems?authuser=1&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%3Fauthuser%3D1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-composables-practice-problems#3
// https://github.com/google-developer-training/basic-android-kotlin-compose-training-practice-problems/blob/main/Unit%201/Pathway%203/ComposeQuadrant/app/src/main/java/com/example/composequadrant/MainActivity.kt
@Composable
fun FourDisplay() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.weight(0.5f)
        ) {
            Surface(
                color = Color.Green,
                modifier = Modifier.weight(0.5f)
                    .fillMaxSize()
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Text composable")
                    Text(text = "Displays text and follows Material Design guidelines.")
                }
            }
            Surface(
                color = Color.Yellow,
                modifier = Modifier.weight(0.5f)
                    .fillMaxSize()
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Image composable")
                    Text(text = "Creates a composable that lays out and draws a given Painter class object.")
                }
            }
        }
        Row(
            modifier = Modifier.weight(0.5f)
        ) {
            Surface(
                color = Color.Cyan,
                modifier = Modifier.weight(0.5f)
                    .fillMaxSize()
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Row composable")
                    Text(text = "A layout composable that places its children in a horizontal sequence.")
                }
            }
            Surface(
                color = Color.LightGray,
                modifier = Modifier.weight(0.5f)
                    .fillMaxSize()
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Column composable")
                    Text(text = "A layout composable that places its children in a vertical sequence.")
                }
            }
        }
    }
}

@Composable
fun TaskManager() {
    val image = painterResource(R.drawable.ic_task_completed)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Text(
            text = stringResource(R.string.task_completed),
            fontSize = 24.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(0.dp, 24.dp, 0.dp, 8.dp)
        )

        Text(
            text = stringResource(R.string.nice_work),
            fontSize = 16.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun ComposeTutorial() {
    val image = painterResource(R.drawable.bg_compose_background)

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )

        Text(
            text = stringResource(R.string.title),
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )

        Text(
            text = stringResource(R.string.body1),
            modifier = Modifier.padding(horizontal = 16.dp),
            textAlign = TextAlign.Justify
        )

        Text(
            text = stringResource(R.string.body2),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Composables_practice_problemsTheme {
        FourDisplay()
    }
}