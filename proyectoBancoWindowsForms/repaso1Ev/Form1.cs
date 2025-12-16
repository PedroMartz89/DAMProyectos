using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace proyectoBancoWindowsForms
{
    /// <summary>
    /// Formulario principal de la aplicación.
    /// Permite dar de alta cuentas y consultarlas por DNI.
    /// </summary>
    public partial class Form1 : Form
    {
        // Lista compartida de todas las cuentas creadas
        public static List<Cuenta> listaCuentas = new List<Cuenta>();

        public Form1()
        {
            InitializeComponent();

            // Oculta los paneles al iniciar la aplicación
            pnlAltas.Visible = false;
            pnlConsultar.Visible = false;
        }

        private void Form1_Load(object sender, EventArgs e)
        {
        }

        /// <summary>
        /// Muestra el panel de altas.
        /// </summary>
        private void altaToolStripMenuItem_Click(object sender, EventArgs e)
        {
            pnlAltas.Visible = true;
            pnlConsultar.Visible = false;
        }

        /// <summary>
        /// Da de alta una nueva cuenta.
        /// </summary>
        private void btnAceptarAlta_Click(object sender, EventArgs e)
        {
            if (txtTitular.Text.Equals(""))
            {
                MessageBox.Show("El titular no puede estar vacío");
                return;
            }

            if (txtDNI.Text.Equals(""))
            {
                MessageBox.Show("El DNI no puede estar vacío");
                return;
            }

            // Se crea la cuenta con saldo inicial 0
            listaCuentas.Add(new Cuenta(txtTitular.Text, txtDNI.Text, 0));

            MessageBox.Show("Cuenta dada de alta correctamente");

            txtTitular.Text = "";
            txtDNI.Text = "";
            txtTitular.Focus();
        }

        /// <summary>
        /// Limpia los campos del alta.
        /// </summary>
        private void btnCancelarAlta_Click(object sender, EventArgs e)
        {
            txtTitular.Text = "";
            txtDNI.Text = "";
            txtTitular.Focus();
        }

        /// <summary>
        /// Consulta una cuenta por DNI.
        /// </summary>
        private void btnAceptarConsultar_Click(object sender, EventArgs e)
        {
            if (txtDNIConultar.Text.Equals(""))
            {
                MessageBox.Show("El DNI no puede estar vacío");
                return;
            }

            foreach (Cuenta c in listaCuentas)
            {
                if (c.Dni.Equals(txtDNIConultar.Text))
                {
                    MessageBox.Show(c.ToString());
                    return;
                }
            }

            MessageBox.Show("No existe ninguna cuenta con ese DNI");
        }

        /// <summary>
        /// Limpia el campo de consulta.
        /// </summary>
        private void btnCancelarConsultar_Click(object sender, EventArgs e)
        {
            txtDNIConultar.Text = "";
        }

        /// <summary>
        /// Muestra el panel de consulta.
        /// </summary>
        private void consultaToolStripMenuItem_Click(object sender, EventArgs e)
        {
            pnlAltas.Visible = false;
            pnlConsultar.Visible = true;
        }

        /// <summary>
        /// Abre el formulario de operaciones.
        /// </summary>
        private void operacionesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FormOperaciones formOp = new FormOperaciones();
            formOp.Show();
            this.Hide();
        }

        /// <summary>
        /// Cierra la aplicación.
        /// </summary>
        private void salirToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
