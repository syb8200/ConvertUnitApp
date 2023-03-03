package fastcampus.part1.fc_chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import fastcampus.part1.fc_chapter3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view  = binding.root
        setContentView(view)

        val outputTextView = binding.outputTextView
        val outputUnitTextView = binding.outputUnitTextView
        val inputEditText = binding.inputEditText
        val inputUnitTextView = binding.inputUnitTextView

        var inputNumber : Int = 0

        inputEditText.addTextChangedListener { text ->
            inputNumber = if(text.isNullOrEmpty()) {
                0
            } else {
                text.toString().toInt()
            }

            var outputNumber = inputNumber.times(0.01)
            outputTextView.text = outputNumber.toString()
        }
    }
}