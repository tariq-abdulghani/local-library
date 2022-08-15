package abdulghani.tariq.local_library.repository;

import abdulghani.tariq.local_library.model.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class LanguageRepository {

    @Autowired
    private EntityManager em;

    public Language findById(Long id){
        return em.find(Language.class, id);
    }
}
