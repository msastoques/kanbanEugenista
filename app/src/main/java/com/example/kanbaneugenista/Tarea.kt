package com.example.kanbaneugenista

data class Tarea(
    val id: Int,
    val descripcion: String,
    val fechaInicio: String,
    val fechaEntrega: String,
    val idEstado: Estado,
    val idPrioridad: Prioridad
)
