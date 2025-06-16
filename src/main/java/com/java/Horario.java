package com.java;

import java.time.LocalDate;
import java.time.LocalTime;

    /**
     * Clase que representa un turno en el hospital.
     */
    public class Horario {
        private int id;
        private LocalDate fecha;
        private LocalTime startTime;
        private int duracion;
        private Personal personal;

        /**
         * Obtiene el ID del turno.
         * @return ID del turno
         */
        public int getId() {
            return 0; // Provisional
        }

        /**
         * Establece la fecha del turno.
         * @param date Fecha del turno
         */
        public void setDate(LocalDate date) {
            // Provisional
        }

        /**
         * Obtiene el personal asignado al turno.
         * @return Personal asignado
         */
        public Personal getStaff() {
            return null; // Provisional
        }
    }

