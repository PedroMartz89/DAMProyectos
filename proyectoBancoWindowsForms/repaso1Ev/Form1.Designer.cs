namespace proyectoBancoWindowsForms
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.altaToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.consultaToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.operacionesToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.salirToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.pnlAltas = new System.Windows.Forms.Panel();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.contextMenuStrip1 = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.txtTitular = new System.Windows.Forms.TextBox();
            this.txtDNI = new System.Windows.Forms.TextBox();
            this.txtSaldo = new System.Windows.Forms.TextBox();
            this.btnAceptarAlta = new System.Windows.Forms.Button();
            this.btnCancelarAlta = new System.Windows.Forms.Button();
            this.pnlConsultar = new System.Windows.Forms.Panel();
            this.btnCancelarConsultar = new System.Windows.Forms.Button();
            this.btnAceptarConsultar = new System.Windows.Forms.Button();
            this.txtDNIConultar = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.menuStrip1.SuspendLayout();
            this.pnlAltas.SuspendLayout();
            this.pnlConsultar.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.altaToolStripMenuItem,
            this.consultaToolStripMenuItem,
            this.operacionesToolStripMenuItem,
            this.salirToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(800, 24);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // altaToolStripMenuItem
            // 
            this.altaToolStripMenuItem.Name = "altaToolStripMenuItem";
            this.altaToolStripMenuItem.Size = new System.Drawing.Size(40, 20);
            this.altaToolStripMenuItem.Text = "Alta";
            this.altaToolStripMenuItem.Click += new System.EventHandler(this.altaToolStripMenuItem_Click);
            // 
            // consultaToolStripMenuItem
            // 
            this.consultaToolStripMenuItem.Name = "consultaToolStripMenuItem";
            this.consultaToolStripMenuItem.Size = new System.Drawing.Size(66, 20);
            this.consultaToolStripMenuItem.Text = "Consulta";
            this.consultaToolStripMenuItem.Click += new System.EventHandler(this.consultaToolStripMenuItem_Click);
            // 
            // operacionesToolStripMenuItem
            // 
            this.operacionesToolStripMenuItem.Name = "operacionesToolStripMenuItem";
            this.operacionesToolStripMenuItem.Size = new System.Drawing.Size(85, 20);
            this.operacionesToolStripMenuItem.Text = "Operaciones";
            this.operacionesToolStripMenuItem.Click += new System.EventHandler(this.operacionesToolStripMenuItem_Click);
            // 
            // salirToolStripMenuItem
            // 
            this.salirToolStripMenuItem.Name = "salirToolStripMenuItem";
            this.salirToolStripMenuItem.Size = new System.Drawing.Size(41, 20);
            this.salirToolStripMenuItem.Text = "Salir";
            this.salirToolStripMenuItem.Click += new System.EventHandler(this.salirToolStripMenuItem_Click);
            // 
            // pnlAltas
            // 
            this.pnlAltas.Controls.Add(this.btnCancelarAlta);
            this.pnlAltas.Controls.Add(this.btnAceptarAlta);
            this.pnlAltas.Controls.Add(this.txtSaldo);
            this.pnlAltas.Controls.Add(this.txtDNI);
            this.pnlAltas.Controls.Add(this.txtTitular);
            this.pnlAltas.Controls.Add(this.label4);
            this.pnlAltas.Controls.Add(this.label3);
            this.pnlAltas.Controls.Add(this.label2);
            this.pnlAltas.Controls.Add(this.label1);
            this.pnlAltas.Location = new System.Drawing.Point(206, 102);
            this.pnlAltas.Name = "pnlAltas";
            this.pnlAltas.Size = new System.Drawing.Size(337, 216);
            this.pnlAltas.TabIndex = 1;
            this.pnlAltas.Visible = false;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label1.Location = new System.Drawing.Point(144, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(45, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "Altas";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(76, 62);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(36, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Titular";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(76, 100);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(26, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "DNI";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(76, 134);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(34, 13);
            this.label4.TabIndex = 3;
            this.label4.Text = "Saldo";
            // 
            // contextMenuStrip1
            // 
            this.contextMenuStrip1.Name = "contextMenuStrip1";
            this.contextMenuStrip1.Size = new System.Drawing.Size(61, 4);
            // 
            // txtTitular
            // 
            this.txtTitular.Location = new System.Drawing.Point(148, 59);
            this.txtTitular.Name = "txtTitular";
            this.txtTitular.Size = new System.Drawing.Size(100, 20);
            this.txtTitular.TabIndex = 4;
            // 
            // txtDNI
            // 
            this.txtDNI.Location = new System.Drawing.Point(148, 93);
            this.txtDNI.Name = "txtDNI";
            this.txtDNI.Size = new System.Drawing.Size(100, 20);
            this.txtDNI.TabIndex = 5;
            // 
            // txtSaldo
            // 
            this.txtSaldo.Location = new System.Drawing.Point(148, 131);
            this.txtSaldo.Name = "txtSaldo";
            this.txtSaldo.ReadOnly = true;
            this.txtSaldo.Size = new System.Drawing.Size(100, 20);
            this.txtSaldo.TabIndex = 6;
            // 
            // btnAceptarAlta
            // 
            this.btnAceptarAlta.Location = new System.Drawing.Point(79, 178);
            this.btnAceptarAlta.Name = "btnAceptarAlta";
            this.btnAceptarAlta.Size = new System.Drawing.Size(75, 23);
            this.btnAceptarAlta.TabIndex = 7;
            this.btnAceptarAlta.Text = "Aceptar";
            this.btnAceptarAlta.UseVisualStyleBackColor = true;
            this.btnAceptarAlta.Click += new System.EventHandler(this.btnAceptarAlta_Click);
            // 
            // btnCancelarAlta
            // 
            this.btnCancelarAlta.Location = new System.Drawing.Point(195, 178);
            this.btnCancelarAlta.Name = "btnCancelarAlta";
            this.btnCancelarAlta.Size = new System.Drawing.Size(75, 23);
            this.btnCancelarAlta.TabIndex = 8;
            this.btnCancelarAlta.Text = "Cancelar";
            this.btnCancelarAlta.UseVisualStyleBackColor = true;
            this.btnCancelarAlta.Click += new System.EventHandler(this.btnCancelarAlta_Click);
            // 
            // pnlConsultar
            // 
            this.pnlConsultar.Controls.Add(this.btnCancelarConsultar);
            this.pnlConsultar.Controls.Add(this.btnAceptarConsultar);
            this.pnlConsultar.Controls.Add(this.txtDNIConultar);
            this.pnlConsultar.Controls.Add(this.label6);
            this.pnlConsultar.Controls.Add(this.label8);
            this.pnlConsultar.Location = new System.Drawing.Point(206, 102);
            this.pnlConsultar.Name = "pnlConsultar";
            this.pnlConsultar.Size = new System.Drawing.Size(337, 216);
            this.pnlConsultar.TabIndex = 3;
            this.pnlConsultar.Visible = false;
            // 
            // btnCancelarConsultar
            // 
            this.btnCancelarConsultar.Location = new System.Drawing.Point(185, 157);
            this.btnCancelarConsultar.Name = "btnCancelarConsultar";
            this.btnCancelarConsultar.Size = new System.Drawing.Size(75, 23);
            this.btnCancelarConsultar.TabIndex = 8;
            this.btnCancelarConsultar.Text = "Cancelar";
            this.btnCancelarConsultar.UseVisualStyleBackColor = true;
            this.btnCancelarConsultar.Click += new System.EventHandler(this.btnCancelarConsultar_Click);
            // 
            // btnAceptarConsultar
            // 
            this.btnAceptarConsultar.Location = new System.Drawing.Point(69, 157);
            this.btnAceptarConsultar.Name = "btnAceptarConsultar";
            this.btnAceptarConsultar.Size = new System.Drawing.Size(75, 23);
            this.btnAceptarConsultar.TabIndex = 7;
            this.btnAceptarConsultar.Text = "Aceptar";
            this.btnAceptarConsultar.UseVisualStyleBackColor = true;
            this.btnAceptarConsultar.Click += new System.EventHandler(this.btnAceptarConsultar_Click);
            // 
            // txtDNIConultar
            // 
            this.txtDNIConultar.Location = new System.Drawing.Point(148, 85);
            this.txtDNIConultar.Name = "txtDNIConultar";
            this.txtDNIConultar.Size = new System.Drawing.Size(100, 20);
            this.txtDNIConultar.TabIndex = 5;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(95, 89);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(26, 13);
            this.label6.TabIndex = 2;
            this.label6.Text = "DNI";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label8.Location = new System.Drawing.Point(130, 0);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(77, 20);
            this.label8.TabIndex = 0;
            this.label8.Text = "Consultar";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.pnlConsultar);
            this.Controls.Add(this.pnlAltas);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.pnlAltas.ResumeLayout(false);
            this.pnlAltas.PerformLayout();
            this.pnlConsultar.ResumeLayout(false);
            this.pnlConsultar.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem altaToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem consultaToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem operacionesToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem salirToolStripMenuItem;
        private System.Windows.Forms.Panel pnlAltas;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnCancelarAlta;
        private System.Windows.Forms.Button btnAceptarAlta;
        private System.Windows.Forms.TextBox txtSaldo;
        private System.Windows.Forms.TextBox txtDNI;
        private System.Windows.Forms.TextBox txtTitular;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ContextMenuStrip contextMenuStrip1;
        private System.Windows.Forms.Panel pnlConsultar;
        private System.Windows.Forms.Button btnCancelarConsultar;
        private System.Windows.Forms.Button btnAceptarConsultar;
        private System.Windows.Forms.TextBox txtDNIConultar;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label8;
    }
}

