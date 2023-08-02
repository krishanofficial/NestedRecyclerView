package com.example.nested_recyclerview

data class ParentItem(val title : String ,
                      val logo : Int ,
                      val mList : List<ChildItem>)