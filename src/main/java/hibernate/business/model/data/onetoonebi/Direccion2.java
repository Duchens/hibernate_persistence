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
@Table(name = "Direccion2")
public class Direccion2 extends PersistentIdEntity {

    @Id
    @Column(name = "Id")
    private int id;
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;
    @Column(name = "poblacion")
    private String poblacion;
    @Column(name = "provincia")
    private String provincia;
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Profesor2 profesor2;

    public Direccion2() {
    }

    public Direccion2(Long id, String calle, int numero, String poblacion, String provincia) {
        super.setId(id);
        this.calle = calle;
        this.numero = numero;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Profesor2 getProfesor2() {
        return profesor2;
    }

    public void setProfesor2(Profesor2 profesor2) {
        this.profesor2 = profesor2;
    }
}