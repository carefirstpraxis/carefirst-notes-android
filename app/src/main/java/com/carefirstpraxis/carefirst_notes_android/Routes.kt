package com.carefirstpraxis.carefirst_notes_android

sealed class Routes(val route: String) {
  object SignUp : Routes("SignUp")
  object ForgotPassword : Routes("ForgotPassword")
  object Login : Routes("Login")
  object Dashboard : Routes("Dashboard")
  object Home : Routes("Home")
}