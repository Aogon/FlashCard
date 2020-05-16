package app.sakai.tororoimo.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apple = CustomWord(R.drawable.apple, "りんご", "apple")
        val banana = CustomWord(R.drawable.banana, "バナナ", "banana")
        val orange = CustomWord(R.drawable.orange, "オレンジ", "orange")
        val strawberry = CustomWord(R.drawable.strawberry, "いちご", "strawberry")


        addWord(apple)
        addWord(banana)
        addWord(orange)
        addWord(strawberry)


    }

    private fun addWord(CustomWord: CustomWord) {
        val nameTextView1 = TextView(applicationContext)
        nameTextView1.text = CustomWord.japanese

        val nameTextView2 = TextView(applicationContext)
        nameTextView2.text = CustomWord.english


//        container.addView(nameTextView)

        val layout = LinearLayout(this.applicationContext)
        layout.orientation = LinearLayout.HORIZONTAL
        val imageView = ImageView(this)
        imageView.setImageResource(CustomWord.resId)
        imageView.adjustViewBounds = true
        imageView.maxHeight = 200

        layout.addView(imageView)
        layout.addView(nameTextView1)
        layout.addView(nameTextView2)
        container.addView(layout)
    }





}
