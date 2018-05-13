package com.sda.spring.demo.service;

import com.sda.spring.demo.model.Category;
import com.sda.spring.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    // @Autowired   --  wstrzykiwanie za pomocą pola od niedawna niezalecane
    private CategoryRepository categoryRepository;

    @Autowired  //  -- wstrzykiwanie za pomocą konstruktora
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategories() {
        /*
            dodatkowa logika
         */
        return categoryRepository.findAll();
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }
}