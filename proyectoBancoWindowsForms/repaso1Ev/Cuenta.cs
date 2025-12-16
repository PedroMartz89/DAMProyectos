using System;
using System.Windows.Forms;

namespace proyectoBancoWindowsForms
{
    /// <summary>
    /// Representa una cuenta bancaria con titular, DNI y saldo.
    /// Incluye operaciones básicas como ingreso, retirada y transferencia.
    /// </summary>
    public class Cuenta
    {
        // Nombre del titular de la cuenta
        private string titular;

        // DNI del titular
        private string dni;

        // Saldo actual de la cuenta
        private double saldo;

        /// <summary>
        /// Constructor vacío.
        /// </summary>
        public Cuenta() { }

        /// <summary>
        /// Constructor que inicializa los datos de la cuenta.
        /// </summary>
        public Cuenta(string titular, string dni, double saldo)
        {
            this.titular = titular;
            this.dni = dni;
            this.saldo = saldo;
        }

        /// <summary>
        /// Propiedad para acceder o modificar el titular.
        /// </summary>
        public string Titular
        {
            get { return titular; }
            set { titular = value; }
        }

        /// <summary>
        /// Propiedad para acceder o modificar el DNI.
        /// </summary>
        public string Dni
        {
            get { return dni; }
            set { dni = value; }
        }

        /// <summary>
        /// Propiedad para acceder o modificar el saldo.
        /// </summary>
        public double Saldo
        {
            get { return saldo; }
            set { saldo = value; }
        }

        /// <summary>
        /// Realiza un ingreso en la cuenta si la cantidad es positiva.
        /// </summary>
        public bool Ingresar(double cantidad)
        {
            if (cantidad > 0)
            {
                saldo += cantidad;
                return true;
            }

            return false;
        }

        /// <summary>
        /// Realiza una retirada si hay saldo suficiente.
        /// </summary>
        public bool Retirar(double cantidad)
        {
            if (cantidad > saldo)
            {
                MessageBox.Show("No hay suficiente saldo");
                return false;
            }

            saldo -= cantidad;
            return true;
        }

        /// <summary>
        /// Transfiere una cantidad a otra cuenta.
        /// </summary>
        public bool Transferencia(Cuenta cuentaDestino, double cantidad)
        {
            if (saldo < cantidad)
            {
                MessageBox.Show("No hay suficiente saldo para la transferencia");
                return false;
            }

            saldo -= cantidad;
            cuentaDestino.saldo += cantidad;

            return true;
        }

        /// <summary>
        /// Devuelve una representación en texto de la cuenta.
        /// </summary>
        public override string ToString()
        {
            return "Titular: " + titular + ", DNI: " + dni + ", Saldo: " + saldo + "€";
        }
    }
}
