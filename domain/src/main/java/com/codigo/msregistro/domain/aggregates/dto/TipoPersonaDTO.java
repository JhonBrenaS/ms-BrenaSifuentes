package com.codigo.msregistro.domain.aggregates.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
@Getter
@Setter
public class TipoPersonaDTO {
    private Long idTipoPersona;
    private String codigoTipo;
    private String descripcionTipo;
    private int estado;
    private String usuarioCreacion;
    private Timestamp fechaCreacion;
    private String usuarioModificacion;
    private Timestamp fechaModificacion;
    private String usuarioEliminacion;
    private Timestamp fechaEliminacion;
}
