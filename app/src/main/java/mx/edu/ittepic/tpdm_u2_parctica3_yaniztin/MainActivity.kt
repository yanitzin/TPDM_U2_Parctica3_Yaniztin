package mx.edu.ittepic.tpdm_u2_parctica3_yaniztin

import android.app.ProgressDialog
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    var rango: EditText? = null
    var boton: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rango = findViewById(R.id.rango)
        boton = findViewById(R.id.boton)

        boton?.setOnClickListener() {
            var r = rango?.text.toString()



        }

    }

    internal inner class Task1 : AsyncTask<Void, Void, String>() {

        override fun onPreExecute() {
          boton?.setEnabled(false);
        }

        override fun doInBackground(vararg p0: Void?): String {
            try{
                Thread.sleep(5000)

            }catch (e : InterruptedException){
                e.printStackTrace();
            }
            return ""
        }

        override fun onPostExecute(result: String?) {
            boton?.setEnabled(false);

        }

    }

}