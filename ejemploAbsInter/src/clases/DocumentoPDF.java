package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class DocumentoPDF extends Documento {

    private boolean protegido;

    public DocumentoPDF(String titulo, boolean protegido) {
        super(titulo);
        this.protegido=protegido;
    }
    
    
    @Override
    public void validar() {
        System.out.println("el documento pdf con titulo :"+ getTitulo()+" ha sido validado");
    }
    
    public boolean isProtegido() {
        return protegido;
    }

    public void setProtegido(boolean protegido) {
        this.protegido = protegido;
    }
    
    
    
  
    
}
