package co.bases.datos.proyectofinalbd.model;


import groovy.transform.builder.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Role {

    private String roleName;
    private int id;
}
