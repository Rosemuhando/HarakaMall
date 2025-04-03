package com.rosemuhando.harakamall.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rosemuhando.harakamall.R
import com.rosemuhando.harakamall.ui.screens.start.StartScreen
import com.rosemuhando.harakamall.ui.theme.neworange
import com.rosemuhando.harakamall.ui.theme.newwhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun ItemScreen(){
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
            painter = painterResource(R.drawable.home),
            contentDescription = "home",
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentScale = ContentScale.FillWidth

        )


    }



}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen()

}

