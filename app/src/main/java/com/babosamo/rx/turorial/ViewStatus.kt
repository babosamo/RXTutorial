package com.babosamo.rx.turorial

sealed class ViewStatus {
    object HOME : ViewStatus()
    object OBSERVABLE : ViewStatus()
    object OPERATOR : ViewStatus()
}