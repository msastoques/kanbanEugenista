package com.example.kanbaneugenista

data class Tareas(val id: Int,
                  val descripcion: String,
                  val fechaInicio: String,
                  val fechaEntrega: String,
                  val idEstado: Estado)
   /* Ejemplo de dato
   {
        "Id": 5,
        "Descripcion": "Optimizar el rendimiento de la app",
        "FechaInicio": "2024-08-26",
        "FechaEntrega": "2024-09-01",
        "Estado": "No iniciado"
    }*/



