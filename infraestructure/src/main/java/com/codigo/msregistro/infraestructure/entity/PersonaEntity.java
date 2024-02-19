package com.codigo.msregistro.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "persona")
@Getter
@Setter
public class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long idPersona;

    @Column(name = "num_docu", nullable = false)
    private String numeroDocumento;

    @Column(name = "nombres", nullable = false)
    private String nombres;

    @Column(name = "ape_pat", nullable = false)
    private String apellidoPaterno;

    @Column(name = "ape_mat", nullable = false)
    private String apellidoMaterno;

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

    @ManyToOne
    @JoinColumn(name = "tipo_documento_id", referencedColumnName = "id_tipo_documento")
    private TipoDocumentoEntity tipoDocumentoEntity;

    @ManyToOne
    @JoinColumn(name = "tipo_persona_id", referencedColumnName = "id_tipo_persona")
    private TipoPersonaEntity tipoPersonaEntity;
}
