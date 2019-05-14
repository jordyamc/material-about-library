package com.danielstone.materialaboutlibrary.model

fun materialAboutList(builder: MaterialAboutList.Builder.() -> Unit = {}): MaterialAboutList {
    val mBuilder = MaterialAboutList.Builder()
    builder(mBuilder)
    return mBuilder.build()
}

fun MaterialAboutList.Builder.card(builder: MaterialAboutCard.Builder.() -> Unit){
    val card = MaterialAboutCard.Builder()
    builder(card)
    addCard(card.build())
}