# Gestión de Cuentas Bancarias (Windows Forms)

## Descripción

Aplicación desarrollada en **C# con Windows Forms** que permite la gestión básica de cuentas bancarias.  
El usuario puede crear cuentas, consultarlas por DNI y realizar operaciones como ingresos, retiradas y transferencias entre cuentas.

Proyecto orientado a la práctica de programación orientada a objetos, manejo de formularios y eventos.

---

## Tecnologías utilizadas

- Lenguaje: C#
- Framework: .NET
- Tipo de aplicación: Windows Forms
- Entorno de desarrollo: Visual Studio

---

## Estructura del proyecto

### Program.cs
Contiene el punto de entrada de la aplicación.  
Inicializa la configuración visual y lanza el formulario principal.

### Cuenta.cs
Clase que representa una cuenta bancaria.

**Atributos:**
- Titular
- DNI
- Saldo

**Métodos:**
- Ingresar
- Retirar
- Transferencia
- ToString

### Form1.cs
Formulario principal.

**Funcionalidades:**
- Alta de cuentas
- Consulta de cuentas por DNI
- Acceso al formulario de operaciones
- Salida de la aplicación

Las cuentas se almacenan en una lista compartida.

### FormOperaciones.cs
Formulario destinado a realizar operaciones bancarias.

**Funcionalidades:**
- Ingresos
- Retiradas
- Transferencias entre cuentas

Las listas se actualizan automáticamente tras cada operación.

---

## Funcionamiento

1. El usuario inicia la aplicación.
2. Da de alta cuentas indicando titular y DNI.
3. Puede consultar una cuenta mediante su DNI.
4. Accede al formulario de operaciones para gestionar el saldo.
5. Los cambios se reflejan inmediatamente.

---

## Validaciones

- Campos obligatorios no vacíos
- Cantidades numéricas válidas
- Control de saldo insuficiente
- No se permite transferir a la misma cuenta

---

## Objetivo académico

Proyecto orientado al refuerzo de:
- Programación orientada a objetos
- Encapsulación
- Uso de listas
- Eventos en Windows Forms
- Interacción entre formularios

---

## Autor

Proyecto académico desarrollado como ejercicio de práctica en C# y Windows Forms.
