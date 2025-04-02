package com.rosemuhando.harakamall.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rosemuhando.harakamall.R
import com.rosemuhando.harakamall.ui.theme.neworange

@Composable

fun StartScreen(){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,


    ){
        Text(
            text = "HarakaMall",
            fontSize = 20.sp

        )
        Spacer(modifier = Modifier.height(20.dp))


// circular image
        Image(
            painter = painterResource(R.drawable.goods1),
            contentDescription = "home",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
//end of circular image

        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Find your Order!!!",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = neworange
        )

        Spacer(modifier = Modifier.height(20.dp))


        Text(
            text = "Haraka Mobility provides mobility equipment inside The Mall, which includes manual wheelchairs, special needs chairs, childrens chairs, power chairs, ...",
            textAlign = TextAlign.Center,
            fontSize = 16.sp

        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxSize().padding(start = 20.dp,end =20.dp)
        ) {
            Text(text = "get started")
        }

    }





}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen()

}