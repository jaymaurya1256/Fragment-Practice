package com.example.fragmentpractic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.fragmentpractic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var fragment = 1
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
                            as NavHostFragment
        navController = navHostFragment.navController

        binding.button1.setOnClickListener{
            when(fragment){
                1 -> {val action = Fragment1Directions.actionFragment1Self()
                navController.navigate(action)}
                2 -> { fragment = 1
                    val action = Fragment2Directions.actionFragment2ToFragment1()
                    navController.navigate(action) }
                3 -> { fragment = 1
                    val action = Fragment3Directions.actionFragment3ToFragment1()
                    navController.navigate(action)}
                4 -> { fragment = 1
                    val action = Fragment4Directions.actionFragment4ToFragment1()
                    navController.navigate(action)}
                5 -> { fragment = 1
                    val action = Fragment5Directions.actionFragment5ToFragment1()
                    navController.navigate(action)}
            }
        }
        binding.button2.setOnClickListener{
            when(fragment){
                1 -> {fragment = 2
                    val action = Fragment1Directions.actionFragment1ToFragment2()
                    navController.navigate(action)}
                2 -> { val action = Fragment2Directions.actionFragment2Self()
                    navController.navigate(action) }
                3 -> { fragment = 2
                    val action = Fragment3Directions.actionFragment3ToFragment2()
                    navController.navigate(action)}
                4 -> { fragment = 2
                    val action = Fragment4Directions.actionFragment4ToFragment2()
                    navController.navigate(action)}
                5 -> { fragment = 2
                    val action = Fragment5Directions.actionFragment5ToFragment2()
                    navController.navigate(action)}
            }
        }
        binding.button3.setOnClickListener{
            when(fragment){
                1 -> {fragment = 3
                    val action = Fragment1Directions.actionFragment1ToFragment3()
                    navController.navigate(action)}
                2 -> { fragment = 3
                    val action = Fragment2Directions.actionFragment2ToFragment3()
                    navController.navigate(action) }
                3 -> { val action = Fragment3Directions.actionFragment3Self()
                    navController.navigate(action)}
                4 -> { fragment = 3
                    val action = Fragment4Directions.actionFragment4ToFragment3()
                    navController.navigate(action)}
                5 -> { fragment = 3
                    val action = Fragment5Directions.actionFragment5ToFragment3()
                    navController.navigate(action)}
            }
        }
        binding.button4.setOnClickListener{
            when(fragment){
                1 -> {fragment = 4
                    val action = Fragment1Directions.actionFragment1ToFragment4()
                    navController.navigate(action)}
                2 -> { fragment = 4
                    val action = Fragment2Directions.actionFragment2ToFragment4()
                    navController.navigate(action) }
                3 -> {fragment = 4
                    val action = Fragment3Directions.actionFragment3ToFragment4()
                    navController.navigate(action)}
                4 -> { val action = Fragment4Directions.actionFragment4Self()
                    navController.navigate(action)}
                5 -> { fragment = 4
                    val action = Fragment5Directions.actionFragment5ToFragment4()
                    navController.navigate(action)}
            }
        }
        binding.button5.setOnClickListener{
            when(fragment){
                1 -> {fragment = 5
                    val action = Fragment1Directions.actionFragment1ToFragment5()
                    navController.navigate(action)}
                2 -> { fragment = 5
                    val action = Fragment2Directions.actionFragment2ToFragment5()
                    navController.navigate(action) }
                3 -> { fragment = 5
                    val action = Fragment3Directions.actionFragment3ToFragment5()
                    navController.navigate(action)}
                4 -> { fragment = 5
                    val action = Fragment4Directions.actionFragment4ToFragment5()
                    navController.navigate(action)}
                5 -> { val action = Fragment5Directions.actionFragment5Self()
                    navController.navigate(action)}
            }
        }


    }
}