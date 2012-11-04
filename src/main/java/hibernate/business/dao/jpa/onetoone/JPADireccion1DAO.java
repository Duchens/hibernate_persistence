package hibernate.business.dao.jpa.onetoone;

import hibernate.business.dao.jpa.JPAGenericDAO;
import hibernate.business.dao.onetoone.Direccion1DAO;
import hibernate.business.model.data.onetoone.Direccion1;
import org.springframework.stereotype.Service;



@Service(value = "direccion1DAO")
public class JPADireccion1DAO extends JPAGenericDAO<Direccion1> implements Direccion1DAO {

    public JPADireccion1DAO() {
        super(Direccion1.class);
    }
}

