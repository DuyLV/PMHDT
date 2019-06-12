package shopbanhang.catalog;

import javax.persistence.Entity;

import org.javamoney.moneta.Money;
import org.salespointframework.catalog.Product;

@Entity
public class DienThoai extends Product{
	
	public static enum HangTypes {
		IPHONE,SAMSUNG,NOKIA,OPPO,XIAOMI;
	}

	private String moTa, hinhAnh;
	private HangTypes hang;
	private int soLuong;
	@SuppressWarnings("unused")
	private DienThoai() {
		
	}
	public DienThoai( String  hinhAnh,String moTa,String name,Money price ,HangTypes hang,int soLuong) {
		super(name, price);
		// TODO Auto-generated constructor stub
		this.hang=hang;
		this.moTa=moTa;
		this.hinhAnh=hinhAnh;
		this.soLuong=soLuong;
		
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public HangTypes getHang() {
		return hang;
	}
	public void setHang(HangTypes hang) {
		this.hang = hang;
	}
	
	
	
}
