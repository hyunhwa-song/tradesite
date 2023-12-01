package com.example.tradesite.chatlist

data class ChatItem(
    val senderId: String,
    val message: String
) {

    constructor(): this("", "")
}