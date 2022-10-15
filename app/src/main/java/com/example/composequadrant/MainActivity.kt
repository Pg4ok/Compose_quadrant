package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Quadrant();
                }
            }
        }
    }
}

@Composable
fun Quadrant(){
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            CreateCard(stringResource(R.string.Text_composable), stringResource(R.string.Display_nes), Color.Green,Modifier.weight(1f));
            CreateCard("Image composable", stringResource(R.string.Cr_a_composable_obj), BackGcolor =Color.Yellow,Modifier.weight(1f) )
        }
        Row(Modifier.weight(1f)) {
            CreateCard(Mtext = "Row composable", about = stringResource(R.string.lay_comp), BackGcolor =Color.Cyan,Modifier.weight(1f) );
            CreateCard(Mtext = "Column composable", about = stringResource(id = R.string.lay_comp), BackGcolor =Color.LightGray,Modifier.weight(1f) );
            
        }

    }
}
@Composable
fun CreateCard(Mtext:String,about:String,BackGcolor:Color,modifier: Modifier = Modifier){
    Column(modifier = modifier
        .fillMaxSize()
        .fillMaxWidth()
        .background(BackGcolor)
        .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = Mtext, fontWeight = FontWeight.Bold ,modifier = Modifier.padding(bottom = 16.dp));
        Text(text = about,textAlign = TextAlign.Justify);
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        Quadrant();
    }
}