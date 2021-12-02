package com.SpringDATA.atp62.repository;

import javax.persistence.EntityManager;

public abstract class CrudRepository <T>{
    private EntityManager entityManager;

    public CrudRepository(){
        this.entityManager = new ConnectionFactory().getConnection();
    }

    public void create (T model){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);
        this.entityManager.getTransaction().commit();
    }

    public EntityManager gEntityManager(){
        return entityManager;
    }
    public void update(T model){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);
        this.entityManager.getTransaction().commit();
    }
}
