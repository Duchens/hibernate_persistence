package hibernate.business.model.data.onetoone;

import hibernate.business.model.PersistentIdEntity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "profesor1")
public class Profesor1 extends PersistentIdEntity {

    @Column(name="nombre")
    private String nombre;
    @Column(name="ape1")
    private String ape1;
    @Column(name="ape2")
    private String ape2;
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Direccion1 direccion;

    public Profesor1() {
    }

    public Profesor1(Long id, String nombre, String ape1, String ape2) {
        super.setId(id);
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public Direccion1 getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion1 direccion) {
        this.direccion = direccion;
    }
}
