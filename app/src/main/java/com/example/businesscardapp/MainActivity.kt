package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF073042)
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(0.3f)
                .background(color = Color(android.graphics.Color.parseColor("#073042")))

        )
        Spacer(modifier = Modifier.padding(bottom=20.dp))
        Text(text = stringResource(R.string.nama), fontSize = 30.sp, color = Color.Black)

        Text(text = stringResource(R.string.NIM), fontSize = 15.sp, color = Color(android.graphics.Color.parseColor("#00621B")), fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(bottom=200.dp))
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom
    ) {
        Column(
            horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Bottom
        ) {


            ContactRow(
                text = stringResource(R.string.kontak),
                icon = Icons.Rounded.Phone
            )
            ContactRow(
                text = stringResource(R.string.share), icon = Icons.Rounded.Share
            )

            ContactRow(
                text = stringResource(R.string.email), icon = Icons.Rounded.Email
            )
            Spacer(modifier = Modifier.padding(bottom=70.dp))
        }
    }

}

@Composable
fun ContactRow(
    text: String, icon: ImageVector
) {
    Row(
        horizontalArrangement = Arrangement.Start, modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(android.graphics.Color.parseColor("#00621B"))

        )
        Spacer(modifier = Modifier.padding(end=20.dp))
        Text(
            text = text, color = Color.Black
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(), color = Color(0XFFD2E8D4)
    ) {
        BusinessCardAppTheme {
            BusinessCard()
        }
    }
}