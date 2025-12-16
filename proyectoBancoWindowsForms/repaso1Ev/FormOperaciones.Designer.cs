namespace proyectoBancoWindowsForms
{
    partial class FormOperaciones
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.pnlIngreso = new System.Windows.Forms.Panel();
            this.panel2 = new System.Windows.Forms.Panel();
            this.panel3 = new System.Windows.Forms.Panel();
            this.label1 = new System.Windows.Forms.Label();
            this.lbCuentas = new System.Windows.Forms.ListBox();
            this.txtCantidadIngreso = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.btnAceptarIngreso = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.btnVolver = new System.Windows.Forms.Button();
            this.btnRetirar = new System.Windows.Forms.Button();
            this.label4 = new System.Windows.Forms.Label();
            this.txtCantidadRetirar = new System.Windows.Forms.TextBox();
            this.listRetirar = new System.Windows.Forms.ListBox();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.listTrans1 = new System.Windows.Forms.ListBox();
            this.listTrans2 = new System.Windows.Forms.ListBox();
            this.label7 = new System.Windows.Forms.Label();
            this.txtCantidad = new System.Windows.Forms.TextBox();
            this.btnTransferir = new System.Windows.Forms.Button();
            this.pnlIngreso.SuspendLayout();
            this.panel2.SuspendLayout();
            this.panel3.SuspendLayout();
            this.SuspendLayout();
            // 
            // pnlIngreso
            // 
            this.pnlIngreso.Controls.Add(this.btnAceptarIngreso);
            this.pnlIngreso.Controls.Add(this.label2);
            this.pnlIngreso.Controls.Add(this.txtCantidadIngreso);
            this.pnlIngreso.Controls.Add(this.lbCuentas);
            this.pnlIngreso.Controls.Add(this.label1);
            this.pnlIngreso.Location = new System.Drawing.Point(23, 109);
            this.pnlIngreso.Name = "pnlIngreso";
            this.pnlIngreso.Size = new System.Drawing.Size(254, 317);
            this.pnlIngreso.TabIndex = 0;
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.btnTransferir);
            this.panel2.Controls.Add(this.txtCantidad);
            this.panel2.Controls.Add(this.label7);
            this.panel2.Controls.Add(this.listTrans2);
            this.panel2.Controls.Add(this.listTrans1);
            this.panel2.Controls.Add(this.label6);
            this.panel2.Location = new System.Drawing.Point(527, 109);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(242, 317);
            this.panel2.TabIndex = 1;
            // 
            // panel3
            // 
            this.panel3.Controls.Add(this.btnRetirar);
            this.panel3.Controls.Add(this.label4);
            this.panel3.Controls.Add(this.txtCantidadRetirar);
            this.panel3.Controls.Add(this.listRetirar);
            this.panel3.Controls.Add(this.label5);
            this.panel3.Location = new System.Drawing.Point(283, 109);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(238, 317);
            this.panel3.TabIndex = 2;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label1.Location = new System.Drawing.Point(92, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(68, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "Ingresar";
            // 
            // lbCuentas
            // 
            this.lbCuentas.FormattingEnabled = true;
            this.lbCuentas.Location = new System.Drawing.Point(14, 49);
            this.lbCuentas.Name = "lbCuentas";
            this.lbCuentas.Size = new System.Drawing.Size(226, 95);
            this.lbCuentas.TabIndex = 1;
            // 
            // txtCantidadIngreso
            // 
            this.txtCantidadIngreso.Location = new System.Drawing.Point(74, 196);
            this.txtCantidadIngreso.Name = "txtCantidadIngreso";
            this.txtCantidadIngreso.Size = new System.Drawing.Size(100, 20);
            this.txtCantidadIngreso.TabIndex = 2;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(98, 165);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(49, 13);
            this.label2.TabIndex = 3;
            this.label2.Text = "Cantidad";
            // 
            // btnAceptarIngreso
            // 
            this.btnAceptarIngreso.Location = new System.Drawing.Point(85, 237);
            this.btnAceptarIngreso.Name = "btnAceptarIngreso";
            this.btnAceptarIngreso.Size = new System.Drawing.Size(75, 23);
            this.btnAceptarIngreso.TabIndex = 4;
            this.btnAceptarIngreso.Text = "Ingresar";
            this.btnAceptarIngreso.UseVisualStyleBackColor = true;
            this.btnAceptarIngreso.Click += new System.EventHandler(this.btnAceptarIngreso_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 29F);
            this.label3.Location = new System.Drawing.Point(248, 28);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(303, 44);
            this.label3.TabIndex = 3;
            this.label3.Text = "OPERACIONES";
            // 
            // btnVolver
            // 
            this.btnVolver.Location = new System.Drawing.Point(97, 44);
            this.btnVolver.Name = "btnVolver";
            this.btnVolver.Size = new System.Drawing.Size(75, 23);
            this.btnVolver.TabIndex = 4;
            this.btnVolver.Text = "Volver";
            this.btnVolver.UseVisualStyleBackColor = true;
            this.btnVolver.Click += new System.EventHandler(this.btnVolver_Click);
            // 
            // btnRetirar
            // 
            this.btnRetirar.Location = new System.Drawing.Point(80, 237);
            this.btnRetirar.Name = "btnRetirar";
            this.btnRetirar.Size = new System.Drawing.Size(75, 23);
            this.btnRetirar.TabIndex = 9;
            this.btnRetirar.Text = "Retirar";
            this.btnRetirar.UseVisualStyleBackColor = true;
            this.btnRetirar.Click += new System.EventHandler(this.btnIngresar_Click);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(93, 165);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(49, 13);
            this.label4.TabIndex = 8;
            this.label4.Text = "Cantidad";
            // 
            // txtCantidadRetirar
            // 
            this.txtCantidadRetirar.Location = new System.Drawing.Point(69, 196);
            this.txtCantidadRetirar.Name = "txtCantidadRetirar";
            this.txtCantidadRetirar.Size = new System.Drawing.Size(100, 20);
            this.txtCantidadRetirar.TabIndex = 7;
            // 
            // listRetirar
            // 
            this.listRetirar.FormattingEnabled = true;
            this.listRetirar.Location = new System.Drawing.Point(9, 49);
            this.listRetirar.Name = "listRetirar";
            this.listRetirar.Size = new System.Drawing.Size(226, 95);
            this.listRetirar.TabIndex = 6;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label5.Location = new System.Drawing.Point(87, 0);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(57, 20);
            this.label5.TabIndex = 5;
            this.label5.Text = "Retirar";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label6.Location = new System.Drawing.Point(64, 0);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(106, 20);
            this.label6.TabIndex = 6;
            this.label6.Text = "Transferencia";
            // 
            // listTrans1
            // 
            this.listTrans1.FormattingEnabled = true;
            this.listTrans1.Location = new System.Drawing.Point(3, 49);
            this.listTrans1.Name = "listTrans1";
            this.listTrans1.Size = new System.Drawing.Size(226, 95);
            this.listTrans1.TabIndex = 7;
            // 
            // listTrans2
            // 
            this.listTrans2.FormattingEnabled = true;
            this.listTrans2.Location = new System.Drawing.Point(3, 150);
            this.listTrans2.Name = "listTrans2";
            this.listTrans2.Size = new System.Drawing.Size(226, 95);
            this.listTrans2.TabIndex = 8;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(34, 254);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(49, 13);
            this.label7.TabIndex = 9;
            this.label7.Text = "Cantidad";
            // 
            // txtCantidad
            // 
            this.txtCantidad.Location = new System.Drawing.Point(98, 251);
            this.txtCantidad.Name = "txtCantidad";
            this.txtCantidad.Size = new System.Drawing.Size(100, 20);
            this.txtCantidad.TabIndex = 10;
            // 
            // btnTransferir
            // 
            this.btnTransferir.Location = new System.Drawing.Point(68, 277);
            this.btnTransferir.Name = "btnTransferir";
            this.btnTransferir.Size = new System.Drawing.Size(75, 23);
            this.btnTransferir.TabIndex = 11;
            this.btnTransferir.Text = "Transferir";
            this.btnTransferir.UseVisualStyleBackColor = true;
            this.btnTransferir.Click += new System.EventHandler(this.btnTransferir_Click);
            // 
            // FormOperaciones
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btnVolver);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.panel3);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.pnlIngreso);
            this.Name = "FormOperaciones";
            this.Text = "FormOperaciones";
            this.Load += new System.EventHandler(this.FormOperaciones_Load);
            this.pnlIngreso.ResumeLayout(false);
            this.pnlIngreso.PerformLayout();
            this.panel2.ResumeLayout(false);
            this.panel2.PerformLayout();
            this.panel3.ResumeLayout(false);
            this.panel3.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Panel pnlIngreso;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtCantidadIngreso;
        private System.Windows.Forms.ListBox lbCuentas;
        private System.Windows.Forms.Button btnAceptarIngreso;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button btnVolver;
        private System.Windows.Forms.Button btnRetirar;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtCantidadRetirar;
        private System.Windows.Forms.ListBox listRetirar;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Button btnTransferir;
        private System.Windows.Forms.TextBox txtCantidad;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.ListBox listTrans2;
        private System.Windows.Forms.ListBox listTrans1;
    }
}