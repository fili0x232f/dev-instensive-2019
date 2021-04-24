package ru.skillbranch.devintensive.models

class UserView(
    var id : String,
    var fullName : String,
    var nickName : String,
    var avatar : String?,
    var status: String = "offline",
    var initials: String?
) {
    fun printMe()
    {
        println("""
            id: $id;
            fullName: $fullName;
            nickName: $nickName;
            avatar: $avatar;
            status: $status;
            initials: $initials;
        """.trimIndent())
    }
}

