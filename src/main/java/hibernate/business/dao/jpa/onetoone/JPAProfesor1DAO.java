package hibernate.business.dao.jpa.onetoone;

import hibernate.business.dao.jpa.JPAGenericDAO;
import hibernate.business.dao.onetoone.Profesor1DAO;
import hibernate.business.model.data.onetoone.Profesor1;
import org.springframework.stereotype.Service;

@Service(value = "profesor1DAO")
public class JPAProfesor1DAO extends JPAGenericDAO<Profesor1> implements Profesor1DAO {

    public JPAProfesor1DAO() {
        super(Profesor1.class);
    }
}
