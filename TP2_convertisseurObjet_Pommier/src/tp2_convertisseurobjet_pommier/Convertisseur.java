/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_pommier;

/**
 *
 * @author pommi
 */
public class Convertisseur {
    int nbConversions;
    public float CelsiusVersKelvin(float tCelsius) {
        float Kelvin;
        nbConversions++;
        Kelvin = (float) (tCelsius + 273.15);
        return Kelvin;
    }

    public float KelvinVersCelsisus(float tKelvin) {
        float Celsius;
        nbConversions++;
        Celsius = (float) (tKelvin - 273.15);
        return Celsius;
    }

    public float FahrenheitVersCelsius(float tFahrenheit) {
        float Celsius;
        nbConversions++;
        Celsius = (tFahrenheit - 32) * (5 / 9);
        return Celsius;
    }

    public float CelsiusVersFahrenheit(float tCelsius) {
        float Farenheit;
        nbConversions++;
        Farenheit = (tCelsius + 32) * (9 / 5);
        return Farenheit;
    }

    public float KelvinVersFarenheit(float tKelvin) {
        float Farenheit;
        nbConversions++;
        Farenheit = (float) (tKelvin * (9 / 5) - 459.67);
        return Farenheit;
    }

    public float FarenheitVersKelvin(float tFarenheit) {
        float Kelvin;
        nbConversions++;
        Kelvin = (float) (tFarenheit * (5 / 9) + 459.67);
        return Kelvin;
    }
    public Convertisseur(){
        nbConversions = 0;
}
    @Override
 public String toString () {
 return "nb de conversions "+ nbConversions;
}

}
