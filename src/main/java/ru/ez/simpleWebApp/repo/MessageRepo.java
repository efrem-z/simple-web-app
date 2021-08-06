package ru.ez.simpleWebApp.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import ru.ez.simpleWebApp.domain.Message;

public interface MessageRepo extends CrudRepository<Message, Long> {
   Page<Message> findAll(Pageable pageable);
   Page<Message> findByTag(String tag, Pageable pageable);


}
