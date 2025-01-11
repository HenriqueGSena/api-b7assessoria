package com.crud.b7assessoria.service;

import com.crud.b7assessoria.dto.CategoryDTO;
import com.crud.b7assessoria.entities.Category;
import com.crud.b7assessoria.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Transactional
    public List<CategoryDTO> categorys() {
        return categoryRepository.findAll().stream()
                .map(CategoryDTO::new)
                .collect(Collectors.toList());
    }
}
