package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets.sayi_tahmin_uygulamasi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets.R

@Preview
@Composable
fun sayitahminuygtasarimpreview(){
    sayfagecisleri()
}
@Composable
fun sayitahminuygtasarim(navController: NavController){
Column(modifier = Modifier.fillMaxSize(), 
    verticalArrangement = Arrangement.SpaceEvenly,
    horizontalAlignment = Alignment.CenterHorizontally) {
    Text(text = "Tahmin Oyunu", fontSize = 36.sp)
    Image(painter = painterResource(id = R.drawable.zar_resim), contentDescription = "")
    Button(onClick = { navController.navigate("tahminekrani") }, modifier = Modifier.size(250.dp,50.dp)) {
        Text(text = "OYUNA BASLA")
    }
}
}

@Composable
fun sayfagecisleri(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = "sayitahminuygtasarim") {
        composable("sayitahminuygtasarim"){
            sayitahminuygtasarim(navController = navController)
        }
        composable("tahminekrani"){
            tahminekrani(navController = navController)
        }
        composable("sonucekrani/{sonuc}", arguments = listOf(
            navArgument("sonuc"){type= NavType.BoolType}
        )){
            val sonuc = it.arguments?.getBoolean("sonuc")!!
            sonucekrani(sonuc = sonuc)
        }
    }
}