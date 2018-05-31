package com.equipe.base26

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  val textView: TextView by lazy { findViewById<TextView>(R.id.textView) }
  val editText: EditText by lazy { findViewById<EditText>(R.id.editText) }
  val button: Button by lazy { findViewById<Button>(R.id.button) }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    button.setOnClickListener({
      setNumericValue(getActualValue(editText.text.toString()))

    })
  }

  fun setNumericValue(actualValue: String) {
    textView.text = actualValue
  }

  fun getActualValue(s: String): String {
    return Utils.getAlphaNumeric(s).toString()
  }
}