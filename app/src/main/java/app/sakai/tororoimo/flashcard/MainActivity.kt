package app.sakai.tororoimo.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val customWords: Array<CustomWord> = arrayOf(CustomWord(R.drawable.apple, "りんご", "apple"),
                                                CustomWord(R.drawable.banana, "バナナ", "banana"),
                                                CustomWord(R.drawable.orange, "オレンジ", "orange"),
                                                CustomWord(R.drawable.strawberry, "いちご", "strawberry"))

//        customWords[0] = CustomWord(R.drawable.apple, "りんご", "apple")
//        customWords[1] = CustomWord(R.drawable.banana, "バナナ", "banana")
//        customWords[2] = CustomWord(R.drawable.orange, "オレンジ", "orange")
//        customWords[3] = CustomWord(R.drawable.strawberry, "いちご", "strawberry")

        for (i in 0..3) {
            addWord(customWords[i])
        }


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
