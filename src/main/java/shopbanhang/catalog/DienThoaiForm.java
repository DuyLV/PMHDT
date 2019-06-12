package shopbanhang.catalog;

import javax.validation.constraints.NotEmpty;

interface DienThoaiForm {
	
	
	@NotEmpty(message = "{RegistrationForm.name.NotEmpty}") 
	String getName();

	@NotEmpty(message = "{RegistrationForm.password.NotEmpty}") 
	String getId();

	@NotEmpty(message = "{RegistrationForm.address.NotEmpty}") 
	String getPrice();
	@NotEmpty(message = "{RegistrationForm.name.NotEmpty}") 
	String getHinhAnh();

	@NotEmpty(message = "{RegistrationForm.password.NotEmpty}") 
	String getHang();

	@NotEmpty(message = "{RegistrationForm.address.NotEmpty}") 
	String getSoLuong();
	@NotEmpty(message = "{RegistrationForm.address.NotEmpty}") 
	String getMoTa();
}
