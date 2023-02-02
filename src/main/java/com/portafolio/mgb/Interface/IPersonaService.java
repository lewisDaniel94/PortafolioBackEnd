package com.portafolio.mgb.Interface;

import com.portafolio.mgb.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    
    //traer persona
    public List<Persona>getPersona();
    
    //guardar un objeto de tipo persona
    
    public void savePersona(Persona persona);
    
    //eliminar un usuario pero lo buscamos por id
    
    public void deletePersona(Long id);
    
    //buscar un persona por id
    
    public Persona findPersona(Long id);
    
}