package com.example.android

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.example.android.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 바인딩 객체
        val binging = ActivityMainBinding.inflate(layoutInflater)

        // 화면 전환
        val nextBtn:Button=findViewById(R.id.nextbtn)
        nextBtn.setOnClickListener{
            Toast.makeText(this, "gogo", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        }

        binging.imageView.setOnClickListener{
            Log.d("JIN", "강아지 클릭 이벤트")
        }

        /*
        //터치 이벤트
        override fun onTouchEvent(event: MotionEvent?): Boolean {
            when(event?.action){
                MotionEvent.ACTION_DOWN ->{
                    Log.d("jin","Touch down")
                    println("touch down x = ${event.x}, rawX = ${event.rawX}")
                }
                MotionEvent.ACTION_UP ->{
                    Log.d("jin","Touch up")
                    println("touch up x = ${event.x}, rawX = ${event.rawX}")
                }
            }
            return super.onTouchEvent(event)
        }

        override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
            when(keyCode){
                KeyEvent.KEYCODE_BACK -> Log.d("jin","BACK Button")
                KeyEvent.KEYCODE_VOLUME_UP -> Log.d("jin","Volume up Button")
                KeyEvent.KEYCODE_VOLUME_DOWN -> Log.d("jin","Volume down Button")
            }

            return super.onKeyDown(keyCode, event)
        }

        fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
            Log.d("jin","onKeyUp")
            return super.onKeyUp(keyCode, event)
        }
*/
        // 뒤로가기 이벤트
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Log.d("Jin","Back Button")
            }
        })

        // 액티비티 화면 출력
//        setContentView(binging.root)

        val textView1:TextView = findViewById(R.id.text1)

        val button1:Button=findViewById(R.id.btn1)
        val targetView:Button = findViewById(R.id.btn2)


        button1.setOnClickListener{
            if(targetView.visibility==View.VISIBLE){
                Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
                targetView.visibility = View.INVISIBLE
            } else{
                Toast.makeText(this, "clickxxx", Toast.LENGTH_SHORT).show()
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

