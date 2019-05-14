package com.danielstone.materialaboutlibrary.items

import android.content.Context
import android.graphics.drawable.Drawable
import android.net.Uri
import com.danielstone.materialaboutlibrary.ConvenienceBuilder
import com.danielstone.materialaboutlibrary.model.MaterialAboutCard

fun MaterialAboutCard.Builder.appTitleItem(context: Context) = addItem(ConvenienceBuilder.createAppTitleItem(context))

fun MaterialAboutCard.Builder.appTitleItem(appName: String, appIcon: Drawable) =
        addItem(ConvenienceBuilder.createAppTitleItem(appName, appIcon))

fun MaterialAboutCard.Builder.versionActionItem(context: Context, icon: Drawable, text: CharSequence, includeVersionCode: Boolean, onClick: () -> Unit) =
        addItem(ConvenienceBuilder.createVersionActionItem(context, icon, text, includeVersionCode).apply {
            setOnClickAction(onClick)
        })

fun MaterialAboutCard.Builder.versionActionItem(context: Context, icon: Int, text: CharSequence, includeVersionCode: Boolean, onClick: () -> Unit) =
        addItem(ConvenienceBuilder.createVersionActionItem(context, icon, text, includeVersionCode).apply {
            setOnClickAction(onClick)
        })

fun MaterialAboutCard.Builder.versionActionItem(context: Context, icon: Drawable, text: CharSequence, includeVersionCode: Boolean) =
        addItem(ConvenienceBuilder.createVersionActionItem(context, icon, text, includeVersionCode))

fun MaterialAboutCard.Builder.versionActionItem(context: Context, icon: Int, text: CharSequence, includeVersionCode: Boolean) =
        addItem(ConvenienceBuilder.createVersionActionItem(context, icon, text, includeVersionCode))

fun MaterialAboutCard.Builder.websiteActionItem(context: Context,icon:Drawable,text: CharSequence,url:Uri,showAddress :Boolean = true) =
        addItem(ConvenienceBuilder.createWebsiteActionItem(context,icon,text,showAddress,url))

fun MaterialAboutCard.Builder.websiteActionItem(context: Context,icon:Int,text: CharSequence,url:Uri,showAddress :Boolean = true) =
        addItem(ConvenienceBuilder.createWebsiteActionItem(context,icon,text,showAddress,url))

fun MaterialAboutCard.Builder.actionItem(builder : MaterialAboutActionItem.Builder.() -> Unit){
    val mBuilder = MaterialAboutActionItem.Builder()
    builder(mBuilder)
    addItem(mBuilder.build())
}

fun MaterialAboutCard.Builder.titleItem(builder: MaterialAboutTitleItem.Builder.() -> Unit) {
    val mBuilder = MaterialAboutTitleItem.Builder()
    builder(mBuilder)
    addItem(mBuilder.build())
}