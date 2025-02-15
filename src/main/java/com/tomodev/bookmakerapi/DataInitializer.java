package com.tomodev.bookmakerapi;

import com.tomodev.bookmakerapi.domain.Bookmark;
import com.tomodev.bookmakerapi.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository bookmarkRepository;

    @Override
    public void run(String... args) throws Exception {
        bookmarkRepository.save(new Bookmark(null, "SivaLabs", "https://sivalabs.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "SpringBlog", "https://spring.io/blog", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Quarkus", "https://quarkus.io", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Micronaut", "https://micronaut.io", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "JOOQ", "https://jooq.org", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "VladMihalcea", "https://vladmihalcea.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Thoughts on Java", "https://thorben-janssen.com/tutorials/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "DZone", "https://dzone.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "DevopsBookmarks", "https://www.devopsbookmarks.org", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Kubernetes Docs", "https://kubernetes.io/docs/home/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Expressjs", "https://expressjs.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Marcobehler", "https://Marcobehler.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "baeldung", "https://baeldung.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "devglan", "https://devglan.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "linuxize", "https://linuxize.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "viblo", "https://viblo.asia", Instant.now()));
    }
}
