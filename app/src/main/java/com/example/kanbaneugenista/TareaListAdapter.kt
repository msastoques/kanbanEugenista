package com.example.kanbaneugenista

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kanbaneugenista.databinding.ItemTareaBinding

class TareaListAdapter : ListAdapter<Tarea, RecyclerView.ViewHolder>(TareaDiff()){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_tarea, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val tarea = getItem(position)
        (holder as ViewHolder).run {
            with(binding){
                tvDescripcion.text = tarea.descripcion
                tvFechaInicio.text = tarea.fechaInicio
                tvFechaEntrega.text = tarea.fechaEntrega
                prioridad.rating = tarea.idPrioridad.valor.toFloat()

            }
        }

        }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ItemTareaBinding.bind(view)
    }

    private class TareaDiff : DiffUtil.ItemCallback<Tarea>(){
        override fun areItemsTheSame(oldItem: Tarea, newItem: Tarea): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Tarea, newItem: Tarea): Boolean {
            return oldItem == newItem
        }
    }
}