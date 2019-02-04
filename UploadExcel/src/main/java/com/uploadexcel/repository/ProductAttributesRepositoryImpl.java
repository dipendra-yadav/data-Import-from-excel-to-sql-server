package com.uploadexcel.repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uploadexcel.model.ProductAttributesDetails;
import com.uploadexcel.model.ProductAttributesDetailsTO;

@Repository
public class ProductAttributesRepositoryImpl implements ProductAttributesRepository {
	
	public java.util.Date parseDate(String date) throws ParseException {
		// SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD HH:MI:SS");
		SimpleDateFormat format = new SimpleDateFormat("YYYYMMDD");
		java.util.Date date1 = format.parse(date);
		// System.out.println("date:" + date1);
		// java.util.Date date1 = format.parse(parsedate);
		return date1;
	}

	@Autowired
	SessionFactory sessionFactory;

	
	Session session=null;

	Transaction tx = null;

	@Override
	public void save(List<ProductAttributesDetailsTO> pLists) {

		System.out.println(".......Hibernate Batch Processing starts.......\n");
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();

			int batchSize = 30, totalRecords = 100;

			// - - - - - - - - - - - - - - Hibernate/JPA Batch Insert Example - - - - - - -
			// - - - - - //
			for (int i = 0; i < totalRecords; i++) {
				for (ProductAttributesDetailsTO pto : pLists) {
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
					productAttributesDetails.setApplication_id("CA");

					session.save(productAttributesDetails); // inserts the Records

					if (i % batchSize == 0 && i > 0) {
						// Flush A Batch Of Inserts & Release Memory
						session.flush();
						session.clear();
					}

				}
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			tx.rollback();

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
}
