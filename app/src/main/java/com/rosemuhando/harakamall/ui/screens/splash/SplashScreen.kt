package com.rosemuhando.harakamall.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rosemuhando.harakamall.R
import com.rosemuhando.harakamall.navigation.ROUT_LOGIN
import com.rosemuhando.harakamall.navigation.ROUT_START
import com.rosemuhando.harakamall.ui.theme.neworange2
import com.rosemuhando.harakamall.ui.theme.newwhite
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable

fun SplashScreen(navController: NavController){
    //navigation
val coroutine = rememberCoroutineScope()
    coroutine.launch {
        delay(2000)
        navController.navigate(ROUT_LOGIN)

    }




    //end of navigation

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(neworange2),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,




    ){
        Text(
            text = "Haraka mall",
            fontSize = 50.sp,
            fontWeight = FontWeight.ExtraBold,
            color = newwhite


        )

        Image(painter = painterResource(R.drawable.services),
            contentDescription = "img",
            modifier = Modifier.width(400.dp).height(400.dp).clip(shape = RoundedCornerShape(10.dp)),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.width(20.dp))



    }





}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())

}