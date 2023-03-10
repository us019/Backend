package example.spring.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="brand_table")
@NoArgsConstructor
@Getter
@Setter
public class Brand {

	@Id
	@Column
	private int brandId;
	
	@Column
	private String brandName;

    @OneToOne(mappedBy = "brand")
    private Product product;
	
}
