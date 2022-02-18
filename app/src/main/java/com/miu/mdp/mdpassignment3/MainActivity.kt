package com.miu.mdp.mdpassignment3

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.miu.mdp.mdpassignment3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        with(mainBinding) {
            addBtn.setOnClickListener {
                val androidName = androidVersionCol.text.toString()
                val androidCode = androidVersionCode.text.toString()

                val tableRow = TableRow(this@MainActivity)
                val tableParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).also {
                    it.topMargin = 5
                    it.bottomMargin = 5
                }
                tableRow.layoutParams = tableParams


                val leftColText = TextView(this@MainActivity)
                leftColText.text = androidName

                val middleText = TextView(this@MainActivity)

                val rightColText = TextView(this@MainActivity)
                rightColText.text = androidCode

                with(tableRow) {
                    setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))
                    addView(leftColText, 0)
                    addView(middleText, 1)
                    addView(rightColText, 2)
                }

                tableLayout.addView(tableRow)
            }
        }


    }
}
