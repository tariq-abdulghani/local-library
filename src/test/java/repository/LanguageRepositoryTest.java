package repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import abdulghani.tariq.local_library.LocalLibraryApplication;
import abdulghani.tariq.local_library.model.Language;
import abdulghani.tariq.local_library.repository.LanguageRepository;

@SpringBootTest(classes = LocalLibraryApplication.class)
public class LanguageRepositoryTest {
	
	@Autowired
	private LanguageRepository repository;
	
    @Test
    public  void loadContext(){
    	Language lang = repository.findById(1000L);
    	assertEquals("arabic", lang.getName());
    }
    
   
}
