package com.example.android

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 바인딩 객체
        val binging = ActivityMainBinding.inflate(layoutInflater)

        // 액티비티 화면 출력
        setContentView(binging.root)
//        setContentView(R.layout.activity_main)

        val textView1:TextView = findViewById(R.id.text1)

        val button1:Button=findViewById(R.id.btn1)
        val targetView:Button = findViewById(R.id.btn2)


        button1.setOnClickListener{
            if(targetView.visibility==View.VISIBLE){
                targetView.visibility = View.INVISIBLE
            } else{
                targetView.visibility = View.VISIBLE
            }

        }
        // 제네릭도 가능
//        val textView2=findViewById<TextView>(R.id.text1)



        // MainActivity에 화면표기
        /*
        // 이름 문자열 출력 TextView
        val name = TextView(this).apply{
            typeface= Typeface.DEFAULT_BOLD
            text = "hello Android!"
        }

        // 이미지 출력 ImageView
        val image = ImageView(this).also{
            it.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dog1))
        }
        val introduce = TextView(this).apply {
            typeface = Typeface.DEFAULT_BOLD
            text = "반려견 뽀또입니다!"
        }

        val layout = LinearLayout(this).apply{
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            // LinearLayout 객체에 문자열 2개, 그림 추가
            addView(name, WRAP_CONTENT, WRAP_CONTENT)
            addView(image, WRAP_CONTENT, WRAP_CONTENT)
            addView(introduce, WRAP_CONTENT, WRAP_CONTENT)
        }
        // LinearLayout을 화면에 출력
        setContentView(layout)
    */
    }
}