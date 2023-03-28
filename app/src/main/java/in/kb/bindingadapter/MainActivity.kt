package `in`.kb.bindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import `in`.kb.bindingadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val post = Post(
            "Introduction to Kotlin",
            "Kuldeep",
            "https://www.vectorlogo.zone/logos/kotlinlang/kotlinlang-ar21.png"
        )


        binding.post = post
    }
}