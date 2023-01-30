package com.example.ch10

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.os.Bundle
import android.util.Log
import android.widget.DatePicker
import androidx.appcompat.app.AppCompatActivity
import com.example.ch10.databinding.ActivityMainBinding
import com.example.ch10.databinding.DialogInputBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        // 퍼미션
//        val permissionLauncher = registerForActivityResult(
//            ActivityResultContracts.RequestMultiplePermissions()
//        ) {
//            if (it.all { permission -> permission.value == true }) {
//                noti()
//            } else {
//                Toast.makeText(this, "permission denied....", Toast.LENGTH_SHORT).show()
//            }
//        }
        
        // 선택박스 및 알림창
        val dialogBinding = DialogInputBinding.inflate(layoutInflater)
        AlertDialog.Builder(this).run {
            setTitle("Input")
            setView(dialogBinding.root)
            setPositiveButton("닫기",null)
            show()
        }

        // 날짜 다이어로그
        DatePickerDialog(this, object:DatePickerDialog.OnDateSetListener{
            override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
                Log.d("jin","year : $p1, month : ${p2+1}, dayOfMonty : $p3")
            }
        }, 2020,8,21).show()

    }

}
