package dahlia.com.example.navigationdrawerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dahlia.com.example.navigationdrawerapp.databinding.ActivitySubwayBinding

class SubwayActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySubwayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySubwayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarSubway)
        binding.toolbarSubway.setTitleTextColor(
            resources.getColor(android.R.color.white, theme)
        )
    }
}