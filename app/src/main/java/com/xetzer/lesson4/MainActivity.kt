package com.xetzer.lesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

const val TAG = "MainActivity"
const val POEMTAG = "Poem"

class MainActivity : AppCompatActivity() {
    private val poem: ArrayList<String> = arrayListOf(
        "В Академии наук",
        "Заседает князь Дундук",
        "Говорят, не подобает",
        "Дундуку такая честь;",
        "Почему ж он заседает?",
        "Потому что есть чем сесть.",
        "А.С.Пушкин"
    )

    // Жизненный цикл приложения
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloTextView: TextView = findViewById(R.id.hello_world_text_view)
        helloTextView.text = "Hello World"
        val nextText: Button = findViewById(R.id.view_text_button)
        Log.d(TAG, "onCreate")
        Log.i(POEMTAG, poem[0])
        nextText.setOnClickListener {
            helloTextView.text = "Nice day!"
            Toast.makeText(this, helloTextView.text, Toast.LENGTH_LONG).show()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
        Log.i(POEMTAG, poem[1])
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
        Log.i(POEMTAG, poem[2])
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
        Log.i(POEMTAG, poem[3])
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
        Log.i(POEMTAG, poem[4])
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
        Log.i(POEMTAG, poem[5])
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
        Log.i(POEMTAG, poem[6])
    }
}