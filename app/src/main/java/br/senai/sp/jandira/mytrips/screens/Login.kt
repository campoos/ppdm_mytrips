package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun Login() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                horizontalAlignment = Alignment.End
            ){
                Card (
                    modifier = Modifier
                        .width(150.dp)
                        .height(45.dp),

                    shape = RoundedCornerShape(
                        bottomStart = 20.dp,
                        topEnd = 20.dp
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFBB2EE7)
                    )
                ){}
            }
            Column (
                modifier = Modifier
                    .width(360.dp)
            ){
                Column (
                    modifier = Modifier
                        .background(Color.White)
                ){
                    Text(
                        text = stringResource(
                            R.string.app_name
                        ),
                        fontSize = 40.sp,
                        color = Color(0xFFBB2EE7),
                        fontWeight = FontWeight.Black
                    )
                    Text(
                        text = stringResource(
                            R.string.Subtitle
                        ),
                        modifier = Modifier
                            .padding(bottom = 64.dp)
                    )

                }
                Column {
                    OutlinedTextField (
                        modifier = Modifier
                            .fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        label = {
                            Text(
                                text = stringResource(
                                    R.string.Email
                                )
                            )
                        },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.email),
                                contentDescription = "",
                                tint = Color(0xFFBB2EE7)
                            )
                        }
                    )
                    OutlinedTextField (
                        modifier = Modifier
                            .padding(
                                top = 8.dp
                            )
                            .fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        label = {
                            Text(
                                text = stringResource(
                                    R.string.Email
                                )
                            )
                        },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.cadeado),
                                contentDescription = "",
                                tint = Color(0xFFBB2EE7)
                            )
                        }
                    )
                    Column (
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.End,
                    ){
                        Button(
                            onClick = {},
                            modifier = Modifier.padding(16.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFBB2EE7)
                            )
                        ) {
                            Text(
                                text = stringResource(id = R.string.ButtonText),
                                modifier = Modifier
                                    .padding(end = 8.dp)
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.seta),
                                contentDescription = "",
                                tint = Color.White
                            )
                        }
                    }
                    Row (
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ){
                        Text(
                            text = stringResource(id = R.string.TextAccount)
                        )
                        Text(
                            text = stringResource(id = R.string.SignUp),
                            color = Color(0xFFBB2EE7),
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                horizontalAlignment = Alignment.Start
            ){
                Card (
                    modifier = Modifier
                        .width(150.dp)
                        .height(45.dp),

                    shape = RoundedCornerShape(
                        bottomStart = 20.dp,
                        topEnd = 20.dp
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFBB2EE7)
                    )
                ){

                }
            }
        }
    }

}


@Preview
@Composable
private fun screenPreview(){
    Login()
}