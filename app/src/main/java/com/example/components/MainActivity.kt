package com.example.components

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.components.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            setupToolbar(binding.toolbar, R.string.sign_up) {
                finish()
            }
            nextBtn.setOnClickListener {
                val intent = Intent(this@MainActivity, DetailsActivity::class.java)
                startActivity(intent)
            }
        }

        binding.apply {
            setUpButton(binding.button, R.string.signin) {
                val intent = Intent(this@MainActivity, DetailsActivity::class.java)
                startActivity(intent)
            }
        }

            setUpImageButton(binding.item, R.drawable.ic_shopping_basket, R.string.shopping) {
                finish()
            }

        binding.apply {
            setUpblock(binding.block, R.drawable.ic_camera, R.string.income)
            setUpblock(binding.blockTwo,R.drawable.ic_expense,R.string.income)
        }

        setUpCamera(binding.aa, R.drawable.ic_image, R.string.image)
        setUpCamera(binding.abc,R.drawable.ic_expense,R.string.expense)

    }

}
