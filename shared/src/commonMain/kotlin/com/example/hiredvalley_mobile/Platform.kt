package com.example.hiredvalley_mobile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform