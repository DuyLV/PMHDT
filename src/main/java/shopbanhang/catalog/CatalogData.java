	package shopbanhang.catalog;

import static org.salespointframework.core.Currencies.EURO;

import org.javamoney.moneta.Money;
import org.salespointframework.core.DataInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import shopbanhang.catalog.DienThoai.HangTypes;
@Component
@Order(20)
public class CatalogData implements DataInitializer {
	private static final Logger LOG = LoggerFactory.getLogger(CatalogData.class);

	private final DienThoaiCatalog dienThoaiCatalog;
	

	public CatalogData(DienThoaiCatalog dienThoaiCatalog) {
		super();
		this.dienThoaiCatalog = dienThoaiCatalog;
	}


	@Override
	public void initialize() {
		if (dienThoaiCatalog.findAll().iterator().hasNext()) {
			return;
		}

		LOG.info("Creating default catalog entries.");
		dienThoaiCatalog.save(new DienThoai("iphone-xs-256gb-white-600x600.jpg","Man hinh cong nghe Super Amoled, 16 trieu mau"
				+ "chuan man hinh Super Retina HD"
				+ "Camera 7.0 mp, Camera sau Dual Camera 12.0 MP"
				+ "6 nhân , chipset Apple A12 Bionic","Iphone XS 256GB White",Money.of(550, EURO),HangTypes.IPHONE,10 ));
		
		dienThoaiCatalog.save(new DienThoai("iphone-xs-max-gray-600x600.jpg",".","Iphone XS 256GB Gray",Money.of(550, EURO),HangTypes.IPHONE,10  ));
		
		dienThoaiCatalog.save(new DienThoai("ip7-plus-vang-1.jpg","Man hinh 36 trieu mau, full HD"
				+ "Camera 7.0 MP , Camera sau Dual 12.0 MP"
				+ "T?c d? CPU 2.3 GHz, 4 nhân, Ram 3G","Iphone 7 Plus Gold",Money.of(550, EURO),HangTypes.IPHONE,10  ));
		
		dienThoaiCatalog.save(new DienThoai("iphone8-plus-64-vang-1.jpg","Cong nghe man hinh Retina HD, chuan HD"
				+ "Camera 7.0 MP , Camera sau Dual 12.0 MP"
				+ "Chipset apple A11 Bionic, Ram 2G","Iphone 8 Plus 64G Gold",Money.of(550, EURO),HangTypes.IPHONE,10  ));
		
		dienThoaiCatalog.save(new DienThoai("Iphone-6s-gold-1.jpg","Man hinh 36 trieu mau, full HD"
				+ "Camera 7.0 MP , Camera sau Dual 12.0 MP"
				+ "T?c d? CPU 1.8 GHz, 2 nhân, Ram 2G","Iphone 6s Gold",Money.of(550, EURO),HangTypes.IPHONE,10  ));
		
		dienThoaiCatalog.save(new DienThoai("iphone-Xr-den.jpg","Cong nghe man hinh Retina HD, 16 trieu mau"
				+ "Camera 7.0 MP , Camera sau Dual 12.0 MP"
				+ "Chipset apple A12 Bionic,6 nhan,  Ram 3G","Iphone XR Den",Money.of(550, EURO),HangTypes.IPHONE,10  ));
	
		dienThoaiCatalog.save(new DienThoai("iPhone-Xs-Max-gold.jpg","Man hinh cong nghe Super Amoled, 16 trieu mau" 
				+ "chuan man hinh Super Retina HD" 
				+ "Camera 7.0 mp, Camera sau Dual Camera 12.0 MP" 
				+ "6 nhân , chipset Apple A12 Bionic","Iphone XS 256GB Gold",Money.of(550, EURO),HangTypes.IPHONE,10  ));
	
		dienThoaiCatalog.save(new DienThoai("iphone-xs-256gb-white-600x600.jpg","Man hinh cong nghe Super Amoled, 16 trieu mau"
				+"chuan man hinh Super Retina HD" + 
				"Camera 7.0 mp, Camera sau Dual Camera 12.0 MP" + 
				"6 nhân , chipset Apple A12 Bionic","Iphone XS 256GB White",Money.of(550, EURO),HangTypes.IPHONE,10  ));
		
		dienThoaiCatalog.save(new DienThoai("Iphone-6s-gold-1.jpg","Man hinh 36 trieu mau, full HD"
				+ "Camera 7.0 MP , Camera sau Dual 12.0 MP"
				+ "T?c d? CPU 1.8 GHz, 2 nhân, Ram 2G","Iphone 6s Gold",Money.of(550, EURO),HangTypes.IPHONE,10  ));
		
		dienThoaiCatalog.save(new DienThoai("iPhone-Xs-Max-gold.jpg","Man hinh cong nghe Super Amoled, 16 trieu mau" 
				+ "chuan man hinh Super Retina HD" 
				+ "Camera 7.0 mp, Camera sau Dual Camera 12.0 MP" 
				+ "6 nhân , chipset Apple A12 Bionic","Iphone XS 256GB Gold",Money.of(550, EURO),HangTypes.IPHONE,10  ));
		
		
		
		dienThoaiCatalog.save(new DienThoai("1.jpg","Công ngh? man hinh :IPS LCD, 16 Tri?u, Full HD+"
				+ "Camera truoc 20.0 MP, Camera sau: 12.0 MP + 13.0 MP"
				+ "Toc do CPU :	2 x 2.2 GHz & 6x 1.7, So nhan: 8, Chipset :	Qualcomm Snapdragon 710"
				+"RAM :	4 GB","Nokia 8.1 Den",Money.of(550, EURO),HangTypes.NOKIA,10  ));
		
		dienThoaiCatalog.save(new DienThoai("2.jpg","Cong nghe man hinh:IPS LCD" + 
				"MAn hinh :	16 Trieu mau, chuan man hinh HD" +
				"Camera truoc 8.0 MP, Camera Sau: 13.0 + 15.0 MP " + 
				"Toc do CPU :2 GHz, 8 nhan, chipset MediaTek MT6762" + 
				"Chip do hoa (GPU) :PowerVR GE8320","Nokia 3.1 Plus ",Money.of(550, EURO),HangTypes.NOKIA ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("3.jpg","Cong nghe man hinh:IPS LCD" + 
				"MAn hinh :	16 Trieu mau, chuan man hinh HD" +
				"Camera truoc 8.0 MP, Camera Sau: 13.0 + 15.0 MP " + 
				"Toc do CPU :2 GHz, 8 nhan, chipset MediaTek MT6762" + 
				"Chip do hoa (GPU) :PowerVR GE8320","Nokia 3.1",Money.of(550, EURO),HangTypes.NOKIA ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("636737264632684088_nokia6Plus-trang-1.jpg","Cong nghe man hinh:IPS LCD" + 
				"MAn hinh :	16 Trieu mau, chuan man hinh HD" +
				"Camera truoc 8.0 MP, Camera Sau: 13.0 + 15.0 MP " + 
				"Toc do CPU :2 GHz, 8 nhan, chipset MediaTek MT6762" + 
				"Chip do hoa (GPU) :PowerVR GE8320","Nokia 6Plus Trang",Money.of(550, EURO),HangTypes.NOKIA ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("636706368508652638_nokia21-xanhden-1.jpg","Cong nghe man hinh:IPS LCD" + 
				"MAn hinh :	16 Trieu mau, chuan man hinh HD" +
				"Camera truoc 8.0 MP, Camera Sau: 13.0 + 15.0 MP " + 
				"Toc do CPU :2 GHz, 8 nhan, chipset MediaTek MT6762" + 
				"Chip do hoa (GPU) :PowerVR GE8320","Nokia 21",Money.of(550, EURO),HangTypes.NOKIA ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("636737414993121438_nokia6Plus-xanh-1.jpg","Cong nghe man hinh:IPS LCD" + 
				"MAn hinh :	16 Trieu mau, chuan man hinh HD" +
				"Camera truoc 8.0 MP, Camera Sau: 13.0 + 15.0 MP " + 
				"Toc do CPU :2 GHz, 8 nhan, chipset MediaTek MT6762" + 
				"Chip do hoa (GPU) :PowerVR GE8320","Nokia 6Plus Xanh",Money.of(550, EURO),HangTypes.NOKIA,10  ));
		
		dienThoaiCatalog.save(new DienThoai("nokia105.jpg","Danh ba: 2000 so" + 
				"Kich thuoc: 112 x 49.5 x 14.4" + 
				"Loai pin:Pin chuan Li-Ion" + 
				"Thoi gian dam thoai :	15 tieng" + 
				"Dung luong pin :800 mAh","Nokia 105",Money.of(550, EURO),HangTypes.NOKIA ,10 ));
	
		dienThoaiCatalog.save(new DienThoai("nokia130.jpg","Danh ba: 2000 so" + 
				"Kich thuoc: 112 x 49.5 x 14.4" + 
				"Loai pin:Pin chuan Li-Ion" + 
				"Thoi gian dam thoai :	15 tieng" + 
				"Dung luong pin :800 mAh","Nokia 130",Money.of(550, EURO),HangTypes.NOKIA,10  ));
	
		
		
		dienThoaiCatalog.save(new DienThoai("636930203385853205_oppo-a5s-den-1.jpg",
				"Cong nghe man hinh:AMOLED, 16 Trieu Mau,Full HD"
				+"Camera truoc 16.0 MP"
				+ "Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"
				+ "Toc do CPU :2.8 GHz, 8 nhan, Chipset :Qualcomm SnapdragonTM 855, RAM :8 GB"
				+"Chip do hoa (GPU) Adreno 640","Oppo A5S Den",Money.of(550, EURO),HangTypes.OPPO ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("636812690029596126_oppo-a7-vang-1.jpg","Cong nghe man hinh:AMOLED, 16 Trieu Mau,Full HD"
				+"Camera truoc 16.0 MP"
				+ "Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"
				+ "Toc do CPU :2.8 GHz, 8 nhan, Chipset :Qualcomm SnapdragonTM 855, RAM :8 GB"
				+"Chip do hoa (GPU) Adreno 640","Oppo A7 Vang",Money.of(550, EURO),HangTypes.OPPO,10  ));
		
		dienThoaiCatalog.save(new DienThoai("oppo-a1k-den-1.jpg","Cong nghe man hinh:AMOLED, 16 Trieu Mau,Full HD"
				+"Camera truoc 16.0 MP"
				+ "Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"
				+ "Toc do CPU :2.8 GHz, 8 nhan, Chipset :Qualcomm SnapdragonTM 855, RAM :8 GB"
				+"Chip do hoa (GPU) Adreno 640","Oppo A1K Den",Money.of(550, EURO),HangTypes.OPPO ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("oppo-reno-10x-zoom-den-1.jpg","Cong nghe man hinh:AMOLED, 16 Trieu Mau,Full HD"
				+"Camera truoc 16.0 MP"
				+ "Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"
				+ "Toc do CPU :2.8 GHz, 8 nhan, Chipset :Qualcomm SnapdragonTM 855, RAM :8 GB"
				+"Chip do hoa (GPU) Adreno 640","Oppo Reno 10X",Money.of(550, EURO),HangTypes.OPPO ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("oppo reno.jpg","Cong nghe man hinh:AMOLED, 16 Trieu Mau,Full HD"
				+"Camera truoc 16.0 MP"
				+ "Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"
				+ "Toc do CPU :2.8 GHz, 8 nhan, Chipset :Qualcomm SnapdragonTM 855, RAM :8 GB"
				+"Chip do hoa (GPU) Adreno 640","Oppo Reno",Money.of(550, EURO),HangTypes.OPPO ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("oppo-f11-tim-1.jpg","Cong nghe man hinh:AMOLED, 16 Trieu Mau,Full HD"
				+"Camera truoc 16.0 MP"
				+ "Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"
				+ "Toc do CPU :2.8 GHz, 8 nhan, Chipset :Qualcomm SnapdragonTM 855, RAM :8 GB"
				+"Chip do hoa (GPU) Adreno 640","Oppo F11",Money.of(550, EURO),HangTypes.OPPO ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("oppoA3s-do-1.jpg","Cong nghe man hinh:AMOLED, 16 Trieu Mau,Full HD"
				+"Camera truoc 16.0 MP"
				+ "Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"
				+ "Toc do CPU :2.8 GHz, 8 nhan, Chipset :Qualcomm SnapdragonTM 855, RAM :8 GB"
				+"Chip do hoa (GPU) Adreno 640","Oppo A3S",Money.of(550, EURO),HangTypes.OPPO ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("oppoF9-xanh-0.jpg","Cong nghe man hinh:AMOLED, 16 Trieu Mau,Full HD"
				+"Camera truoc 16.0 MP"
				+ "Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"
				+ "Toc do CPU :2.8 GHz, 8 nhan, Chipset :Qualcomm SnapdragonTM 855, RAM :8 GB"
				+"Chip do hoa (GPU) Adreno 640","Oppo F9",Money.of(550, EURO),HangTypes.OPPO ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("oppo-reno-10x-zoom-den-1.jpg","Cong nghe man hinh:AMOLED, 16 Trieu Mau,Full HD"
				+"Camera truoc 16.0 MP"
				+ "Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"
				+ "Toc do CPU :2.8 GHz, 8 nhan, Chipset :Qualcomm SnapdragonTM 855, RAM :8 GB"
				+"Chip do hoa (GPU) Adreno 640","Oppo Reno 10X",Money.of(550, EURO),HangTypes.OPPO ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("oppo a83.jpg","Cong nghe man hinh:AMOLED, 16 Trieu Mau,Full HD"
				+"Camera truoc 16.0 MP"
				+ "Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"
				+ "Toc do CPU :2.8 GHz, 8 nhan, Chipset :Qualcomm SnapdragonTM 855, RAM :8 GB"
				+"Chip do hoa (GPU) Adreno 640","Oppo A83",Money.of(550, EURO),HangTypes.OPPO ,10 ));
	
		
		
		dienThoaiCatalog.save(new DienThoai("10.jpg",
				"Cong nghe man hinh:IPS LCD, chuan HD"
				+ "Camera Truoc: 8.0 MPt"
				+ "Camera Sau: Camera kep 12MP+5MP"
				+"Toc do CPU :	1.4 GHz, 4 nhan, Chipset :Qualcomm Snapdragon 425 RAM :3 GB" 
				+ "Chip do hoa(GPU) : Adreno 308","SamSung S9 Den",Money.of(550, EURO),HangTypes.SAMSUNG,10  ));
		
		dienThoaiCatalog.save(new DienThoai("13.jpg","Cong nghe man hinh:IPS LCD, chuan HD"
				+ "Camera Truoc: 8.0 MP"
				+ "Camera Sau: Camera kep 12MP+5MP"
				+"Toc do CPU :	1.4 GHz, 4 nhan, Chipset :	Qualcomm Snapdragon 425 RAM :3 GB" 
				+ "Chip do hoa(GPU) :	Adreno 308","SammSung J7+",Money.of(550, EURO),HangTypes.SAMSUNG,10 ));
		
		dienThoaiCatalog.save(new DienThoai("samsumA7-2018-Blue-1.jpg","Cong nghe man hinh:IPS LCD, chuan HD"
				+ "Camera Truoc: 8.0 MP"
				+ "Camera Sau: Camera kep 12MP+5MP"
				+"Toc do CPU :	1.4 GHz, 4 nhan, Chipset :	Qualcomm Snapdragon 425 RAM :3 GB" 
				+ "Chip do hoa(GPU) :	Adreno 308","SamSung A7 Blue 2018",Money.of(550, EURO),HangTypes.SAMSUNG,10 ));
		
		dienThoaiCatalog.save(new DienThoai("samsung-galaxy-a10-xanh-1.jpg","Cong nghe man hinh:IPS LCD, chuan HD"
				+ "Camera Truoc: 8.0 MP"
				+ "Camera Sau: Camera kep 12MP+5MP"
				+"Toc do CPU :	1.4 GHz, 4 nhan, Chipset :	Qualcomm Snapdragon 425 RAM :3 GB" 
				+ "Chip do hoa(GPU) :	Adreno 308","SS Galaxy A10 Blue",Money.of(550, EURO),HangTypes.SAMSUNG ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("samsung-galaxy-a30-den-1.jpg","Cong nghe man hinh:IPS LCD, chuan HD"
				+ "Camera Truoc: 8.0 MP"
				+ "Camera Sau: Camera kep 12MP+5MP"
				+"Toc do CPU :	1.4 GHz, 4 nhan, Chipset :	Qualcomm Snapdragon 425 RAM :3 GB" 
				+ "Chip do hoa(GPU) :	Adreno 308","SS Galaxy A30 Den",Money.of(550, EURO),HangTypes.SAMSUNG ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("samsung-galaxy-a30-xanh-1.jpg","Cong nghe man hinh:IPS LCD, chuan HD"
				+ "Camera Truoc: 8.0 MP"
				+ "Camera Sau: Camera kep 12MP+5MP"
				+"Toc do CPU :	1.4 GHz, 4 nhan, Chipset :	Qualcomm Snapdragon 425 RAM :3 GB" 
				+ "Chip do hoa(GPU) :	Adreno 308","SS Galaxy A30 Blue ",Money.of(550, EURO),HangTypes.SAMSUNG ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("samsung-galaxy-j6-plus-do-1.jpg","Cong nghe man hinh:IPS LCD, chuan HD"
				+ "Camera Truoc: 8.0 MP"
				+ "Camera Sau: Camera kep 12MP+5MP"
				+"Toc do CPU :	1.4 GHz, 4 nhan, Chipset :	Qualcomm Snapdragon 425 RAM :3 GB" 
				+ "Chip do hoa(GPU) :	Adreno 308","SS Galaxy J6+ Do",Money.of(550, EURO),HangTypes.SAMSUNG ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("ss-galaxy-a50-xanh-1.jpg","Cong nghe man hinh:IPS LCD, chuan HD"
				+ "Camera Truoc: 8.0 MP"
				+ "Camera Sau: Camera kep 12MP+5MP"
				+"Toc do CPU :	1.4 GHz, 4 nhan, Chipset :	Qualcomm Snapdragon 425 RAM :3 GB" 
				+ "Chip do hoa(GPU) :	Adreno 308","SS Galaxy A50 Blue",Money.of(550, EURO),HangTypes.SAMSUNG ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("ss-a6plus-xanh-1.jpg","Cong nghe man hinh:IPS LCD, chuan HD"
				+ "Camera Truoc: 8.0 MP"
				+ "Camera Sau: Camera kep 12MP+5MP"
				+"Toc do CPU :	1.4 GHz, 4 nhan, Chipset :	Qualcomm Snapdragon 425 RAM :3 GB" 
				+ "Chip do hoa(GPU) :	Adreno 308","SamSung A6+ Blue",Money.of(550, EURO),HangTypes.SAMSUNG ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("ss-galaxy-s10e-den-1.jpg","Cong nghe man hinh:IPS LCD, chuan HD"
				+ "Camera Truoc: 8.0 MP"
				+ "Camera Sau: Camera kep 12MP+5MP"
				+"Toc do CPU :	1.4 GHz, 4 nhan, Chipset :	Qualcomm Snapdragon 425 RAM :3 GB" 
				+ "Chip do hoa(GPU) :	Adreno 308","SS Galaxy S10E Den",Money.of(550, EURO),HangTypes.SAMSUNG ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("ss-j2core-den-1.jpg","Cong nghe man hinh:IPS LCD, chuan HD"
				+ "Camera Truoc: 8.0 MP"
				+ "Camera Sau: Camera kep 12MP+5MP"
				+"Toc do CPU :	1.4 GHz, 4 nhan, Chipset :	Qualcomm Snapdragon 425 RAM :3 GB" 
				+ "Chip do hoa(GPU) :	Adreno 308","SamSung J2 Core Den",Money.of(550, EURO),HangTypes.SAMSUNG ,10 ));
		
		dienThoaiCatalog.save(new DienThoai("10.jpg","Cong nghe man hinh:IPS LCD, chuan HD"
				+ "Camera Truoc: 8.0 MP"
				+ "Camera Sau: Camera kep 12MP+5MP"
				+"Toc do CPU :	1.4 GHz, 4 nhan, Chipset :	Qualcomm Snapdragon 425 RAM :3 GB" 
				+ "Chip do hoa(GPU) :	Adreno 308","SamSung S9+ Den",Money.of(550, EURO),HangTypes.SAMSUNG ,10 ));
		
		
		
		dienThoaiCatalog.save(new DienThoai("636813355548095597_xiaomi-mi-a2-lite-den-1.jpg",
				"Cong nghe man hinh: AMOLED, 16 trieu mau,Full HD" +
				"Camera Truoc:	20.0 MP" + 
				"Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"+
				"Toc do CPU :	2.3Ghz, 8 nhan, Chipset :Snap dragon 712,RAM :	6 GB"+
				"Chip do hoa: Adreno 616","XiaoMi Mi A20",Money.of(550, EURO),HangTypes.XIAOMI ,10 ));
		dienThoaiCatalog.save(new DienThoai("_xiaomi-mi-9-se-den-1.jpg","Cong nghe man hinh: AMOLED, 16 trieu mau,Full HD" + 
				"Do phan giai: 1080 x 2340 Pixels" +
				"Camera Truoc:	20.0 MP" + 
				"Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"+
				"Toc do CPU :	2.3Ghz, 8 nhan, Chipset :Snap dragon 712,RAM :	6 GB"+
				"Chip do hoa: Adreno 616","XiaMi Mi 9 Se",Money.of(550, EURO),HangTypes.XIAOMI,10  ));
		dienThoaiCatalog.save(new DienThoai("636813313201604227_xiaomi-pocophone-f1-xanh-1.jpg","Cong nghe man hinh: AMOLED, 16 trieu mau,Full HD" + 
				"Camera Truoc:	20.0 MP" + 
				"Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"+
				"Toc do CPU :	2.3Ghz, 8 nhan, Chipset :Snap dragon 712,RAM :	6 GB"+
				"Chip do hoa: Adreno 616","XiaMi Pocophone F1",Money.of(550, EURO),HangTypes.XIAOMI ,10 ));
		dienThoaiCatalog.save(new DienThoai("636887567190398486_xiaomi-redmi-note-7-den-1.jpg","Cong nghe man hinh: AMOLED, 16 trieu mau,Full HD" + 
				"Camera Truoc:	20.0 MP" + 
				"Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"+
				"Toc do CPU :	2.3Ghz, 8 nhan, Chipset :Snap dragon 712,RAM :	6 GB"+
				"Chip do hoa: Adreno 616","XiaMi Redmi Note 7",Money.of(550, EURO),HangTypes.XIAOMI ,10 ));
		dienThoaiCatalog.save(new DienThoai("xiaomi-mi8-lite-den-1.jpg","Cong nghe man hinh: AMOLED, 16 trieu mau,Full HD" + "Do phan giai: 1080 x 2340 Pixels" +
				"Camera Truoc:	20.0 MP" + 
				"Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"+
				"Toc do CPU :	2.3Ghz, 8 nhan, Chipset :Snap dragon 712,RAM :	6 GB"+
				"Chip do hoa: Adreno 616","XiaoMi Mi8",Money.of(550, EURO),HangTypes.XIAOMI ,10 ));
		dienThoaiCatalog.save(new DienThoai("xiaomi-mi-mix-4-1.jpg","Cong nghe man hinh: AMOLED, 16 trieu mau,Full HD" + 
				"Camera Truoc:	20.0 MP" + 
				"Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"+
				"Toc do CPU :	2.3Ghz, 8 nhan, Chipset :Snap dragon 712,RAM :	6 GB"+
				"Chip do hoa: Adreno 616","Xiami Mi Mix 4",Money.of(550, EURO),HangTypes.XIAOMI ,10 ));
		dienThoaiCatalog.save(new DienThoai("xiaomi-note6-pro-hong-1.jpg","Cong nghe man hinh: AMOLED, 16 trieu mau,Full HD" + 
				"Camera Truoc:	20.0 MP" + 
				"Camera Sau: 48 MP,13 MP +8 MP ( 3 camera )"+
				"Toc do CPU :	2.3Ghz, 8 nhan, Chipset :Snap dragon 712,RAM :	6 GB"+
				"Chip do hoa: Adreno 616","XiaoMi Note 6Pro",Money.of(550, EURO),HangTypes.XIAOMI ,10 ));
		dienThoaiCatalog.save(new DienThoai("xiaomi-mi8-lite-den-1.jpg","Cong nghe man hinh: AMOLED, 16 trieu mau,Full HD" + 
				"Camera Truoc:	20.0 MP" + 
				"Camera Sau: 48 MP,13 MP +8 MP (3 camera )"+
				"Toc do CPU :	2.3Ghz, 8 nhan, Chipset :Snap dragon 712,RAM :	6 GB"+
				"Chip do hoa: Adreno 616","XiaoMi Mi 8",Money.of(550, EURO),HangTypes.XIAOMI ,10 ));
	}
	

}
