package edu.estudo.metodos;

public class SmartTV {
    public boolean ligada = false;
    public int canal = 0;
    public int volume = 0;

    public void ligarOrDesligar() {
        ligada = !ligada;
        if (ligada) {
            System.out.println("O TV esta ligada.");
        } else {
            System.out.println("O TV esta desligada.");
        }
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("O volume atual aumento e é: " + volume);
    }

    public void disminuirVolume() {
        volume--;
        System.out.println("O volume atual disminuiu e é: " + volume);
    }

    public void mudarCanal(boolean estado) {
        if (estado) {
            canal++;
            System.out.println("O canal autual é: " + canal);
        } else {
            canal--;
            System.out.println("O canal autual é: " + canal);

        }
    }

}
