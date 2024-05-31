package com.example.fragments

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.fragments.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonClock = findViewById<Button>(R.id.btntime)
        val buttonExam = findViewById<Button>(R.id.btnexam)
        val buttonVal = findViewById<Button>(R.id.btnvalidate)

        buttonClock.setOnClickListener {
            replaceFramewithFragment(ClockFragment())
        }


        buttonExam.setOnClickListener{
            replaceFramewithFragment(ExamFragment())
        }

        buttonVal.setOnClickListener{
            replaceFramewithFragment(LoginFragment())
        }
    }


    private fun replaceFramewithFragment(frag: Fragment) {

        val fragmanager = supportFragmentManager
        val fragTransaction = fragmanager.beginTransaction()
        fragTransaction.replace(R.id.framelayout, frag)
        fragTransaction.commit()

    }
}
