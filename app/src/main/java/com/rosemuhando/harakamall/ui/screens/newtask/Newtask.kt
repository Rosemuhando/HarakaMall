package com.rosemuhando.harakamall.ui.screens.newtask

import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.rosemuhando.harakamall.ui.screens.contact.ContactScreen
import com.rosemuhando.harakamall.ui.theme.black
import com.rosemuhando.harakamall.ui.theme.blue
import com.rosemuhando.harakamall.ui.theme.neworange
import com.rosemuhando.harakamall.ui.theme.neworange1

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewtaskScreen(navController: NavController){
    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Contact Screen") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = neworange,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },


        //BottomBar
        bottomBar = {
            NavigationBar(containerColor = neworange){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "home") },
                    label = { Text("Search") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                        //navController.navigate(ROUT_HOME)
                    }
                )


                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )



                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)

                    }
                )



            }
        },
//FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Color.Magenta

            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },

        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {


                //Main Contents of the page
                Text(text = "", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(8.dp))
                Text("")

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


                Spacer(modifier = Modifier.height(100.dp))
//box
                Box(){
                    //CARD1
                    Card(
                        modifier = Modifier.fillMaxWidth().height(500.dp),

                        colors = CardDefaults.cardColors()
                    ){



                        Column( modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,) {
                            Text(text = " ",
                                fontSize = 25.sp,
                                color = blue,
                                fontWeight = FontWeight.ExtraBold,

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

                            Text(text = " ",
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




            }
        }
    )

    //End of scaffold


}
@Preview(showBackground = true)
@Composable
fun NewtaskScreenPreview(){
    NewtaskScreen(rememberNavController())


}