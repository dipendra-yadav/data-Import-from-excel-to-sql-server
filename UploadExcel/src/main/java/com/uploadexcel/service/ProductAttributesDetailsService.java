package com.uploadexcel.service;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.StringUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.uploadexcel.model.ProductAttributesDetails;
import com.uploadexcel.model.ProductAttributesDetailsTO;
import com.uploadexcel.repository.ProductAttributesRepository;

@Service
//@Transactional
public class ProductAttributesDetailsService {

	@Autowired
	private ProductAttributesRepository productAttributesRepository;

	/*public java.util.Date parseDate(String date) throws ParseException {
		// SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD HH:MI:SS");
		SimpleDateFormat format = new SimpleDateFormat("YYYYMMDD");
		java.util.Date date1 = format.parse(date);
		// System.out.println("date:" + date1);
		// java.util.Date date1 = format.parse(parsedate);
		return date1;
	}
*/
	List<ProductAttributesDetailsTO> pLists = null;

	@SuppressWarnings("deprecation")
	public void uploadExcel(MultipartFile excelfile) throws IOException, ParseException {
		// ProductAttributesDetails productAttributesDetails = new
		// ProductAttributesDetails();
		XSSFWorkbook workbook = new XSSFWorkbook(excelfile.getInputStream());
		XSSFSheet sheet = workbook.getSheetAt(1);
		XSSFRow row = null;
		XSSFCell cell = null;
		System.out.println("sheet name is :" + sheet.getSheetName());
		Iterator<Row> rows = sheet.rowIterator();
		pLists = new ArrayList<>();
		List<List<String>> recLst = new ArrayList<>();
		rows.next();
		while (rows.hasNext()) {
			List<String> rec = new ArrayList<>();
			row = (XSSFRow) rows.next();
			for (int i = 0; i <= 103; i++) {
				if (null != row.getCell(i) && null != row.getCell(i).getStringCellValue()) {
					rec.add(row.getCell(i).getStringCellValue());
				} else {
					rec.add("");
				}
			}

			recLst.add(rec);

		}

		prepareTranferObject(recLst);// call to Prepare the TO

	}

	// prepare the Transfer Object
	private void prepareTranferObject(List<List<String>> recLst) {

		for (List<String> rec : recLst) {
			ProductAttributesDetailsTO pdetailsTO = new ProductAttributesDetailsTO();
			// System.out.println("Size:" + rec.size());

			pdetailsTO.setUniqueId("");// PUT the auto-genetarted one

			pdetailsTO.setRecordId(rec.get(0));
			// System.out.println("------------------+" + rec.get(0) + "\t");
			pdetailsTO.setSellerIDQualifier(rec.get(1));
			// System.out.println("------------------+" + rec.get(1) + "\t");
			pdetailsTO.setIDWPrivateId(rec.get(2));
			pdetailsTO.setDateCreated(rec.get(3));

			// pdetailsTO.setSellerID((rec.get(2)));
			// pdetailsTO.setDateCreated(parseDate((String) rec.get(3)));

			pdetailsTO.setUpdateStatus(rec.get(4));
			// pdetailsTO.setItemCtrlNumber(rec.get(5));
			pdetailsTO.setIDWitemControllNumber(rec.get(5));
			pdetailsTO.setUPC(rec.get(6));
			pdetailsTO.setGTIN(rec.get(7));

			pdetailsTO.setEAN(rec.get(8));
			// pdetailsTO.setEANUCC(rec.get(8));
			pdetailsTO.setCatalogNumber(rec.get(9));
			// System.out.println("catalog_Number\t" + rec.get(9));
			pdetailsTO.setuNSPSC((rec.get(10)));
			pdetailsTO.setIGCC(rec.get(11));
			pdetailsTO.setIndexID(rec.get(12).toString());
			pdetailsTO.setReserved1(rec.get(13));
			pdetailsTO.setReserved2(rec.get(14));
			pdetailsTO.setReserved3(rec.get(15));
			pdetailsTO.setReserved4(rec.get(16));
			pdetailsTO.setReserved5(rec.get(17));

			pdetailsTO.setAttributeName1(rec.get(18));
			pdetailsTO.setAttributeValue1(rec.get(19));
			pdetailsTO.setAttributeUOM1(rec.get(20));

			pdetailsTO.setAttributeName2(rec.get(21));
			pdetailsTO.setAttributeValue2(rec.get(22));
			pdetailsTO.setAttributeUOM2(rec.get(23));

			pdetailsTO.setAttributeName3(rec.get(24));
			pdetailsTO.setAttributeValue3(rec.get(25));
			pdetailsTO.setAttributeUOM3(rec.get(26));

			pdetailsTO.setAttributeName4(rec.get(27));
			pdetailsTO.setAttributeValue4(rec.get(28));
			pdetailsTO.setAttributeUOM4(rec.get(29));

			pdetailsTO.setAttributeName5(rec.get(30));
			pdetailsTO.setAttributeValue5(rec.get(31));
			pdetailsTO.setAttributeUOM5(rec.get(32));

			pdetailsTO.setAttributeName6(rec.get(33));
			pdetailsTO.setAttributeValue6(rec.get(34));
			pdetailsTO.setAttributeUOM6(rec.get(35));

			pdetailsTO.setAttributeName7(rec.get(36));
			pdetailsTO.setAttributeValue7(rec.get(37));
			pdetailsTO.setAttributeUOM7(rec.get(38));

			pdetailsTO.setAttributeName8((String) rec.get(39));
			pdetailsTO.setAttributeValue8((String) rec.get(40));
			pdetailsTO.setAttributeUOM8((String) rec.get(41));

			pdetailsTO.setAttributeName9((String) rec.get(42));
			pdetailsTO.setAttributeValue9((String) rec.get(43));
			pdetailsTO.setAttributeUOM9((String) rec.get(44));

			pdetailsTO.setAttributeName10((String) rec.get(45));
			pdetailsTO.setAttributeValue10((String) rec.get(46));
			pdetailsTO.setAttributeUOM10((String) rec.get(47));

			pdetailsTO.setAttributeName11((String) rec.get(48));
			pdetailsTO.setAttributeValue11((String) rec.get(49));
			pdetailsTO.setAttributeUOM11((String) rec.get(50));

			pdetailsTO.setAttributeName12((String) rec.get(51));
			pdetailsTO.setAttributeValue12((String) rec.get(52));
			pdetailsTO.setAttributeUOM12((String) rec.get(53));

			pdetailsTO.setAttributeName13((String) rec.get(54));
			pdetailsTO.setAttributeValue13((String) rec.get(55));
			pdetailsTO.setAttributeUOM13((String) rec.get(56));

			pdetailsTO.setAttributeName14((String) rec.get(57));
			pdetailsTO.setAttributeValue14((String) rec.get(58));
			pdetailsTO.setAttributeUOM14((String) rec.get(59));

			pdetailsTO.setAttributeName15((String) rec.get(60));
			pdetailsTO.setAttributeValue15((String) rec.get(61));
			pdetailsTO.setAttributeUOM15((String) rec.get(62));

			pdetailsTO.setAttributeName16((String) rec.get(63));
			pdetailsTO.setAttributeValue16((String) rec.get(64));
			pdetailsTO.setAttributeUOM16((String) rec.get(65));

			pdetailsTO.setAttributeName17((String) rec.get(66));
			pdetailsTO.setAttributeValue17((String) rec.get(67));
			pdetailsTO.setAttributeUOM17((String) rec.get(68));

			pdetailsTO.setAttributeName18((String) rec.get(69));
			pdetailsTO.setAttributeValue18((String) rec.get(70));
			pdetailsTO.setAttributeUOM18((String) rec.get(71));

			pdetailsTO.setAttributeName19((String) rec.get(72));
			pdetailsTO.setAttributeValue19((String) rec.get(73));
			pdetailsTO.setAttributeUOM19((String) rec.get(74));

			pdetailsTO.setAttributeName20((String) rec.get(75));
			pdetailsTO.setAttributeValue20((String) rec.get(76));
			pdetailsTO.setAttributeUOM20((String) rec.get(77));

			pdetailsTO.setAttributeName21((String) rec.get(78));
			pdetailsTO.setAttributeValue21((String) rec.get(79));
			pdetailsTO.setAttributeUOM21((String) rec.get(80));

			pdetailsTO.setAttributeName22((String) rec.get(81));
			pdetailsTO.setAttributeValue22((String) rec.get(82));
			pdetailsTO.setAttributeUOM22((String) rec.get(83));

			pdetailsTO.setAttributeName23((String) rec.get(84));
			pdetailsTO.setAttributeValue23((String) rec.get(85));
			pdetailsTO.setAttributeUOM23((String) rec.get(86));

			pdetailsTO.setAttributeName24((String) rec.get(87));
			pdetailsTO.setAttributeValue24((String) rec.get(88));
			pdetailsTO.setAttributeUOM24((String) rec.get(89));

			pdetailsTO.setAttributeName25((String) rec.get(90));
			pdetailsTO.setAttributeValue25((String) rec.get(91));
			pdetailsTO.setAttributeUOM22((String) rec.get(92));

			pdetailsTO.setAttributeName26((String) rec.get(93));
			pdetailsTO.setAttributeValue26((String) rec.get(94));
			pdetailsTO.setAttributeUOM26((String) rec.get(95));

			pdetailsTO.setAttributeName27((String) rec.get(96));
			pdetailsTO.setAttributeValue27((String) rec.get(97));
			pdetailsTO.setAttributeUOM27((String) rec.get(98));

			pdetailsTO.setPipe((String) rec.get(99));
			pdetailsTO.setItemStatus((String) rec.get(100));

			// System.out.println("=="+rec.get(99)+"and"+rec.get(100));

//				pdetailsTO.setAttributeName28((String) rec.get(102));
//				pdetailsTO.setAttributeValue28((String) rec.get(103));
//				pdetailsTO.setAttributeUOM28((String) rec.get(104));

//				pdetailsTO.setAttributeName29((String) rec.get(105));
//				pdetailsTO.setAttributeValue29((String) rec.get(106));
//				pdetailsTO.setAttributeUOM29((String) rec.get(107));

//				pdetailsTO.setAttributeName30((String) rec.get(108));
//				pdetailsTO.setAttributeValue30((String) rec.get(109));
//				pdetailsTO.setAttributeUOM30((String) rec.get(110));

//				pdetailsTO.setAttributeName31((String) rec.get(111));
//				pdetailsTO.setAttributeValue31((String) rec.get(112));
//				pdetailsTO.setAttributeUOM31((String) rec.get(113));
			//
//				pdetailsTO.setAttributeName32((String) rec.get(115));
//				pdetailsTO.setAttributeValue32((String) rec.get(116));
//				pdetailsTO.setAttributeUOM32((String) rec.get(117));
			//
//				pdetailsTO.setAttributeName33((String) rec.get(118));
//				pdetailsTO.setAttributeValue33((String) rec.get(119));
//				pdetailsTO.setAttributeUOM33((String) rec.get(120));
			//
//				pdetailsTO.setAttributeName34((String) rec.get(121));
//				pdetailsTO.setAttributeValue34((String) rec.get(122));
//				pdetailsTO.setAttributeUOM34((String) rec.get(123));
			//
//				pdetailsTO.setAttributeName35((String) rec.get(124));
//				pdetailsTO.setAttributeValue35((String) rec.get(125));
//				pdetailsTO.setAttributeUOM35((String) rec.get(126));
			//
//				pdetailsTO.setAttributeName36((String) rec.get(127));
//				pdetailsTO.setAttributeValue36((String) rec.get(128));
//				pdetailsTO.setAttributeUOM36((String) rec.get(129));
			//
//				pdetailsTO.setAttributeName37((String) rec.get(130));
//				pdetailsTO.setAttributeValue37((String) rec.get(131));
//				pdetailsTO.setAttributeUOM37((String) rec.get(132));
			// */
//				
			pLists.add(pdetailsTO);
			prepareEntity(pLists);
		}

	}

	private String prepareEntity(List<ProductAttributesDetailsTO> pLists) {
		// System.out.println("Prepare Enity starts----------");

		/*for (ProductAttributesDetailsTO pto : pLists) {
			ProductAttributesDetails productAttributesDetails = new ProductAttributesDetails();

			productAttributesDetails.setUniqueId(pto.getUniqueId());
			productAttributesDetails.setRecordId(pto.getRecordId());

			if (null == pto.getSellerIDQualifier() || "".equals(pto.getSellerIDQualifier())) {
				productAttributesDetails.setSellerIDQualifier(null);
			} else {
				productAttributesDetails.setSellerIDQualifier(Byte.parseByte(pto.getSellerIDQualifier()));

			}
			if (null == pto.getIDWPrivateId() || "".equals(pto.getIDWPrivateId())) {
				productAttributesDetails.setIDWprivateId(null);
			} else {
				productAttributesDetails.setIDWprivateId(Long.parseLong(pto.getIDWPrivateId()));

			}
			try {
				productAttributesDetails.setDate(parseDate(pto.getDateCreated()));
			} catch (ParseException e) {

				e.printStackTrace();
			}
			productAttributesDetails.setUpdateStatus(pto.getUpdateStatus());
			productAttributesDetails.setIDWitemControllNumber(Long.parseLong(pto.getIDWitemControllNumber()));

			if (null == pto.getUPC() || "".equals(pto.getUPC())) {
				productAttributesDetails.setUPC(null);
			} else {
				productAttributesDetails.setUPC(Long.parseLong(pto.getUPC()));

			}

			if (null == pto.getGTIN() || "".equals(pto.getGTIN())) {
				productAttributesDetails.setGTIN(null);
			} else {
				productAttributesDetails.setGTIN(Long.parseLong(pto.getGTIN()));

			}

			if (null == pto.getEAN() || "".equals(pto.getEAN())) {
				productAttributesDetails.setEAN(null);
			} else {
				productAttributesDetails.setEAN(Long.parseLong(pto.getEAN()));

			}

			if (null == pto.getCatalogNumber() || "".equals(pto.getCatalogNumber())) {
				// System.out.println("Read Null value for catalog
				// Number---------------------");
				productAttributesDetails.setCatalogNumber(null);
			} else {
				// System.out.println("catalog Number==================================" +
				// pto.getCatalogNumber());
				productAttributesDetails.setCatalogNumber(pto.getCatalogNumber());

			}

			if (null == pto.getuNSPSC() || "".equals(pto.getuNSPSC())) {
				productAttributesDetails.setuNSPSC(null);
			} else {
				productAttributesDetails.setuNSPSC(Integer.parseInt(pto.getuNSPSC()));
			}

			if (null == pto.getIGCC() || "".equals(pto.getIGCC())) {
				productAttributesDetails.setIGCC(null);
			} else {
				productAttributesDetails.setIGCC(Short.parseShort(pto.getIGCC()));
			}

			if (null == pto.getIndexID() || "".equals(pto.getIndexID())) {
				productAttributesDetails.setIndexID(null);
			} else {
				productAttributesDetails.setIndexID(Integer.parseInt(pto.getIndexID()));
			}

			productAttributesDetails.setReserved1(pto.getReserved1());
			productAttributesDetails.setReserved2(pto.getReserved2());
			productAttributesDetails.setReserved3(pto.getReserved3());
			productAttributesDetails.setReserved4(pto.getReserved4());
			productAttributesDetails.setReserved5(pto.getReserved5());

			if (null == pto.getItemCtrlNumber() || "".equals(pto.getItemCtrlNumber())) {
				productAttributesDetails.setItemCtrlNumber(null);
			} else {
				productAttributesDetails.setItemCtrlNumber(Long.parseLong(pto.getItemCtrlNumber()));

			}

			if (null == pto.getSellerID() || "".equals(pto.getSellerID())) {
				productAttributesDetails.setSellerID(null);
			} else {
				productAttributesDetails.setSellerID(Long.parseLong(pto.getSellerID()));

			}

			if (null == pto.getEANUCC() || "".equals(pto.getEANUCC())) {
				productAttributesDetails.setEANUCC(null);
			} else {
				productAttributesDetails.setEANUCC(pto.getEANUCC());

			}

			productAttributesDetails.setAttributeName1(pto.getAttributeName1());
			productAttributesDetails.setAttributeValue1(pto.getAttributeValue1());
			productAttributesDetails.setAttributeUOM1(pto.getAttributeUOM1());

			productAttributesDetails.setAttributeName2(pto.getAttributeName2());
			productAttributesDetails.setAttributeValue2(pto.getAttributeValue2());
			productAttributesDetails.setAttributeUOM2(pto.getAttributeUOM2());

			productAttributesDetails.setAttributeName3(pto.getAttributeName3());
			productAttributesDetails.setAttributeValue3(pto.getAttributeValue3());
			productAttributesDetails.setAttributeUOM3(pto.getAttributeUOM3());

			productAttributesDetails.setAttributeName4(pto.getAttributeName4());
			productAttributesDetails.setAttributeValue4(pto.getAttributeValue4());
			productAttributesDetails.setAttributeUOM4(pto.getAttributeUOM4());

			productAttributesDetails.setAttributeName5(pto.getAttributeName5());
			productAttributesDetails.setAttributeValue5(pto.getAttributeValue5());
			productAttributesDetails.setAttributeUOM5(pto.getAttributeUOM5());

			productAttributesDetails.setAttributeName6(pto.getAttributeName6());
			productAttributesDetails.setAttributeValue6(pto.getAttributeValue6());
			productAttributesDetails.setAttributeUOM6(pto.getAttributeUOM6());

			productAttributesDetails.setAttributeName7(pto.getAttributeName7());
			productAttributesDetails.setAttributeValue7(pto.getAttributeValue7());
			productAttributesDetails.setAttributeUOM7(pto.getAttributeUOM7());

			productAttributesDetails.setAttributeName8(pto.getAttributeName8());
			productAttributesDetails.setAttributeValue8(pto.getAttributeValue8());
			productAttributesDetails.setAttributeUOM8(pto.getAttributeUOM8());

			productAttributesDetails.setAttributeName9(pto.getAttributeName9());
			productAttributesDetails.setAttributeValue9(pto.getAttributeValue9());
			productAttributesDetails.setAttributeUOM9(pto.getAttributeUOM9());

			productAttributesDetails.setAttributeName10(pto.getAttributeName10());
			productAttributesDetails.setAttributeValue10(pto.getAttributeValue10());
			productAttributesDetails.setAttributeUOM10(pto.getAttributeUOM10());

			productAttributesDetails.setAttributeName11(pto.getAttributeName11());
			productAttributesDetails.setAttributeValue11(pto.getAttributeValue11());
			productAttributesDetails.setAttributeUOM11(pto.getAttributeUOM11());

			productAttributesDetails.setAttributeName12(pto.getAttributeName12());
			productAttributesDetails.setAttributeValue12(pto.getAttributeValue12());
			productAttributesDetails.setAttributeUOM12(pto.getAttributeUOM12());

			productAttributesDetails.setAttributeName13(pto.getAttributeName13());
			productAttributesDetails.setAttributeValue13(pto.getAttributeValue13());
			productAttributesDetails.setAttributeUOM13(pto.getAttributeUOM13());

			productAttributesDetails.setAttributeName14(pto.getAttributeName14());
			productAttributesDetails.setAttributeValue14(pto.getAttributeValue14());
			productAttributesDetails.setAttributeUOM14(pto.getAttributeUOM14());

			productAttributesDetails.setAttributeName15(pto.getAttributeName15());
			productAttributesDetails.setAttributeValue15(pto.getAttributeValue15());
			productAttributesDetails.setAttributeUOM15(pto.getAttributeUOM15());

			productAttributesDetails.setAttributeName16(pto.getAttributeName16());
			productAttributesDetails.setAttributeValue16(pto.getAttributeValue16());
			productAttributesDetails.setAttributeUOM16(pto.getAttributeUOM16());

			productAttributesDetails.setAttributeName17(pto.getAttributeName17());
			productAttributesDetails.setAttributeValue17(pto.getAttributeValue17());
			productAttributesDetails.setAttributeUOM17(pto.getAttributeUOM17());

			productAttributesDetails.setAttributeName18(pto.getAttributeName18());
			productAttributesDetails.setAttributeValue18(pto.getAttributeValue18());
			productAttributesDetails.setAttributeUOM18(pto.getAttributeUOM18());

			productAttributesDetails.setAttributeName19(pto.getAttributeName19());
			productAttributesDetails.setAttributeValue19(pto.getAttributeValue19());
			productAttributesDetails.setAttributeUOM19(pto.getAttributeUOM19());

			productAttributesDetails.setAttributeName20(pto.getAttributeName20());
			productAttributesDetails.setAttributeValue20(pto.getAttributeValue20());
			productAttributesDetails.setAttributeUOM20(pto.getAttributeUOM20());

			productAttributesDetails.setAttributeName21(pto.getAttributeName21());
			productAttributesDetails.setAttributeValue21(pto.getAttributeValue21());
			productAttributesDetails.setAttributeUOM22(pto.getAttributeUOM21());

			productAttributesDetails.setAttributeName22(pto.getAttributeName22());
			productAttributesDetails.setAttributeValue22(pto.getAttributeValue22());
			productAttributesDetails.setAttributeUOM22(pto.getAttributeUOM22());

			productAttributesDetails.setAttributeName23(pto.getAttributeName23());
			productAttributesDetails.setAttributeValue23(pto.getAttributeValue23());
			productAttributesDetails.setAttributeUOM23(pto.getAttributeUOM23());

			productAttributesDetails.setAttributeName24(pto.getAttributeName24());
			productAttributesDetails.setAttributeValue24(pto.getAttributeValue24());
			productAttributesDetails.setAttributeUOM24(pto.getAttributeUOM24());

			productAttributesDetails.setAttributeName25(pto.getAttributeName25());
			productAttributesDetails.setAttributeValue25(pto.getAttributeValue25());
			productAttributesDetails.setAttributeUOM25(pto.getAttributeUOM25());

			productAttributesDetails.setAttributeName26(pto.getAttributeName26());
			productAttributesDetails.setAttributeValue26(pto.getAttributeValue26());
			productAttributesDetails.setAttributeUOM26(pto.getAttributeUOM26());

			productAttributesDetails.setAttributeName27(pto.getAttributeName27());
			productAttributesDetails.setAttributeValue27(pto.getAttributeValue27());
			productAttributesDetails.setAttributeUOM27(pto.getAttributeUOM27());
			productAttributesDetails.setPipe(pto.getPipe());
			productAttributesDetails.setItemStatus(pto.getItemStatus());

			productAttributesDetails.setLocale("es-CA");
			productAttributesDetails.setApplication_id("CA");*/

			//productAttributesRepository.save(productAttributesDetails);
			// System.out.println("Insert rows--------------------------");
			productAttributesRepository.save(pLists);
			return "success";
		}
	

}
