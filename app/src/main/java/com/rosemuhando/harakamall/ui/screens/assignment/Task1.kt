package com.rosemuhando.harakamall.ui.screens.assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rosemuhando.harakamall.R
import com.rosemuhando.harakamall.navigation.ROUT_ABOUT
import com.rosemuhando.harakamall.navigation.ROUT_HOME
import com.rosemuhando.harakamall.ui.screens.home.HomeScreen
import com.rosemuhando.harakamall.ui.theme.blue
import com.rosemuhando.harakamall.ui.theme.grey
import com.rosemuhando.harakamall.ui.theme.neworange
import com.rosemuhando.harakamall.ui.theme.neworange1
import com.rosemuhando.harakamall.ui.theme.newwhite

@Composable

fun Task1Screen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().background(neworange1)) {

        Row(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(R.drawable.img_4),
                contentDescription = "home",
                modifier = Modifier.size(50.dp),
            )

            Text(
                text = "Logo App",
                fontSize = 30.sp,
                color = newwhite

                )
        }
    }

    Column() {

        Spacer(modifier = Modifier.height(100.dp))



        Image(
            painter = painterResource(R.drawable.grocery),
            contentDescription = "home",
            modifier = Modifier.size(200.dp),

        )




        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .offset(y = 90.dp),
            colors = CardDefaults.cardColors(newwhite)


        ) {


//Card contents
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = " The Most Worth" +
                            "Grocery App",
                    fontSize = 40.sp,
                    color = neworange,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(50.dp))

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(grey),
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),

                    ) {
                    Text(text = "Username")
                }
                Spacer(modifier = Modifier.height(20.dp))


                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(grey),
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),

                    ) {
                    Text(text = "Password")
                }
                Spacer(modifier = Modifier.height(20.dp))


                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(neworange),
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),

                    ) {
                    Text(text = "Sign Up")
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = " Aready member or log in ?",
                    fontSize = 15.sp
                )

            }


        }

    }


    }










@Preview(showBackground = true)
@Composable
fun Task1ScreenPreview() {
    Task1Screen(rememberNavController())
}