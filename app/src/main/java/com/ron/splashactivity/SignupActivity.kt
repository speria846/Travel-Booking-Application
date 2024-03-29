package com.ron.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.ron.splashactivity.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    lateinit var binding:ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignit.setOnClickListener { validation()}
        binding.tvLogin.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
//        btnsignup.setOnClickListener {
//            val intent=Intent(this,HomeActivity::class.java)
//            startActivity(intent                                 )
//        }

    }
    fun validation() {
        var error = false
        binding.tilName.error = null
        binding.tilName2.error = null
        binding.tilEmail.error = null
        binding.tilConfirm.error = null
        binding.tilPassward.error = null

        val name = binding.etName.text.toString()
        if (name.isBlank()) {
            binding.tilName.error = "First Name is required"
            error = true

        }
        val name2 = binding.etname2.text.toString()
        if (name2.isBlank()) {
            binding.tilName2.error = "Name is required"
            error = true

        }
        val email = binding.etEmail.text.toString()
        if (email.isBlank()) {
            binding.tilEmail.error = "Email is required"
            error = true

        }
//
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.tilEmail.error="Not a valid email address"
            error=true
        }

        val passward = binding.etPassward.text.toString()
        if (passward.isBlank()) {
            binding.tilPassward.error = "Enter the passward"
            error=true


        }
        val confirm = binding.etConfirm.text.toString()
        if (confirm.isBlank()) {
            binding.tilConfirm.error = "Enter the correct passward"
            error=true
        }
        if (passward!=confirm){
            binding.tilConfirm.error="doesnot match"
            error=true
        }



        if(error==true){

        }
    }}

