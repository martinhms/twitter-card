package com.example.twittercard.TwitterCard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.twittercard.R

@Composable
fun TwitterCard() {
    Row(
        Modifier
            .fillMaxWidth()
            .background(Color(0xFF161D26))
            .padding(16.dp)
            .padding(top = 40.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.iron_profile),
            contentDescription = "",
            modifier = Modifier
                .clip(
                    CircleShape
                )
                .size(55.dp)
        )
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
            ) {
                TextTile(title = "@Martinhms", modifier = Modifier.padding(end = 8.dp))
                DefaultText(title = "Martin", modifier = Modifier.padding(end = 8.dp))
                DefaultText(title = "4h", modifier = Modifier.padding(end = 8.dp))
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    painter = painterResource(id = R.drawable.ic_dots),
                    contentDescription = "",
                    tint = Color.White
                )
            }
            TextBody(
                text = "Esto es el bodi ++++++++++++++++++++++" +
                        "+++++++++++" +
                        "++++++++++++++++++++++++" +
                        "+++++++++++++++++++++++" +
                        "+++++++++++++++++++++++" +
                        "+++++++++++++++++++++++" +
                        "+++++++++++++++++++++++" +
                        "+++++++++++++++++++++++++++++++" +
                        "+", Modifier.padding(bottom = 20.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.iron), contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(
                        RoundedCornerShape(10),
                    ),
                contentScale = ContentScale.Crop

            )
        }
    }
}

@Composable
fun TextTile(title: String, modifier: Modifier) {
    Text(
        text = title,
        color = Color.White,
        fontWeight = FontWeight.ExtraBold,
        modifier = modifier
    )
}

@Composable
fun DefaultText(title: String, modifier: Modifier) {
    Text(
        text = title,
        color = Color.Gray,
        modifier = modifier
    )
}

@Composable
fun TextBody(text: String, modifier: Modifier) {
    Text(
        text = text,
        color = Color.White,
        modifier = modifier
    )
}