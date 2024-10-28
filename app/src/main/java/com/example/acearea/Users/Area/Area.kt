package com.example.acearea.Users.Area

class Area(var nameArea: String) {
    var block = mutableListOf <Block>()
    data class Block(var block: Int, var lat: String, var log: String)

}