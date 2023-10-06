package mvc.controller;

import java.util.List;
import mvc.Entity.BookEntity;
import mvc.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
  @Autowired
  BookRepository bookRepository;
  @RequestMapping(method = RequestMethod.GET)
  public Object getBook(){
    List<BookEntity>bookEntityList=bookRepository.findAll();
    return bookEntityList;
  }
}
