package com.example.components

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.components.R.*
import com.example.components.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityDetailsBinding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupToolbar(binding.toolbar, string.login, onBack =  {
            startActivity(Intent(this@DetailsActivity, MainActivity::class.java))
            finish()
        })

        setUpButton(binding.button, string.login){
                finish()
        }

        setUpImageButton(binding.item, drawable.ic_subscriptions, string.Subscription){
            finish()
        }

        setUpblock(binding.block, drawable.ic_expense, R.string.shopping)
        setUpblock(binding.blockTwo,R.drawable.ic_expense,R.string.expense)

        setUpCamera(binding.aa, drawable.ic_document_scanner,R.string.documents)
        setUpCamera(binding.abc,R.drawable.ic_expense,R.string.expense)
    }
}