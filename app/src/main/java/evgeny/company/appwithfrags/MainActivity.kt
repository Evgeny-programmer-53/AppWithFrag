package evgeny.company.appwithfrags

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), MyRouter {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, FirstFragment())
            .commit()
    }

    override fun openSecondFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, SecondFragment())
            .addToBackStack("")
            .commit()
    }
}