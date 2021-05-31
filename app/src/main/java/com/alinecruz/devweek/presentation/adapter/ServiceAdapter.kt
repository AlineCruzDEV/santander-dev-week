package com.alinecruz.devweek.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.alinecruz.devweek.R
import com.alinecruz.devweek.data.AvailableService

class ServiceAdapter(private val listServices: List<AvailableService>, private val context: FragmentActivity?) :  RecyclerView.Adapter<ServiceAdapter.ServiceViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServiceViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_services_available, parent, false)
        return ServiceViewHolder(itemView)
    }

    override fun getItemCount() = listServices.size

    override fun onBindViewHolder(holder: ServiceViewHolder, position: Int) {
        val currentItem = listServices[position]
        holder.textAvailableService.text = currentItem.service
        holder.logoAvailableService.setImageResource(currentItem.logoService)

        holder.itemView.setOnClickListener {
            Toast.makeText(context, "Direcionar para ${currentItem.service}", Toast.LENGTH_SHORT).show()
        }
    }

    class ServiceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textAvailableService: TextView = itemView.findViewById(R.id.textItemServicesAvailable)
        val logoAvailableService: ImageView = itemView.findViewById(R.id.imageItemServicesAvailable)
    }

}