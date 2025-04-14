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
import com.rosemuhando.harakamall.navigation.ROUT_HOME
import com.rosemuhando.harakamall.navigation.ROUT_ITEM
import com.rosemuhando.harakamall.ui.theme.black
import com.rosemuhando.harakamall.ui.theme.blue
import com.rosemuhando.harakamall.ui.theme.grey
import com.rosemuhando.harakamall.ui.theme.neworange
import com.rosemuhando.harakamall.ui.theme.newwhite

@Composable
fun Task3Screen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().background(newwhite)) {

        Text(
            text = "Hi Samantha",

            fontSize = 30.sp,
            color = black,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Here are your projects",
        )
        Spacer(modifier = Modifier.height(50.dp))



        Row(modifier = Modifier.padding(start = 20.dp)) {
            Spacer(modifier = Modifier.height(50.dp))
            //card3

            Card(
                modifier = Modifier
                    .width(180.dp)
                    .height(250.dp),
                colors = CardDefaults.cardColors(blue)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {


                    Image(
                        painter = painterResource(R.drawable.img_1),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp),


                        )
                    Text(text = "contact", fontSize = 15.sp)
                }

            }
//end of card3
            Spacer(modifier = Modifier.width(10.dp))
            Card(
                modifier = Modifier
                    .width(180.dp)
                    .height(250.dp),
                colors = CardDefaults.cardColors(neworange)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {


                    Image(
                        painter = painterResource(R.drawable.img_1),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp),


                        )
                    Text(text = "contact", fontSize = 15.sp)
                }

            }
//end of card3
            Spacer(modifier = Modifier.width(10.dp))
            //card4

            Card(
                modifier = Modifier
                    .width(180.dp)
                    .height(250.dp),
                colors = CardDefaults.cardColors(neworange)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Row {
                        Image(
                            painter = painterResource(R.drawable.img),
                            contentDescription = "home",
                            modifier = Modifier.size(100.dp),

                            )


                    }
                }
            }
//end of card4
        }
//end of row2
        Box() {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .offset(y = 90.dp),
                colors = CardDefaults.cardColors()


            ) {


//Card contents
                Column(
                    modifier = Modifier.fillMaxSize(),

                ) {

                    Text(
                        text = " Personal Tasks",

                        fontSize = 20.sp,
                        color = black,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(50.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp)
                            .clickable { navController.navigate(ROUT_ITEM) },
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(newwhite)
                    ) {
                        Row() {
                            Image(
                                painter = painterResource(R.drawable.img),
                                contentDescription = "home",
                                modifier = Modifier.size(100.dp),

                                )


                            Text(
                                text = " NDA  Review for website project",
                                fontSize = 15.sp,
                                color = black,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.Center
                            )
                        }

                        Text(text = "Today 10pm")
                    }
                    Spacer(modifier = Modifier.height(20.dp))




    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .clickable { navController.navigate(ROUT_ITEM)},
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(newwhite),
    ) {
        Row () {
            Image(
                painter = painterResource(R.drawable.email),
                contentDescription = "home",
                modifier = Modifier.size(100.dp),

                )
            Text(
                text = "Email reply for green projects",
                fontSize = 15.sp,
                color = black,
                fontWeight = FontWeight.ExtraBold,


                )
        }

            Text(
                text = "Today at 10pm?",
                fontSize = 10.sp,
                color = black,

            )
    }
}
                    Spacer(modifier = Modifier.height(20.dp))

                }


            }


        }


    }



@Preview(showBackground = true)
@Composable
fun Task3ScreenPreview(){
    Task3Screen(rememberNavController())

}

