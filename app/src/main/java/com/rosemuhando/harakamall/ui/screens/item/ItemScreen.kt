package com.rosemuhando.harakamall.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rosemuhando.harakamall.R
import com.rosemuhando.harakamall.ui.theme.neworange
import com.rosemuhando.harakamall.ui.theme.newwhite
import java.nio.file.WatchEvent


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun ItemScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){
//topAppBar
        TopAppBar(
            title = { Text(text = "Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = neworange,
                titleContentColor = newwhite
            ),
 //icons before the title

                navigationIcon ={
                   IconButton(onClick = {}) {
                       Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                }
            },
//icons towards the end
              actions = {
                  IconButton(onClick = {}) {
                      Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "shoppingCart")
                  }
                  IconButton(onClick = {}) {
                      Icon(imageVector = Icons.Default.Notifications, contentDescription = "notifications")
                  }

              }
        )
// end of topAppBar


        Image(
            painter = painterResource(R.drawable.mall1),
            contentDescription = "home",
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentScale = ContentScale.FillWidth

        )
        Spacer(modifier = Modifier.height(30.dp))

        //search bar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
            placeholder = { Text(text = "Search") }

        )




        //end of search bar
        Spacer(modifier = Modifier.height(30.dp))
Column (modifier = Modifier.verticalScroll(rememberScrollState())){
    //start of row
    Row (){
        Image(painter = painterResource(R.drawable.shirts),
            contentDescription = "img",
            modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.width(20.dp))
        Column {
            Text(
                text = "Brand new t-shirts for men",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "The best brand for all men",
                fontSize = 10.sp,

                )
            Text(
                text = "Ksh.22,000",
                fontSize = 20.sp,
                textDecoration = TextDecoration.LineThrough
            )
            Text(
                text = "Ksh.19,000",
                fontSize = 15.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Row {
                Icon(imageVector = Icons.Default.Star, contentDescription = "")
                Icon(imageVector = Icons.Default.Star, contentDescription = "")
                Icon(imageVector = Icons.Default.Star, contentDescription = "")
                Icon(imageVector = Icons.Default.Star, contentDescription = "")

            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(neworange),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text( text = "Contact us ")
            }


        }

    }
    //end of row

    Spacer(modifier = Modifier.height(30.dp))
    //start of row
    Row (){
        Image(painter = painterResource(R.drawable.shirts),
            contentDescription = "img",
            modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.width(20.dp))
        Column {
            Text(
                text = "Brand new t-shirts for men",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "The best brand for all men",
                fontSize = 10.sp,

                )
            Text(
                text = "Ksh.22,000",
                fontSize = 20.sp,
                textDecoration = TextDecoration.LineThrough
            )
            Text(
                text = "Ksh.19,000",
                fontSize = 15.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Row() {
                Icon(imageVector = Icons.Default.Star, contentDescription = "")
                Icon(imageVector = Icons.Default.Star, contentDescription = "")
                Icon(imageVector = Icons.Default.Star, contentDescription = "")
                Icon(imageVector = Icons.Default.Star, contentDescription = "")
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(neworange),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text( text = "Contact us ")
            }


        }

    }
    //end of row

    Spacer(modifier = Modifier.height(30.dp))
    //start of row
    Row (){
        Image(painter = painterResource(R.drawable.shirts),
            contentDescription = "img",
            modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.width(20.dp))
        Column {
            Text(
                text = "Brand new t-shirts for men",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "The best brand for all men",
                fontSize = 10.sp,

                )
            Text(
                text = "Ksh.22,000",
                fontSize = 20.sp,
                textDecoration = TextDecoration.LineThrough
            )
            Text(
                text = "Ksh.19,000",
                fontSize = 15.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Row {
                Icon(imageVector = Icons.Default.Star, contentDescription = "")
                Icon(imageVector = Icons.Default.Star, contentDescription = "")
                Icon(imageVector = Icons.Default.Star, contentDescription = "")
                Icon(imageVector = Icons.Default.Star, contentDescription = "")
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(neworange),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text( text = "Contact us ")
            }


        }

    }
    //end of row

}



    }



}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(rememberNavController())

}

