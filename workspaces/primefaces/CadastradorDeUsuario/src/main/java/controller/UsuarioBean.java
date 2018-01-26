package controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable{
	private static final long serialVersionUID = 1L;

	public String salvar() {
		System.out.println("Salvando!...");
		
		return null;
	}
}



