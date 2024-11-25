package id.netra.netraai.ui.convertvoice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import id.netra.netraai.R
import id.netra.netraai.databinding.ActivityConvertVoiceBinding

class ConvertVoiceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConvertVoiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConvertVoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}