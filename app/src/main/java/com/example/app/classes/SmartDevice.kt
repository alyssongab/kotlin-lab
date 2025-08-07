package com.example.app.classes

class SmartDevice {

    val name: String = "Android TV";
    val category: String = "Entertainment";
    val deviceStatus: String = "online";

    fun turnOn(){
        println("Smart device is turned on");
    }

    fun turnOff(){
        println("Smart device is turned off");
    }
}