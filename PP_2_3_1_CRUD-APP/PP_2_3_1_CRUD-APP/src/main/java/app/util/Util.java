package app.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Util {
    // реализуйте настройку соединения с БД
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");

    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

}
