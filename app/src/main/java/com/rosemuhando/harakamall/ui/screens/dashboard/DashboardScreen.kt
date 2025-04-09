package com.rosemuhando.harakamall.ui.screens.dashboard

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
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
import com.rosemuhando.harakamall.navigation.ROUT_ITEM
import com.rosemuhando.harakamall.ui.theme.blue
import com.rosemuhando.harakamall.ui.theme.neworange
import com.rosemuhando.harakamall.ui.theme.neworange1


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun DashboardScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize().background(neworange)

        ) {
//box
        Box(){
            //CARD1
            Card(
                modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(neworange1)
            ){
                TopAppBar(
                    title = { Text(text = "Dashboard Section") },
                    navigationIcon = {
                        IconButton(onClick = {}) { Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                        }
                    }
                )


                Column( modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,) {
                    Text(text = "WELCOME TO HARAKA MALL ",
                        fontSize = 25.sp,
                        color = blue,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Image(
                        painter = painterResource(R.drawable.mall1),
                        contentDescription = "home",
                        modifier = Modifier.size(300.dp),

                        )


                }

            }
//END OF CARD1

            //CARD2
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .align(alignment = Alignment.BottomCenter)
                .padding(start = 20.dp, end = 20.dp)
                .offset(y = 90.dp)

            ) {


//Card contents
                Column( modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center){

                    Text(text = " Hello there welcome to our  dashboard." +
                            "Below are some of the webpages contained in our menu.",
                        fontSize = 20.sp,
                        color = neworange,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center
                    )
                }



            }
            //end of card2
        }
 //end of box
        Spacer(modifier = Modifier.height(100.dp))
        //row
        Row(modifier = Modifier.padding(start = 20.dp)){
           //card3

   Card(
    modifier = Modifier
        .width(150.dp)
        .height(180.dp)
        .clickable{navController.navigate(ROUT_HOME)},
       elevation = CardDefaults.cardElevation(10.dp)
        ) {
Column (
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
){



    Image(
        painter = painterResource(R.drawable.image),
        contentDescription = "home",
        modifier = Modifier.size(100.dp),


    )
    Text(text = "Home", fontSize = 15.sp)
}

        }
//end of card3

            Spacer(modifier = Modifier.width(50.dp))
            //card4

            Card(
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable{navController.navigate(ROUT_ABOUT)},
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp),


                    )
                    Text(text = "About", fontSize = 15.sp)
                }

            }
//end of card4
        }
//end of row

        Spacer(modifier = Modifier.height(50.dp))
        //row2
        Row(modifier = Modifier.padding(start = 20.dp)){
            //card3

            Card(
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable{navController.navigate(ROUT_HOME)},
                        elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                ){



                    Image(
                        painter = painterResource(R.drawable.img_1),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp),


                        )
                    Text(text = "contact", fontSize = 15.sp)
                }

            }
//end of card3

            Spacer(modifier = Modifier.width(50.dp))
            //card4

            Card(
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable{navController.navigate(ROUT_ITEM) },
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp),

                        )
                    Text(text = "Product", fontSize = 15.sp)
                }

            }
//end of card4
        }
//end of row2








    }

}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())

}