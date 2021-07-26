package ru.ez.simpleWebApp.repo;

import org.springframework.data.repository.CrudRepository;
import ru.ez.simpleWebApp.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {
   List<Message> findByTag(String tag);


}
