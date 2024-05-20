package com.example.mbanking

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Transfer(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.bgorange), contentDescription = "bgtop",
            modifier = Modifier.width(400.dp).height(250.dp), alignment = Alignment.TopEnd
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp, 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = R.drawable.bsi), contentDescription = "login image",
            modifier = Modifier.size(250.dp,100.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Transfer", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "Pilih jenis transfer")

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { transferHandler(navController, "TransferBSI") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF16A066))
        ) {
            Text(text = "Transfer ke sesama BSI")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { transferHandler(navController, "TransferAntarBank") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF16A066))
        ) {
            Text(text = "Transfer antar bank")
        }
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.bgbottom), contentDescription = "bgbottom",
            modifier = Modifier.width(400.dp).height(250.dp), alignment = Alignment.BottomEnd
        )
    }
}

fun transferHandler(navController: NavController, jenis: String){
    if (jenis == "TransferBSI"){
        navController.navigate("TransferBSI")
    }
    else navController.navigate("TransferAntarBank")
}