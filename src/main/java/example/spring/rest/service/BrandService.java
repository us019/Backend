package example.spring.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.entity.Brand;
import example.spring.rest.entity.Product;
import example.spring.rest.repository.BrandRepository;
import example.spring.rest.repository.ProductRepository;

@Service
public class BrandService {

	

	@Autowired
	private BrandRepository brandRepo;
	
	public Brand getOneBrand(Integer brandId) {
		Optional<Brand> brandOpt=brandRepo.findById(brandId);
	Brand foundProduct=brandOpt.get();
	return foundProduct;		
	}
	
	public Brand createBrand(Brand brand) {
		Brand createdBrand=brandRepo.save(brand);
		return createdBrand;
	}

	public List<Brand> getAllBrands() {
		List<Brand> allBrands=brandRepo.findAll();
		return allBrands;
	}
}
