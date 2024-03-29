package com.shashank.plantshopappui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shashank.plantshopappui.R
import com.shashank.plantshopappui.component.TopBarWithBack
import com.shashank.plantshopappui.theme.*

class Payment : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaymentView()
        }
    }
}

@Composable
@Preview
fun PaymentView() {

    PlantShopAppUITheme {
        Scaffold(
            topBar = {
                TopBarWithBack(
                    title = stringResource(R.string.title_activity_payment),
                    onBackClick = {

                    },
                )
            }, backgroundColor = cottonBall,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        verticalAlignment = Alignment.Top,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.5f)
                            .padding(16.dp)
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .weight(0.5f)
                                .fillMaxHeight()
                        ) {
                            Box(
                                modifier = Modifier
                                    .padding(horizontal = 12.dp)
                                    .clip(RoundedCornerShape(12.dp))
                            ) {
                                Image(
                                    contentScale = ContentScale.Crop,
                                    painter = painterResource(R.drawable.plant_store_5),
                                    contentDescription = stringResource(R.string.text_plant_image),
                                )
                            }

                        }
                        Spacer(modifier = Modifier.width(24.dp))
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .weight(0.5f)
                                .fillMaxHeight()
                        ) {
                            Text(
                                text = stringResource(R.string.text_montstera),
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = annapolosBlue,
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = stringResource(R.string.text_plant_detail),
                                fontSize = 12.sp,
                                color = annapolosBlue,
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .background(Color.Black)
                            .padding(16.dp)

                    ) {
                        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                            Text(
                                text = stringResource(R.string.text_payment_method),
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = white,
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Button(
                                    onClick = { /*TODO*/ },
                                    elevation = null,
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        backgroundColor = white
                                    ),
                                    modifier = Modifier
                                        .weight(0.3f)
                                        .height(48.dp)
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.mastercard),
                                        modifier = Modifier.fillMaxWidth(0.6f),
                                        contentDescription = stringResource(R.string.text_mastercard_image),
                                    )
                                }
                                Spacer(modifier = Modifier.width(8.dp))
                                Button(
                                    onClick = { /*TODO*/ },
                                    elevation = null,
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        backgroundColor = white
                                    ),
                                    modifier = Modifier
                                        .weight(0.3f)
                                        .height(48.dp)
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.paypal),
                                        modifier = Modifier.fillMaxWidth(0.6f),
                                        contentDescription = stringResource(R.string.text_paypal_image),
                                    )
                                }
                                Spacer(modifier = Modifier.width(8.dp))
                                Button(
                                    onClick = { /*TODO*/ },
                                    elevation = null,
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        backgroundColor = white
                                    ),
                                    modifier = Modifier
                                        .weight(0.3f)
                                        .height(48.dp)
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.visa),
                                        modifier = Modifier.fillMaxWidth(0.6f),
                                        contentDescription = stringResource(R.string.text_visa),
                                    )
                                }
                                Spacer(modifier = Modifier.width(8.dp))
                                Button(
                                    onClick = { /*TODO*/ },
                                    elevation = null,
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        backgroundColor = Color.DarkGray
                                    ),
                                    modifier = Modifier
                                        .weight(0.15f)
                                        .height(48.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Add,
                                        tint = Color.White,
                                        contentDescription = stringResource(R.string.text_add_icon),
                                        modifier = Modifier.size(20.dp, 20.dp),
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(24.dp))
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = stringResource(R.string.text_montstera),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.sp,
                                    color = white,
                                )
                                Text(
                                    text = "21 000 fcfa",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.sp,
                                    color = white,
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Divider(
                                color = Color.White,
                                thickness = 0.2.dp
                            )
                            Spacer(modifier = Modifier.height(20.dp))
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = stringResource(R.string.text_packaging),
                                    fontSize = 14.sp,
                                    color = grey,
                                )
                                Text(
                                    text = " 20 000 fcfa",
                                    fontSize = 14.sp,
                                    color = white,
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = stringResource(R.string.text_tax),
                                    fontSize = 14.sp,
                                    color = grey,
                                )
                                Text(
                                    text = " 20 000fcfa",
                                    fontSize = 14.sp,
                                    color = white,
                                )
                            }
                            Spacer(modifier = Modifier.height(32.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {

                                Column(
                                    modifier = Modifier
                                        .wrapContentHeight()
                                ) {
                                    Text(
                                        text = stringResource(R.string.text_total),
                                        fontSize = 12.sp,
                                        color = grey,
                                    )
                                    Text(
                                        text = "$ 100.00",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 14.sp,
                                        color = cottonBall,
                                    )
                                }
                                Button(
                                    onClick = { /*TODO*/ },
                                    elevation = null,
                                    shape = RoundedCornerShape(16.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        backgroundColor = green
                                    ),
                                ) {
                                    Text(
                                        text = stringResource(R.string.text_confirm),
                                        color = white,
                                        fontSize = 12.sp
                                    )
                                }

                            }
                        }
                    }
                }
            })
    }
}