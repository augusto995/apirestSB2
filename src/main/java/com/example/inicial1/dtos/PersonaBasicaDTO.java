package com.example.inicial1.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonaBasicaDTO {

    private Long id;
    private String nombre;
    private String apellido;


}
