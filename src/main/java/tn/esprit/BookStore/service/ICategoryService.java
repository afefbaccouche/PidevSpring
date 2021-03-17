package tn.esprit.BookStore.service;

import tn.esprit.BookStore.model.Category;

import java.util.List;

public interface ICategoryService<T> {
    List<T> findAll();

   T findById(Long id);

    T create(T category);

    T update(T category);


}
