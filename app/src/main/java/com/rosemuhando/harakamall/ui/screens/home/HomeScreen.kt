package com.rosemuhando.harakamall.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rosemuhando.harakamall.R


@Composable

fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    )
    {
        Text(
            text = "HarakaMall",
            fontSize = 30.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.ExtraBold,
            )

        Spacer(modifier = Modifier.height(30.dp))

        Image(
            painter = painterResource(R.drawable.home),
            contentDescription = "home"
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Welcome to my app",
            fontSize = 15.sp,
            fontStyle = FontStyle.Italic


        )
        Text(
            text = "Haraka Mobility provides mobility equipment inside The Mall, which includes manual wheelchairs, special needs chairs, childrens chairs, power chairs, powered mobility scooters and special needs child strollers. Use our online \"click N' Collect service to book your rental equipment, we will even come to you when you arrive in the mall or the parking area or come to one of our 3 conveniently located kiosks when you arrive.",
            fontSize = 15.sp,
            fontStyle = FontStyle.Italic


        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(15.dp),
        ) {
            Text(text = "Add to cart")
        }
    }

}





@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}