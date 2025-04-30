# 🏦 ATM-State

Este proyecto es una simulación de un cajero automático (ATM) implementado en Java usando el **patrón de diseño State**. Cada estado del cajero (activo, solo consulta de saldo, o suspendido) afecta el comportamiento de las operaciones disponibles para un cliente.

---

## 🎯 Objetivo

Demostrar el uso del patrón de diseño `State` para encapsular comportamientos de un objeto (ATM) que cambia su respuesta según su estado interno.

---

## 🔧 Funcionalidades

- 📥 Registrar ingresos (depósitos) en estado activo.
- 💸 Registrar egresos (retiros) en estado activo, verificando fondos.
- 🔎 Consultar saldo en cualquier estado.
- 🚫 Restringir operaciones de ingreso/egreso en estados `BalanceState` y `SuspendedState`.
- 🔁 Cambiar dinámicamente el estado del ATM en tiempo de ejecución.

---

## 🛠️ Tecnologías usadas

- Java 17+
- IntelliJ IDEA
- POO (Programación Orientada a Objetos)
- Patrón de diseño: State

