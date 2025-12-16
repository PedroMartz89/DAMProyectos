using System;
using System.Windows.Forms;

namespace proyectoBancoWindowsForms
{
    /// <summary>
    /// Formulario que permite realizar ingresos,
    /// retiradas y transferencias entre cuentas.
    /// </summary>
    public partial class FormOperaciones : Form
    {
        public FormOperaciones()
        {
            InitializeComponent();

            // Carga las cuentas en los controles
            refrescarLista();
        }

        private void FormOperaciones_Load(object sender, EventArgs e)
        {
        }

        /// <summary>
        /// Vuelve al formulario principal.
        /// </summary>
        private void btnVolver_Click(object sender, EventArgs e)
        {
            Form1 form1 = new Form1();
            form1.Show();
            this.Close();
        }

        /// <summary>
        /// Realiza un ingreso en la cuenta seleccionada.
        /// </summary>
        private void btnAceptarIngreso_Click(object sender, EventArgs e)
        {
            if (lbCuentas.SelectedItem == null)
            {
                MessageBox.Show("Elije una cuenta");
                return;
            }

            if (double.TryParse(txtCantidadIngreso.Text, out double cantidad))
            {
                Cuenta c = lbCuentas.SelectedItem as Cuenta;
                c.Ingresar(cantidad);

                MessageBox.Show("Ingreso realizado correctamente. Nuevo saldo: " + c.Saldo);

                refrescarLista();
                txtCantidadIngreso.Clear();
            }
            else
            {
                MessageBox.Show("Cantidad no válida");
                txtCantidadIngreso.Clear();
                refrescarLista();
            }
        }

        /// <summary>
        /// Actualiza todas las listas de cuentas.
        /// </summary>
        public void refrescarLista()
        {
            lbCuentas.Items.Clear();
            listRetirar.Items.Clear();
            listTrans1.Items.Clear();
            listTrans2.Items.Clear();

            foreach (Cuenta cuenta in Form1.listaCuentas)
            {
                lbCuentas.Items.Add(cuenta);
                listRetirar.Items.Add(cuenta);
                listTrans1.Items.Add(cuenta);
                listTrans2.Items.Add(cuenta);
            }
        }

        /// <summary>
        /// Realiza una retirada de la cuenta seleccionada.
        /// </summary>
        private void btnIngresar_Click(object sender, EventArgs e)
        {
            if (listRetirar.SelectedItem == null)
            {
                MessageBox.Show("Elije una cuenta");
                return;
            }

            if (double.TryParse(txtCantidadRetirar.Text, out double cantidad))
            {
                Cuenta c = listRetirar.SelectedItem as Cuenta;
                c.Retirar(cantidad);

                MessageBox.Show("Retiro realizado correctamente. Nuevo saldo: " + c.Saldo);

                refrescarLista();
                txtCantidadRetirar.Clear();
            }
            else
            {
                MessageBox.Show("Cantidad no válida");
                refrescarLista();
                txtCantidadRetirar.Clear();
            }
        }

        /// <summary>
        /// Realiza una transferencia entre dos cuentas.
        /// </summary>
        private void btnTransferir_Click(object sender, EventArgs e)
        {
            if (listTrans1.SelectedItem == null || listTrans2.SelectedItem == null)
            {
                MessageBox.Show("Elije ambas cuentas");
                return;
            }

            if (double.TryParse(txtCantidad.Text, out double cantidad))
            {
                Cuenta c1 = listTrans1.SelectedItem as Cuenta;
                Cuenta c2 = listTrans2.SelectedItem as Cuenta;

                if (c1 == c2)
                {
                    MessageBox.Show("No se puede transferir a la misma cuenta");
                    return;
                }

                if (c1.Transferencia(c2, cantidad))
                {
                    MessageBox.Show(
                        "Transferencia realizada correctamente. " +
                        "Saldo origen: " + c1.Saldo +
                        " | Saldo destino: " + c2.Saldo
                    );
                }

                txtCantidad.Clear();
                refrescarLista();
            }
            else
            {
                MessageBox.Show("Cantidad no válida");
            }
        }
    }
}
