package com.cc221023.arcanemind.ui

sealed class Screens (val route:String){
    object Home: Screens("home")
    object DrawDaily: Screens("drawDaily")
    object Info: Screens("info")
    object Account: Screens("account")
    object DrawDailyResult: Screens("drawDailyResult")
    object EditCard: Screens("editCard")
    object MajorArcana: Screens("MajorArcana")
    object MinorArcana: Screens("MinorArcana")
}
