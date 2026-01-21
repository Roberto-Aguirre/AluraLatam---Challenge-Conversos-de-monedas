# Challenge Conversor de Monedas - Alura Latam

Bienvenido al proyecto de Conversor de Monedas. Esta es una aplicación de consola en Java desarrollada como parte del desafío de Alura Latam, la cual permite realizar conversiones de divisas en tiempo real utilizando una API externa.

## Características

- Interfaz de consola interactiva y fácil de usar.
- Conversión de divisas en tiempo real.
- Soporte para las siguientes conversiones:
  - Dólar (USD) <-> Peso Mexicano (MXN)
  - Dólar (USD) <-> Real Brasileño (BRL)
  - Dólar (USD) <-> Peso Colombiano (COP/COL)

## Requisitos

- Java Development Kit (JDK) 8 o superior.
- Conexión a Internet (para realizar las consultas a la API de tasas de cambio).

## Estructura del Proyecto

- `ConversorMonedas.java`: Clase principal que contiene el punto de entrada (`main`) y la lógica de control del menú.
- `Menu.java`: Clase encargada de mostrar las opciones y mensajes al usuario en la consola.
- `ClienteHttp`: (Dependencia) Maneja la comunicación HTTP con la API de tasas de cambio.
- `Conversor`: (Dependencia) Realiza la lógica de conversión de monedas.

## Cómo Ejecutar

1. Clona o descarga este repositorio.
2. Abre el proyecto en tu IDE de preferencia (IntelliJ IDEA, Eclipse, VS Code).
3. Ejecuta la clase `ConversorMonedas` ubicada en `src/main/java`.

## Uso

Al iniciar la aplicación, verás un menú con las opciones de conversión disponibles:

1. Selecciona una opción numérica (1-6) para elegir el tipo de cambio deseado.
2. Ingresa el monto que deseas convertir cuando el sistema lo solicite.
3. El resultado de la conversión se mostrará en pantalla.
4. Para cerrar la aplicación, selecciona la opción **7**.