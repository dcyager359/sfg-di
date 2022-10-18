package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;

/**
 * Created by jt on 12/27/19.
 */
public class I18nEnglishGreetingService implements GreetingService {

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    private final EnglishGreetingRepository englishGreetingRepository;
    @Override
    public String sayGreeting() {
        return this.englishGreetingRepository.sayGreeting();
    }
}
