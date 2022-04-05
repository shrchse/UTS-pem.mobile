package com.example.myapp.data

import com.example.myapp.R
import com.example.myapp.model.Object

class Datasources {
    fun loadObject(): List<Object>{
        return listOf(
            Object(R.string.obj1,R.string.pt1,R.string.cap1, R.drawable.pic1),
            Object(R.string.obj2,R.string.pt2,R.string.cap2, R.drawable.pic2),
            Object(R.string.obj3,R.string.pt3,R.string.cap3, R.drawable.pic3),
            Object(R.string.obj4,R.string.pt4,R.string.cap4, R.drawable.pic4),
            Object(R.string.obj5,R.string.pt5,R.string.cap5, R.drawable.pic5),
            Object(R.string.obj6,R.string.pt6,R.string.cap6, R.drawable.pic6),
            Object(R.string.obj7,R.string.pt7,R.string.cap7, R.drawable.pic7),
            Object(R.string.obj8,R.string.pt8,R.string.cap8, R.drawable.pic8),
            Object(R.string.obj9,R.string.pt9,R.string.cap9, R.drawable.pic9),
            Object(R.string.obj10,R.string.pt10,R.string.cap10, R.drawable.pic10),
        )
    }
}