/**
 * Classe que representa um smartphone com funcionalidades básicas.
 * Autor: Ryan
 * Versão: 1.0
 */
public class Smartphone {
    private String marca;
    private String modelo;
    private int nivelBateria;

    // Construtor
    public Smartphone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.nivelBateria = 100; // assume 100% de carga ao ligar
    }

    public void fazerLigacao(String numero) {
        System.out.println("Ligando para " + numero + "...");
        nivelBateria -= 5;
    }

    public void tirarFoto() {
        System.out.println("Foto tirada com sucesso!");
        nivelBateria -= 3;
    }

    public void mostrarStatus() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + nivelBateria + "%");
    }
}
