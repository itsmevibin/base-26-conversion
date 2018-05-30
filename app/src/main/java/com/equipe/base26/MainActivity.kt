package com.equipe.base26

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

  val textView: TextView by lazy { findViewById<TextView>(R.id.textView) }
  val editText: EditText by lazy { findViewById<EditText>(R.id.editText) }
  val button: Button by lazy { findViewById<Button>(R.id.button) }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    Toast.makeText(this, "welcome.", Toast.LENGTH_LONG).show()
    button.setOnClickListener({
      getActualValue(editText.text.toString())
    })
  }

  private fun getActualValue(s: String) {
    print(Utils.getAlphaNumeric(s))
    textView.text = Utils.getAlphaNumeric(s).toString()
  }
}