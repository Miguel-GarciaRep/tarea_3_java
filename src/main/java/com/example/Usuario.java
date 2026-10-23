package com.example;

public class Usuario {
    private String nombre;
    private int identificacion;
    private double altura;
    private boolean estaEstudiando;
    private char letraFavorita;
    private String nombrePareja;
    private int numeroTelefono;
    private double notaFinal;
    private boolean teGustaElSena;
    private char numeroFavorito;

    // Setters y Getters

    // Getters

    public String getNombre() {
        return nombre;
    }
    public int getIdentificacion() {
        return identificacion;
    }
    public double getAltura() {
        return altura;
    }
    public boolean getEstaEstudiando() {
        return estaEstudiando;
    }
    public char getLetraFavorita() {
        return letraFavorita;
    }
    public String getNombrePareja(){
        return nombrePareja;
    }
    public int getNumeroTelefono() {
        return numeroTelefono;
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    public boolean getTeGustaElSena() {
        return teGustaElSena;
    }
    public char getNumeroFavorito() {
        return numeroFavorito;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setEstaEstudiando(boolean estaEstudiando) {
        this.estaEstudiando = estaEstudiando;
    }
    public void setLetraFavorita(char letraFavorita) {
        this.letraFavorita = letraFavorita;
    }
    public void setNombrePareja(String nombrePareja) {
        this.nombrePareja = nombrePareja;
    }
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    public void setTeGustaElSena(boolean teGustaElSena) {
        this.teGustaElSena = teGustaElSena;
    }
    public void setNumeroFavorito(char numeroFavorito) {
        this.numeroFavorito = numeroFavorito;
    }


    // Agregar los valores

    // Agregar los valores

public Usuario(String nombre, int identificacion, double altura, boolean estaEstudiando, char letraFavorita,
               String nombrePareja, int numeroTelefono, double notaFinal, boolean teGustaElSena, char numeroFavorito) {
    this.nombre = nombre;
    this.identificacion = identificacion;
    this.altura = altura;
    this.estaEstudiando = estaEstudiando;
    this.letraFavorita = letraFavorita;
    this.nombrePareja = nombrePareja;
    this.numeroTelefono = numeroTelefono;
    this.notaFinal = notaFinal;
    this.teGustaElSena = teGustaElSena;
    this.numeroFavorito = numeroFavorito;
}

    @Override 
    public String toString() {
        return "Usuario: " + getNombre() + "\nIdentificacion: " + getIdentificacion() + "\nAltura: " + getAltura() + "\nEsta estudiando?: " + getEstaEstudiando() + "\nLetra favorita: " + getLetraFavorita() + "\nNombre de pareja: " + getNombrePareja() + "\nNumero de telefono: " + getNumeroTelefono() + "\nNota final: " + getNotaFinal() + "\nTe gusta el sena?: " + getTeGustaElSena() + "\nNumero favorito: " + getNumeroFavorito();
    }

}

