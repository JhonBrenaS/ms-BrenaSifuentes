package com.codigo.msregistro.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
@NamedQuery(name = "TipoPersonaEntity.findByCodTipo", query = "select a from TipoPersonaEntity a where a.codTipo=:codTipo")

@Entity
@Table(name = "tipo_persona")
@Getter
@Setter
public class TipoPersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_persona")
    private Long idTipoPersona;

    @Column(name = "cod_tipo", nullable = false)
    private String codTipo;

    @Column(name = "desc_tipo", nullable = false)
    private String descripcionTipo;

    @Column(name = "estado", nullable = false)
    private int estado;

    @Column(name = "usua_crea")
    private String usuarioCreacion;

    @Column(name = "date_create")
    private Timestamp fechaCreacion;

    @Column(name = "usua_modif")
    private String usuarioModificacion;

    @Column(name = "date_modif")
    private Timestamp fechaModificacion;

    @Column(name = "usua_delet")
    private String usuarioEliminacion;

    @Column(name = "date_delet")
    private Timestamp fechaEliminacion;
}
