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
import example.spring.rest.entity.Product;
import example.spring.rest.service.BrandService;
import example.spring.rest.service.ProductService;

@RestController
@RequestMapping("brandControl")
@CrossOrigin(origins = "http://localhost:3000")
public class BrandController {

	
	  @Autowired
			private BrandService brandServ;
			
		    
		    @GetMapping("/brands")
			public List<Brand> getAllBrand(){
				
				List<Brand> allBrands=brandServ.getAllBrands();
				return allBrands;
				
			}
		    
		    @GetMapping("/brand/{brandId}")
		    public Brand getOneBrand(@PathVariable("brandId") Integer brandId) {
		    	
		    	Brand brand=brandServ.getOneBrand(brandId);
		    	
		    	return brand;
		    	
		    }
		    @PostMapping("/newBrand")
			public Brand createNewBrand(@RequestBody Brand brand)
			{
				
				Brand createdBrand=brandServ.createBrand(brand);
				System.out.println("Brand added"+brand);
				return  createdBrand;
			}
		
}
