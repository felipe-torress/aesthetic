package com.example.aesthetic.ui.screens.selectphoto

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.aesthetic.R
import com.example.aesthetic.ui.theme.md_theme_light_onPrimary
import com.example.aesthetic.ui.theme.md_theme_light_primary

@Composable
fun SelectPhotoScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.canvas),
                contentDescription = "Canvas Image",
                modifier = Modifier
                    .size(100.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "Upload your masterpiece")
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = {  },
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .heightIn(52.dp)
                    .fillMaxWidth()
                    .background(color = md_theme_light_primary)
            ) {
                Text(
                    text = "Upload Masterpiece",
                    color = md_theme_light_onPrimary
                )
            }
        }
    }
}