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

        val apple = Word(R.drawable.apple, "りんご")
        val banana = Word(R.drawable.banana, "バナナ")
        val orange = Word(R.drawable.orange, "オレンジ")
        val strawberry = Word(R.drawable.strawberry, "いちご")

        addWord(apple)
        addWord(banana)
        addWord(orange)
        addWord(strawberry)


    }

    private fun addWord(word: Word) {
        val nameTextView = TextView(applicationContext)

        nameTextView.text = word.name
//        container.addView(nameTextView)

        val layout = LinearLayout(this.applicationContext)
        layout.orientation = LinearLayout.HORIZONTAL
        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)
        imageView.adjustViewBounds = true
        imageView.maxHeight = 200

        layout.addView(imageView)
        layout.addView(nameTextView)
        container.addView(layout)
    }



}
