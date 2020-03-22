package ge.beka.lecture2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init();
    }

    private fun init(){
        signInButton.setOnClickListener {

            if (emailInput.text.toString().isNotEmpty() && passwordInput.text.isNotEmpty()){
                Toast.makeText(this, "Login is success", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            }

        }
    }


}

