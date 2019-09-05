package com.hjl.artisan.app

interface TTS {
    fun playText(playText: String)

    fun stopSpeak()
}