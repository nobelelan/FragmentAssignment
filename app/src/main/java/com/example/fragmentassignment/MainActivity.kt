package com.example.fragmentassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var detailsFragment: DetailsFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        detailsFragment = supportFragmentManager.findFragmentById(R.id.details_fragment_layout) as DetailsFragment

        binding.apply {
            val buttons = listOf(
                btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN,
                btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ
            )
            buttons.forEach { button->
                button.setOnClickListener {
                    detailsFragment.updateText(button.text.toString())
                }
            }
        }
    }
}