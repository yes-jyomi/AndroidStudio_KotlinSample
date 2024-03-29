package kr.hs.emirim.Sagittta.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_control.*

class ControlKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_control)

        button.setOnClickListener {
            val number = numberField.text.toString().toInt()

//            if (number % 2 == 0) {
//                Toast.makeText(applicationContext,
//                    "2의 배수 : ${number}",
//                    Toast.LENGTH_SHORT).show()
//            } else if (number % 3 == 0) {
//                Toast.makeText(applicationContext,
//                    "3의 배수 : ${number}",
//                    Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(applicationContext,
//                    "${number}",
//                    Toast.LENGTH_SHORT).show()
//            }

//            when {
//                number % 2 == 0 -> Toast.makeText(applicationContext,
//                    "2의 배수 : ${number}",
//                    Toast.LENGTH_SHORT).show()
//                number % 3 == 0 -> Toast.makeText(applicationContext,
//                    "3의 배수 : ${number}",
//                    Toast.LENGTH_SHORT).show()
//                else -> Toast.makeText(applicationContext,
//                    "${number}",
//                    Toast.LENGTH_SHORT).show()
//            }

            when {                  //help함수 사용.
                number % 2 == 0 -> toastShort("${number} 는 2의 배수입니다.")
                number % 3 == 0 -> toastShort("${number} 는 3의 배수입니다.")
                else -> toastLong("${number}")
            }

            when (number) {
                in 1..4 -> button.text = "실행 - 4"
                9, 18 -> {
                    button.text = "실행 - 9"
                }
                else -> button.text = "실행"
            }

        }
    }
}
