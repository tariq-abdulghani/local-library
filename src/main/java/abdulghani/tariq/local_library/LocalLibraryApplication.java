package abdulghani.tariq.local_library;

import abdulghani.tariq.local_library.model.Language;
import abdulghani.tariq.local_library.repository.LanguageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LocalLibraryApplication  implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(LocalLibraryApplication.class);

	@Autowired
	private LanguageRepository languageRepository;

	public static void main(String[] args) {
		SpringApplication.run(LocalLibraryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Language language = languageRepository.findById(1000L);
		System.out.println(language);
	}
}
