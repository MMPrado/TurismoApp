package com.example.turismoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.actividad_principal.*

class ActividadPrincipal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_principal)


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_simple, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var msg: String = ""
        //Switch
        when (item.itemId){
            R.id.itmCabos ->  {startActivity(Intent(this, CabosActivity::class.java)) }
            R.id.itmCancun -> {startActivity(Intent(this, CancunActivity::class.java))}
            R.id.itmVallarta -> {startActivity(Intent(this, VallartaActivity::class.java))}
            R.id.itmRivera -> {startActivity(Intent(this, RiveraActivity::class.java))}

        }
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}
