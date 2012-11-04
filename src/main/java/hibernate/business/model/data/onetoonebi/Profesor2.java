package hibernate.business.model.data.onetoonebi;

import hibernate.business.model.PersistentIdEntity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Profesor2")
public class Profesor2 extends PersistentIdEntity {

    @Id
    @Column(name = "Id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "ape1")
    private String ape1;
    @Column(name = "ape2")
    private String ape2;
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Direccion2 direccion2;
    
    public Profesor2(){
    
    }
    
     public Profesor2(Long id, String nombre, String ape1, String ape2) {
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

    public Direccion2 getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(Direccion2 direccion2) {
        this.direccion2 = direccion2;
    }
    
}
