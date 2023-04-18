package com.earl.coreui

import android.graphics.Bitmap

fun cropImage(resource: Bitmap, verticalCropPx: Int, horizontalCropPx: Int): Bitmap {
    val width = resource.width
    val height = resource.height
    val newWidth = width - horizontalCropPx
    val newHeight = height - verticalCropPx
    return Bitmap.createBitmap(resource, 1, 1, newWidth, newHeight)
}

