package ch.zli.m223.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.lang.Error;

import ch.zli.m223.model.Entry;

@ApplicationScoped
public class EntryService {
    @Inject
    private EntityManager entityManager;

    @Transactional
    public Entry createEntry(Entry entry) {
        if (entry.getCheckIn().isBefore(entry.getCheckOut())) {
            entityManager.persist(entry);
            return entry;
         } else {
            throw new Error();
        }
        
    }

    @Transactional
    public Entry deleteEntry(Long id) {
        var entity = entityManager.find(Entry.class, id);
        entityManager.remove(entity);
        return entity;
    }

    public List<Entry> findAll() {
        var query = entityManager.createQuery("FROM Entry", Entry.class);
        return query.getResultList();
    }

    @Transactional
    public Entry updateEntry(Long id, Entry entry) {
        if (entry.getCheckIn().isBefore(entry.getCheckOut())) {
            entry.setId(id);
            return entityManager.merge(entry);
        } else {
            throw new Error();
        }
    }
}
