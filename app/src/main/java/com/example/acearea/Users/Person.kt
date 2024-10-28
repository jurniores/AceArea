package com.example.acearea.Users

import com.example.acearea.Users.Area.Area

data class Person(var username: String, var master: Int, var link:String, var image: Int) :IPerson{
    override fun getArea(): List<Area> {
        TODO("Not yet implemented")
    }

}



