package com.cc221023.arcanemind.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cc221023.arcanemind.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import com.cc221023.arcanemind.ui.theme.Black
import com.cc221023.arcanemind.ui.theme.EggShelly
import com.cc221023.arcanemind.ui.theme.SubheadingGray
import com.cc221023.arcanemind.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView(mainViewModel: MainViewModel) {
    val state = mainViewModel.mainViewState.collectAsState()
    val navController = rememberNavController()

    Scaffold{


        NavHost(
            navController = navController,
            modifier = Modifier.padding(it),
            startDestination = Screens.Info.route
        ) {
            composable(Screens.Home.route) {
                mainViewModel.selectScreen(Screens.Home)
                HomeScreen(mainViewModel)
            }
            composable(Screens.Info.route) {
                mainViewModel.selectScreen(Screens.Info)
                InfoScreen(mainViewModel)
            }
            composable(Screens.Account.route) {
                mainViewModel.selectScreen(Screens.Account)
                AccountScreen(mainViewModel)
            }


        }
    }
}
@Composable
fun HomeScreen(mainViewModel: MainViewModel) {

Box(
    modifier = Modifier
        .fillMaxSize()
        .background(color = Black)
) {
    Image(
        painter = painterResource(id = R.drawable.alchemy),
        contentDescription = "Tarot Card",
        modifier = Modifier
            .fillMaxSize()
            .scale(2.0f)
            .alpha(0.35f)
            .padding(16.dp)
            .absoluteOffset(x = 20.dp, y = (-20).dp)
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .absoluteOffset(x = 0.dp, y = 20.dp),
    ){
        Text(
            buildAnnotatedString { append("Hello, stranger!\n")
                                 },
            fontSize = 24.sp,
            color = White,
            fontFamily = FontFamily(Font(R.font.almendra_bold, FontWeight.Light)),
        )
        Text(
            buildAnnotatedString { append("Have an arcane day!")
                                 },
            fontSize = 20.sp,
            color = SubheadingGray,
            fontFamily = FontFamily(Font(R.font.asap_regular, FontWeight.Light)),
            modifier = Modifier
            .absoluteOffset(x = 0.dp, y =(-25).dp),
        )
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(25.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 20.dp, start = 65.dp, end = 65.dp)
                .size(30.dp, 270.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = EggShelly
            ))
            {
                Text(
                    buildAnnotatedString { append("Daily card")
                    },
                    fontSize = 20.sp,
                    color = SubheadingGray,
                    fontFamily = FontFamily(Font(R.font.asap_regular, FontWeight.Light)),
                    modifier = Modifier
                        .absoluteOffset(x = 0.dp, y =(-25).dp),
                )
        }
    }
    }
}


@Composable
fun InfoScreen(mainViewModel: MainViewModel) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Black)
    ) {
        Image(
            painter = painterResource(id = R.drawable.alchemy),
            contentDescription = "Tarot Card",
            modifier = Modifier
                .fillMaxSize()
                .scale(2.0f)
                .alpha(0.35f)
                .padding(16.dp)
                .absoluteOffset(x = 20.dp, y = (-20).dp)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .padding(start = 25.dp, top = 50.dp, end = 20.dp, bottom = 20.dp)
                .absoluteOffset(x = 0.dp, y = 20.dp),
        ){
            Text(
                buildAnnotatedString { append("Your tarot archive\n")
                },
                fontSize = 24.sp,
                color = White,
                fontFamily = FontFamily(Font(R.font.almendra_bold, FontWeight.Light)),
            )
            Text(
                buildAnnotatedString { append("Stay educated!")
                },
                fontSize = 22.sp,
                color = SubheadingGray,
                fontFamily = FontFamily(Font(R.font.asap_regular, FontWeight.Light)),
                modifier = Modifier
                    .absoluteOffset(x = 0.dp, y =(-25).dp),
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                buildAnnotatedString { append("Here you can find information about tarot and the art of reading your card draws. For a more in depth interpretation the general meaning of the deck consisting of 87 cards  is split into the minor and major arcana.")
                },
                color = White,
                textAlign = TextAlign.Justify,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.asap_bold, FontWeight.Light)),
                modifier = Modifier
            )
            Spacer(modifier = Modifier.height(40.dp))

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
            {
                Button(
                    onClick = { /*Understanding tarot - page*/ },
                    shape = RoundedCornerShape(25.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(65.dp)
                    ,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = EggShelly,
                        contentColor = Black,
                        disabledContentColor = Black
                    ),
                )
                {
                    Text(
                        buildAnnotatedString { append("Understanding Tarot")
                        },
                        color = Black,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.asap_bold, FontWeight.Light)),
                        modifier = Modifier
                    )
                }
                Spacer(modifier = Modifier.height(25.dp))
                Button(
                    onClick = { /*Reading the cards - page*/ },
                    shape = RoundedCornerShape(25.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(65.dp)
                    ,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = EggShelly,
                        contentColor = Black,
                        disabledContentColor = Black
                    ),
                )
                {
                    Text(
                        buildAnnotatedString { append("Reading the cards")
                        },
                        color = Black,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.asap_bold, FontWeight.Light)),
                        modifier = Modifier
                    )
                }
                Spacer(modifier = Modifier.height(34.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                    ,
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Button(
                        onClick = { /*The minor arcana - page*/ },
                        shape = RoundedCornerShape(30.dp),
                        modifier = Modifier
                            .height(170.dp)
                            .width(160.dp)
                        ,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = EggShelly,
                            contentColor = Black,
                            disabledContentColor = Black
                        ),
                    )
                    {
                        Text(
                            buildAnnotatedString { append("The minor arcana")
                            },
                            color = Black,
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontFamily = FontFamily(Font(R.font.asap_bold, FontWeight.Light)),
                            modifier = Modifier
                        )
                    }
                    Button(
                        onClick = { /*The major arcana - page*/ },
                        shape = RoundedCornerShape(30.dp),
                        modifier = Modifier
                            .height(170.dp)
                            .width(160.dp)
                        ,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = EggShelly,
                            contentColor = Black,
                            disabledContentColor = Black
                        ),
                    )
                    {
                        Text(
                            buildAnnotatedString { append("The major arcana")
                            },
                            color = Black,
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontFamily = FontFamily(Font(R.font.asap_bold, FontWeight.Light)),
                            modifier = Modifier
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun AccountScreen(mainViewModel: MainViewModel) {

}
