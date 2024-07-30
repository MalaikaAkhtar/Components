package com.example.components

import androidx.annotation.DrawableRes
import com.example.components.databinding.ComponentBlockBinding
import com.example.components.databinding.ComponentButtonBinding
import com.example.components.databinding.ComponentCameraBinding
import com.example.components.databinding.ComponentItemBinding
import com.example.components.databinding.ComponentToolbarBinding

fun setupToolbar(toolbar: ComponentToolbarBinding, title: Int, onBack: () -> Unit){
    toolbar.titleTV.text = toolbar.root.context.getString(title)
    toolbar.backIV.setOnClickListener {
        onBack.invoke()
    }
}

fun setUpButton(button: ComponentButtonBinding, title: Int, function: () -> Unit){
    button.button.text = button.root.context.getString(title)
    button.button.setOnClickListener {
        function.invoke()
    }
}

fun setUpImageButton(item: ComponentItemBinding, imageRes: Int, title: Int, function: () -> Unit){
    item.item.text = item.root.context.getText(title)
    item.imageBtn.setImageResource(imageRes)
    item.imageBtn.setOnClickListener {
        function.invoke()
    }
}

fun setUpblock(block: ComponentBlockBinding,@DrawableRes imageRes: Int, title: Int){
    block.camera.setImageResource(imageRes)
    block.income.text = block.root.context.getText(title)
    block.expense.text = block.root.context.getText(title)
}

fun setUpCamera(camera: ComponentCameraBinding,@DrawableRes imageRes: Int, title: Int){
    camera.gallery.setImageResource(imageRes)
    camera.image.text = camera.root.context.getText(title)


}