package com.example.acearea


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.acearea.Adapters.PersonAdapter
import com.example.acearea.Users.Person
import com.example.acearea.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val dataPerson = listOf(

            Person("Tatiana",4,"https://www.google.com/maps/d/u/0/edit?mid=1cC8jDD3w39jzakmVp9ixXiWGYMMoa7c&usp=sharing",R.drawable.taty),
            Person("Alciene Pimentel",3,"https://www.google.com/maps/d/u/0/edit?mid=1cC8jDD3w39jzakmVp9ixXiWGYMMoa7c&usp=sharing",R.drawable.alci),
            Person("Roberto Santos",2,"https://www.google.com/maps/d/u/0/edit?mid=1cC8jDD3w39jzakmVp9ixXiWGYMMoa7c&usp=sharing",R.drawable.roberto),
            Person("Virgínia Gusmão",1,"https://www.google.com/maps/d/u/0/edit?mid=1cC8jDD3w39jzakmVp9ixXiWGYMMoa7c&usp=sharing",R.drawable.virginia),
            Person("Carla Rodrigues",1,"https://www.google.com/maps/d/u/0/edit?mid=1cC8jDD3w39jzakmVp9ixXiWGYMMoa7c&usp=sharing",R.drawable.carla),
            Person("Andreia Mello",1,"https://www.google.com/maps/d/u/0/edit?mid=1cC8jDD3w39jzakmVp9ixXiWGYMMoa7c&usp=sharing",R.drawable.andreia),
            Person("Raquel",1,"https://www.google.com/maps/d/u/0/edit?mid=1cC8jDD3w39jzakmVp9ixXiWGYMMoa7c&usp=sharing",R.drawable.raquel),
            Person("Will",1,"https://www.google.com/maps/d/u/0/edit?mid=1cC8jDD3w39jzakmVp9ixXiWGYMMoa7c&usp=sharing",R.drawable.will),
            Person("Thamirys Felima",1,"https://www.google.com/maps/d/u/0/edit?mid=1cC8jDD3w39jzakmVp9ixXiWGYMMoa7c&usp=sharing",R.drawable.thamrys),
            Person("Odair José",1,"https://www.google.com/maps/d/u/0/edit?mid=1cC8jDD3w39jzakmVp9ixXiWGYMMoa7c&usp=sharing",R.drawable.odair),
            Person("Nice",1,"https://www.google.com/maps/d/u/0/edit?mid=1cC8jDD3w39jzakmVp9ixXiWGYMMoa7c&usp=sharing",R.drawable.baseline_person_24),
            Person("Antonio Júnior",1,"https://www.google.com/maps/d/u/0/edit?mid=1cC8jDD3w39jzakmVp9ixXiWGYMMoa7c&usp=sharing",R.drawable.antonio),
            Person("Lucas Rafael",1,"https://www.google.com/maps/d/u/0/edit?mid=1cC8jDD3w39jzakmVp9ixXiWGYMMoa7c&usp=sharing",R.drawable.lucas),
            Person("Luciano Jesus",1,"https://www.google.com/maps/d/u/0/edit?mid=1cC8jDD3w39jzakmVp9ixXiWGYMMoa7c&usp=sharing",R.drawable.luciano),
        )

        val adapter = PersonAdapter(dataPerson, binding.recyclerView, applicationContext)
        adapter.Init()



        setContentView(binding.root)



        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.item_logout -> finish()
                R.id.item_denuncia -> Toast.makeText(
                    applicationContext,
                    "Denuncia",
                    Toast.LENGTH_SHORT
                ).show()
            }
            true
        }
    }

}