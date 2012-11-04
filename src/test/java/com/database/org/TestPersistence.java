package com.database.org;

import hibernate.business.dao.onetoone.Direccion1DAO;
import hibernate.business.dao.onetoone.Profesor1DAO;
import hibernate.business.model.data.onetoone.Direccion1;
import hibernate.business.model.data.onetoone.Profesor1;
import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:testContext.xml", "classpath:modelContext.xml"})
public class TestPersistence {

    private static final Logger LOGGER = Logger.getLogger(TestPersistence.class);
    @Resource(name = "profesor1DAO")
    private Profesor1DAO profesor1DAO;
    @Resource(name = "direccion1DAO")
    private Direccion1DAO direccion1DAO;

    @Test
    public void onoToOne() {
        LOGGER.debug("**********INICIO***************");
        Profesor1 profesor1 = new Profesor1(Long.parseLong("1"), "miguel", "fuenzalida", "pino");
        Direccion1 direccion1 = new Direccion1(Long.parseLong("1"), "carampangue", 778, "arturo pratt", "quilicura");

        profesor1.setDireccion(direccion1);

        profesor1DAO.persist(profesor1);
        direccion1DAO.persist(direccion1);

        List<Profesor1> profesor1s = profesor1DAO.findAll();
        Assert.assertFalse(profesor1s.isEmpty());
        Assert.assertEquals(profesor1s.size(), 1);
        Assert.assertEquals(profesor1, profesor1s.get(0));

    }
}
