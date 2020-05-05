package com.example.hibernateinheritance.single_table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class SingleTableExample {

    @Autowired private MyProductRepository myProductRepository;
    @Autowired private BookRepository bookRepository;
    @Autowired private PenRepository penRepository;

    public void run() {

        var myProduct = new MyProduct();
        myProduct.setProductId(0l);
        myProduct.setName("foo");
        myProductRepository.save(myProduct);

        var book = new Book();
        book.setProductId(1l);
        book.setName("foo");
        book.setAuthor("foo");
        bookRepository.save(book);

        var pen = new Pen();
        pen.setProductId(2l);
        pen.setName("foo");
        pen.setColor("foo");
        penRepository.save(pen);

        log.info(myProduct);
        log.info(book);
        log.info(pen);
        log.info(myProductRepository.count());
        log.info(bookRepository.count());
        log.info(penRepository.count());
    }
}