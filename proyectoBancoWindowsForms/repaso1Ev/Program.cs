using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace proyectoBancoWindowsForms
{
    internal static class Program
    {
        /// <summary>
        /// Punto de entrada principal de la aplicación.
        /// Se encarga de inicializar la configuración visual
        /// y lanzar el formulario principal.
        /// </summary>
        [STAThread]
        static void Main()
        {
            // Habilita estilos visuales modernos de Windows
            Application.EnableVisualStyles();

            // Establece el sistema de renderizado de texto compatible
            Application.SetCompatibleTextRenderingDefault(false);

            // Inicia la aplicación mostrando el formulario principal
            Application.Run(new Form1());
        }
    }
}
