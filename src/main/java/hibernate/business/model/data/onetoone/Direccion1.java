package hibernate.business.model.data.onetoone;

import hibernate.business.model.PersistentIdEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "direccion1")
public class Direccion1 extends PersistentIdEntity {

    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;
    @Column(name = "poblacion")
    private String poblacion;
    @Column(name = "provincia")
    private String provincia;

    public Direccion1() {
    }

    public Direccion1(Long id, String calle, int numero, String poblacion, String provincia) {
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
}
