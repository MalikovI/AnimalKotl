package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var isCat: Boolean = false
    var isDog: Boolean = false
    var isHorse: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker();
    }

    fun getName(): Int {
        return 0
    }

    fun getAnimal() = "Animal"
    fun getNumber(): String {
        return ""
    }

    private fun initClicker() {
        with(binding) {
            btnCat.setOnClickListener {
                animalImg.setImageResource(R.drawable.cat)
                isDog = false
                isHorse = false
                isCat = true
            }
            btnDog.setOnClickListener {
                animalImg.setImageResource(R.drawable.dog)
                isDog = true
                isHorse = false
                isCat = false
            }
            btnHorse.setOnClickListener {
                animalImg.setImageResource(R.drawable.horse)
                isDog = false
                isHorse = true
                isCat = false
            }
            btnIsDog.setOnClickListener {
                if (isDog) {
                    Toast.makeText(applicationContext, "True", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "False", Toast.LENGTH_SHORT).show()
                }
                btnIsCat.setOnClickListener {
                    if (isCat) {
                        Toast.makeText(applicationContext, "True", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext, "False", Toast.LENGTH_SHORT).show()
                    }
                    btnIsHorse.setOnClickListener {
                        if (isHorse) {
                            Toast.makeText(applicationContext, "True", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(applicationContext, "False", Toast.LENGTH_SHORT).show()

                        }
                        nextScreen.setOnClickListener {
                            val intent = Intent(this@MainActivity, ResultActivity::class.java)
                           val animalName: String = ""

                            }
                                }
                        startActivity(intent)
                            }

                        }


                    }
                }
            }
