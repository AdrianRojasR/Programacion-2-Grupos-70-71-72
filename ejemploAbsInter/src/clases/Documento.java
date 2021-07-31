package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *QUE ES.....!
 * @author danie
 */
public abstract class Documento implements Validacion{
    
    private String titulo;
    private int numHojas;
    

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public abstract void validar();
    
}
