package example.spring.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.entity.Brand;
import example.spring.rest.entity.Category;
import example.spring.rest.entity.Product;
import example.spring.rest.repository.BrandRepository;
import example.spring.rest.repository.CategoryRepository;
import example.spring.rest.repository.ProductRepository;

@Service
public class CategoryService {

	

	@Autowired
	private CategoryRepository categoryRepo;
	
	public Category getOneCategory(Integer categoryId) {
		Optional<Category> categoryOpt=categoryRepo.findById(categoryId);
		Category foundCategory=categoryOpt.get();
	return foundCategory;		
	}
	
	public Category createCategory(Category category) {
		Category createdCategory=categoryRepo.save(category);
		return createdCategory;
	}

	public List<Category> getAllCategories() {
		List<Category> allCategories=categoryRepo.findAll();
		return allCategories;
	}
}
