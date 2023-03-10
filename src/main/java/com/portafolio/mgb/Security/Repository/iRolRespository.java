/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolio.mgb.Security.Repository;

import com.portafolio.mgb.Security.Entity.Rol;
import com.portafolio.mgb.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRespository extends JpaRepository<Rol, Integer> {
    Optional<Rol>findByRolNombre(RolNombre rolNombre);
    
}
