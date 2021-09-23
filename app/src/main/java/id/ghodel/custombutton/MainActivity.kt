package id.ghodel.custombutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.about -> {
                Toast.makeText(applicationContext, "About clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.setting -> {
                Toast.makeText(applicationContext, "Setting clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.exit -> {
                Toast.makeText(applicationContext, "Exit clicked", Toast.LENGTH_SHORT).show()
                finish()
            }
            R.id.android -> {
                Toast.makeText(applicationContext, "Android icon clicked", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}