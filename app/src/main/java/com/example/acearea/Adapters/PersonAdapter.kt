package com.example.acearea.Adapters

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.acearea.R
import com.example.acearea.Users.Person

class PersonAdapter(
    private val dataPerson: List<Person>,
    private val rView: RecyclerView,
    private val context: Context
) :
    RecyclerView.Adapter<PersonAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textName: TextView = view.findViewById(R.id.text_view_name)
        val textMaster: TextView = view.findViewById(R.id.text_view_master)
        val imagePerson: ImageView = view.findViewById(R.id.image_person)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.person_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = dataPerson.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person = dataPerson[position]
        holder.textName.text = person.username
        when (person.master) {
            1 -> {
                holder.textMaster.setText("Colaborador")
                holder.textMaster.setTextColor(context.getColor(R.color.colorColaborador))
            }
            2 -> {
                holder.textMaster.setText("Supervisor")
                holder.textMaster.setTextColor(context.getColor(R.color.colorSupervisor))
            }

            3 -> {
                holder.textMaster.setText("Gestor")
                holder.textMaster.setTextColor(context.getColor(R.color.colorOnSecondary))

            }
            4 -> {
                holder.textMaster.setText("Superintendente")
                holder.textMaster.setTextColor(context.getColor(R.color.colorPrimary))
            }
        }
        holder.imagePerson.setImageResource(person.image)
        holder.itemView.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(person.link))
            

            holder.itemView.context.startActivity(intent)
        }

    }

    fun Init() {
        rView.layoutManager = LinearLayoutManager(context)
        rView.adapter = this
    }
}