package shopbanhang.catalog;

import org.salespointframework.catalog.Catalog;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import shopbanhang.catalog.DienThoai.HangTypes;

public interface DienThoaiCatalog extends Catalog<DienThoai>{
	static final Sort DEFAULT_SORT = Sort.by("productIdentifier").descending();
	
	Iterable<DienThoai> findByHang(HangTypes hang, Sort sort);
	
	default Iterable<DienThoai>findByHang(HangTypes hang){
		return findByHang(hang, DEFAULT_SORT);
	}
	
	
}
