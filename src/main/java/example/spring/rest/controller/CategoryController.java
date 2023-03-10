package example.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.entity.Brand;
import example.spring.rest.entity.Category;
import example.spring.rest.entity.Product;
import example.spring.rest.service.BrandService;
import example.spring.rest.service.CategoryService;
import example.spring.rest.service.ProductService;

@RestController
@RequestMapping("categoryControl")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryController {

	
	  @Autowired
			private CategoryService categoryServ;
			
		    
		    @GetMapping("/categorys")
			public List<Category> getAllCategory(){
				
				List<Category> allCategories=categoryServ.getAllCategories();
				return allCategories;
				
			}
		    
		    @GetMapping("/category/{CategoryId}")
		    public Category getOneCategory(@PathVariable("categoryId") Integer categoryId) {
		    	
		    	Category category=categoryServ.getOneCategory(categoryId);
		    	
		    	return category;
		    	
		    }
		    @PostMapping("/newCategory")
			public Category createNewCategory(@RequestBody Category category)
			{
				
		    	Category createdCategory=categoryServ.createCategory(category);
				System.out.println("Category added"+category);
				return  createdCategory;
			}
		
}
