package example.spring.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.entity.Product;
import example.spring.rest.repository.ProductRepository;



@Service
public class ProductService {

	@Autowired
	private ProductRepository proRepo;
	
	public Product getOneProduct(Integer productId) {
		Optional<Product> productOpt=proRepo.findById(productId);
	Product foundProduct=productOpt.get();
	return foundProduct;		
	}
	
	public Product createProduct(Product product) {
		Product createdProduct=proRepo.save(product);
		return createdProduct;
	}

	public List<Product> getAllProducts() {
		List<Product> allProducts=proRepo.findAll();
		return allProducts;
	}
}
