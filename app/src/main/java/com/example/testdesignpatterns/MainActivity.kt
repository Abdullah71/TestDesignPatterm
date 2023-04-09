package com.example.testdesignpatterns

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.testdesignpatterns.mvc.MVCActivity
import com.example.testdesignpatterns.mvp.MVPActivity
import com.example.testdesignpatterns.mvvm.MVVMActivity
import com.example.testdesignpatterns.ui.theme.TestDesignPatternsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestDesignPatternsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello $name!",
            modifier = Modifier
                .widthIn(min = 100.dp)
                .heightIn(min = 60.dp),
            textAlign = TextAlign.Center)
        Button(
            onClick = {
//                val sharingIntent = Intent(Intent.ACTION_VIEW)
//                sharingIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//                sharingIntent.data = Uri.parse("http://google.com")
//                context.startActivity(Intent.createChooser(sharingIntent, ""))
                val mvcIntent = Intent(context, MVCActivity::class.java)
                mvcIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(mvcIntent)
            },
            modifier = Modifier.padding(all = Dp(10f)),
            enabled = true,
            border = BorderStroke(width = 1.dp, brush = SolidColor(Color.Blue))
        ) {
            Text(text = "MVC",
                color = Color.White,
                modifier = Modifier.widthIn(min = 100.dp),
                textAlign = TextAlign.Center)
        }
        Button(
            onClick = {
                val mvcIntent = Intent(context, MVPActivity::class.java)
                mvcIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(mvcIntent)
            },
            modifier = Modifier.padding(all = Dp(10f)),
            enabled = true,
            border = BorderStroke(width = 1.dp, brush = SolidColor(Color.Blue))
        ) {
            Text(text = "MVP",
                color = Color.White,
                modifier = Modifier.widthIn(min = 100.dp),
                textAlign = TextAlign.Center)
        }
        Button(
            onClick = {
                val mvcIntent = Intent(context, MVVMActivity::class.java)
                mvcIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(mvcIntent)
            },
            modifier = Modifier.padding(all = Dp(10f)),
            enabled = true,
            border = BorderStroke(width = 1.dp, brush = SolidColor(Color.Blue))
        ) {
            Text(text = "MVVM",
                color = Color.White,
                modifier = Modifier.widthIn(min = 100.dp),
                textAlign = TextAlign.Center)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestDesignPatternsTheme {
        Greeting("Android user")
    }
}