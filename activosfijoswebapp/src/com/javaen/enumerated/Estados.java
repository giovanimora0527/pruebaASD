package com.javaen.enumerated;

public enum Estados {
  
	D ("DISPONIBLE"), 
    A ("ACTIVO"),
    R("EN REPARACION"),
    B ("DE BAJA"),
    AS ("ASIGNADO");
		
	private final String estado;
	
	private Estados (String estado) { 
        this.estado = estado;        
    }

	public String getEstado() {
		return estado;
	} 
	
}
