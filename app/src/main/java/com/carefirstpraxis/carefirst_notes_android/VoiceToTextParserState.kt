package com.carefirstpraxis.carefirst_notes_android

data class VoiceToTextParserState(
  val isSpeaking: Boolean = false,
  val spokenText: String = "",
  val error: String? = null
)