package com.example.loginsinupanddashboard

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Login()
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun Login() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(android.graphics.Color.parseColor("#f8eeec")))
        ) {
            Image(
                painter = painterResource(id = R.drawable.top_background1),
                contentDescription = null
            )
            Text(
                text = "Welcome\nBack",
                color = Color(android.graphics.Color.parseColor("#Ea6d35")),
                modifier = Modifier.padding(top = 2.dp, start = 24.dp),
                fontSize = 40.sp,
                fontWeight = FontWeight.SemiBold
            )
            var text by rememberSaveable { mutableStateOf("") }
            TextField(
                value = text,
                onValueChange = { text = it },
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.email), contentDescription = null,
                        modifier = Modifier
                            .size(43.dp)
                            .padding(start = 6.dp)
                            .padding(3.dp)
                    )
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor =  Color.Transparent,
                ),
                label = { Text(text = "Email") },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                    .background(color = Color.White, CircleShape)
            )
            var text1 by rememberSaveable { mutableStateOf("") }
            TextField(
                value = text1,
                onValueChange = { text1 = it },
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.password),
                        contentDescription = null,
                        modifier = Modifier
                            .size(43.dp)
                            .padding(start = 6.dp)
                            .padding(3.dp)
                    )
                },
                colors =TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor =  Color.Transparent,
                ),
                label = { Text(text = "PassWord") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                    .background(color = Color.White, CircleShape)
            )
            Image(painter = painterResource(id = R.drawable.btn_arraw1), contentDescription = null,
                modifier = Modifier
                    .width(80.dp)
                    .padding(top = 24.dp)
                    .align(Alignment.End)
                    .clickable { }
                    .padding(end = 24.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, start = 24.dp, end = 24.dp)
            )
            {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 10.dp, end = 8.dp)
                        .weight(0.5f)
                        .height(55.dp),
                    border = BorderStroke(
                        1.dp,
                        color = Color(android.graphics.Color.parseColor("#4d4d4d"))
                    ),
                    colors = ButtonDefaults.buttonColors(
                        Color.Transparent,
                    ),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(0.3f), verticalArrangement = Arrangement.Center
                    ) {
                        Image(painter = painterResource(id = R.drawable.google),
                            contentDescription = null,
                            modifier = Modifier
                                .width(25.dp)
                                .clickable { }
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(start = 14.dp)
                            .weight(0.7f),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "Google",
                            color = Color((android.graphics.Color.parseColor("#2f4f86"))),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 10.dp, end = 8.dp)
                        .weight(0.5f)
                        .height(55.dp),
                    border = BorderStroke(
                        1.dp,
                        color = Color(android.graphics.Color.parseColor("#4d4d4d"))
                    ),
                    colors = ButtonDefaults.buttonColors(
                        Color.Transparent,
                    ),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(0.3f), verticalArrangement = Arrangement.Center
                    ) {
                        Image(painter = painterResource(id = R.drawable.facebook),
                            contentDescription = null,
                            modifier = Modifier
                                .width(25.dp)
                                .clickable { }
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(start = 14.dp)
                            .weight(0.7f),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "FaceBook",
                            color = Color((android.graphics.Color.parseColor("#2f4f86"))),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

            }
            Text(
                text = "Are you new user? Register",
                color = Color(android.graphics.Color.parseColor("#3b608c")),
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(top = 12.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,

                )
        }
    }
}