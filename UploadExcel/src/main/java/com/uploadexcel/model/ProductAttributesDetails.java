package com.uploadexcel.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;


import org.hibernate.annotations.GeneratorType;

@Entity
//@Table(name = "ideaattributes", schema = "COMPAS_MASTER")
@Table(name = "ideaattributes")
public class ProductAttributesDetails implements Serializable
{

	String UniqueId;
	String RecordId;
	Byte SellerIDQualifier;
	Long IDWprivateId;
	Date date;
	String UpdateStatus;
	Long IDWitemControllNumber;
	Long UPC;
	Long GTIN;
	Long EAN;

	@Id
	@Column(name = "CatalogNumber")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	String catalogNumber;// PK
	Integer uNSPSC;
	Short IGCC;
	Integer IndexID;
	String reserved1;
	String reserved2;
	String reserved3;
	String reserved4;
	String reserved5;

	Long ItemCtrlNumber;
	Long SellerID;

	String EANUCC;

	String attributeName1;
	String attributeValue1;
	String attributeUOM1;
	String attributeName2;
	String attributeValue2;
	String attributeUOM2;
	String attributeName3;
	String attributeValue3;
	String attributeUOM3;
	String attributeName4;
	String attributeValue4;
	String attributeUOM4;
	String attributeName5;
	String attributeValue5;
	String attributeUOM5;
	String attributeName6;
	String attributeValue6;
	String attributeUOM6;
	String attributeName7;
	String attributeValue7;
	String attributeUOM7;
	String attributeName8;
	String attributeValue8;
	String attributeUOM8;
	String attributeName9;
	String attributeValue9;
	String attributeUOM9;
	String attributeName10;
	String attributeValue10;
	String attributeUOM10;
	String attributeName11;
	String attributeValue11;
	String attributeUOM11;
	String attributeName12;
	String attributeValue12;
	String attributeUOM12;
	String attributeName13;
	String attributeValue13;
	String attributeUOM13;
	String attributeName14;
	String attributeValue14;
	String attributeUOM14;
	String attributeName15;
	String attributeValue15;
	String attributeUOM15;
	String attributeName16;
	String attributeValue16;
	String attributeUOM16;
	String attributeName17;
	String attributeValue17;
	String attributeUOM17;
	String attributeName18;
	String attributeValue18;
	String attributeUOM18;
	String attributeName19;
	String attributeValue19;
	String attributeUOM19;
	String attributeName20;
	String attributeValue20;
	String attributeUOM20;
	String attributeName21;
	String attributeValue21;
	String attributeUOM21;
	String attributeName22;
	String attributeValue22;
	String attributeUOM22;
	String attributeName23;
	String attributeValue23;
	String attributeUOM23;
	String attributeName24;
	String attributeValue24;
	String attributeUOM24;
	String attributeName25;
	String attributeValue25;
	String attributeUOM25;
	String attributeName26;
	String attributeValue26;
	String attributeUOM26;
	String attributeName27;
	String attributeValue27;
	String attributeUOM27;

	String pipe;
	String itemStatus;

	public String getPipe() {
		return pipe;
	}

	public void setPipe(String pipe) {
		this.pipe = pipe;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	String attributeName28;
	String attributeValue28;
	String attributeUOM28;
	String attributeName29;
	String attributeValue29;
	String attributeUOM29;
	String attributeName30;
	String attributeValue30;
	String attributeUOM30;
	String attributeName31;
	String attributeValue31;
	String attributeUOM31;
	String attributeName32;
	String attributeValue32;
	String attributeUOM32;

	public String getAttributeName28() {
		return attributeName28;
	}

	public void setAttributeName28(String attributeName28) {
		this.attributeName28 = attributeName28;
	}

	public String getAttributeValue28() {
		return attributeValue28;
	}

	public void setAttributeValue28(String attributeValue28) {
		this.attributeValue28 = attributeValue28;
	}

	public String getAttributeUOM28() {
		return attributeUOM28;
	}

	public void setAttributeUOM28(String attributeUOM28) {
		this.attributeUOM28 = attributeUOM28;
	}

	public String getAttributeName29() {
		return attributeName29;
	}

	public void setAttributeName29(String attributeName29) {
		this.attributeName29 = attributeName29;
	}

	public String getAttributeValue29() {
		return attributeValue29;
	}

	public void setAttributeValue29(String attributeValue29) {
		this.attributeValue29 = attributeValue29;
	}

	public String getAttributeUOM29() {
		return attributeUOM29;
	}

	public void setAttributeUOM29(String attributeUOM29) {
		this.attributeUOM29 = attributeUOM29;
	}

	public String getAttributeName30() {
		return attributeName30;
	}

	public void setAttributeName30(String attributeName30) {
		this.attributeName30 = attributeName30;
	}

	public String getAttributeValue30() {
		return attributeValue30;
	}

	public void setAttributeValue30(String attributeValue30) {
		this.attributeValue30 = attributeValue30;
	}

	public String getAttributeUOM30() {
		return attributeUOM30;
	}

	public void setAttributeUOM30(String attributeUOM30) {
		this.attributeUOM30 = attributeUOM30;
	}

	public String getAttributeName31() {
		return attributeName31;
	}

	public void setAttributeName31(String attributeName31) {
		this.attributeName31 = attributeName31;
	}

	public String getAttributeValue31() {
		return attributeValue31;
	}

	public void setAttributeValue31(String attributeValue31) {
		this.attributeValue31 = attributeValue31;
	}

	public String getAttributeUOM31() {
		return attributeUOM31;
	}

	public void setAttributeUOM31(String attributeUOM31) {
		this.attributeUOM31 = attributeUOM31;
	}

	public String getAttributeName32() {
		return attributeName32;
	}

	public void setAttributeName32(String attributeName32) {
		this.attributeName32 = attributeName32;
	}

	public String getAttributeValue32() {
		return attributeValue32;
	}

	public void setAttributeValue32(String attributeValue32) {
		this.attributeValue32 = attributeValue32;
	}

	public String getAttributeUOM32() {
		return attributeUOM32;
	}

	public void setAttributeUOM32(String attributeUOM32) {
		this.attributeUOM32 = attributeUOM32;
	}

	public String getAttributeName33() {
		return attributeName33;
	}

	public void setAttributeName33(String attributeName33) {
		this.attributeName33 = attributeName33;
	}

	public String getAttributeValue33() {
		return attributeValue33;
	}

	public void setAttributeValue33(String attributeValue33) {
		this.attributeValue33 = attributeValue33;
	}

	public String getAttributeUOM33() {
		return attributeUOM33;
	}

	public void setAttributeUOM33(String attributeUOM33) {
		this.attributeUOM33 = attributeUOM33;
	}

	public String getAttributeName34() {
		return attributeName34;
	}

	public void setAttributeName34(String attributeName34) {
		this.attributeName34 = attributeName34;
	}

	public String getAttributeValue34() {
		return attributeValue34;
	}

	public void setAttributeValue34(String attributeValue34) {
		this.attributeValue34 = attributeValue34;
	}

	public String getAttributeUOM34() {
		return attributeUOM34;
	}

	public void setAttributeUOM34(String attributeUOM34) {
		this.attributeUOM34 = attributeUOM34;
	}

	public String getAttributeName35() {
		return attributeName35;
	}

	public void setAttributeName35(String attributeName35) {
		this.attributeName35 = attributeName35;
	}

	public String getAttributeValue35() {
		return attributeValue35;
	}

	public void setAttributeValue35(String attributeValue35) {
		this.attributeValue35 = attributeValue35;
	}

	public String getAttributeUOM35() {
		return attributeUOM35;
	}

	public void setAttributeUOM35(String attributeUOM35) {
		this.attributeUOM35 = attributeUOM35;
	}

	public String getAttributeName36() {
		return attributeName36;
	}

	public void setAttributeName36(String attributeName36) {
		this.attributeName36 = attributeName36;
	}

	public String getAttributeValue36() {
		return attributeValue36;
	}

	public void setAttributeValue36(String attributeValue36) {
		this.attributeValue36 = attributeValue36;
	}

	public String getAttributeUOM36() {
		return attributeUOM36;
	}

	public void setAttributeUOM36(String attributeUOM36) {
		this.attributeUOM36 = attributeUOM36;
	}

	public String getAttributeName37() {
		return attributeName37;
	}

	public void setAttributeName37(String attributeName37) {
		this.attributeName37 = attributeName37;
	}

	public String getAttributeValue37() {
		return attributeValue37;
	}

	public void setAttributeValue37(String attributeValue37) {
		this.attributeValue37 = attributeValue37;
	}

	public String getAttributeUOM37() {
		return attributeUOM37;
	}

	public void setAttributeUOM37(String attributeUOM37) {
		this.attributeUOM37 = attributeUOM37;
	}

	String attributeName33;
	String attributeValue33;
	String attributeUOM33;
	String attributeName34;
	String attributeValue34;
	String attributeUOM34;
	String attributeName35;
	String attributeValue35;
	String attributeUOM35;
	String attributeName36;
	String attributeValue36;
	String attributeUOM36;
	String attributeName37;
	String attributeValue37;
	String attributeUOM37;

	String locale;
	String application_id;

	public Long getIDWitemControllNumber() {
		return IDWitemControllNumber;
	}

	public void setIDWitemControllNumber(Long iDWitemControllNumber) {
		IDWitemControllNumber = iDWitemControllNumber;
	}

	public String getUniqueId() {
		return UniqueId;
	}

	public void setUniqueId(String uniqueId) {
		UniqueId = uniqueId;
	}

	public String getRecordId() {
		return RecordId;
	}

	public void setRecordId(String recordId) {
		RecordId = recordId;
	}

	public Byte getSellerIDQualifier() {
		return SellerIDQualifier;
	}

	public void setSellerIDQualifier(Byte sellerIDQualifier) {
		SellerIDQualifier = sellerIDQualifier;
	}

	public Long getSellerID() {
		return SellerID;
	}

	public void setSellerID(Long sellerID) {
		SellerID = sellerID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUpdateStatus() {
		return UpdateStatus;
	}

	public void setUpdateStatus(String updateStatus) {
		UpdateStatus = updateStatus;
	}

	public Long getItemCtrlNumber() {
		return ItemCtrlNumber;
	}

	public void setItemCtrlNumber(Long itemCtrlNumber) {
		ItemCtrlNumber = itemCtrlNumber;
	}

	public Long getUPC() {
		return UPC;
	}

	public void setUPC(Long uPC) {
		UPC = uPC;
	}

	public Long getGTIN() {
		return GTIN;
	}

	public void setGTIN(Long gTIN) {
		GTIN = gTIN;
	}

	public String getEANUCC() {
		return EANUCC;
	}

	public void setEANUCC(String eANUCC) {
		EANUCC = eANUCC;
	}



	
	public String getCatalogNumber() {
		return catalogNumber;
	}

	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}

	public Integer getuNSPSC() {
		return uNSPSC;
	}

	public void setuNSPSC(Integer uNSPSC) {
		this.uNSPSC = uNSPSC;
	}

	public Short getIGCC() {
		return IGCC;
	}

	public void setIGCC(Short iGCC) {
		IGCC = iGCC;
	}

	public Integer getIndexID() {
		return IndexID;
	}

	public Long getIDWprivateId() {
		return IDWprivateId;
	}

	public void setIDWprivateId(Long iDWprivateId) {
		IDWprivateId = iDWprivateId;
	}

	public Long getEAN() {
		return EAN;
	}

	public void setEAN(Long eAN) {
		EAN = eAN;
	}

	public void setIndexID(Integer indexID) {
		IndexID = indexID;
	}

	public String getReserved1() {
		return reserved1;
	}

	public void setReserved1(String reserved1) {
		this.reserved1 = reserved1;
	}

	public String getReserved2() {
		return reserved2;
	}

	public void setReserved2(String reserved2) {
		this.reserved2 = reserved2;
	}

	public String getReserved3() {
		return reserved3;
	}

	public void setReserved3(String reserved3) {
		this.reserved3 = reserved3;
	}

	public String getReserved4() {
		return reserved4;
	}

	public void setReserved4(String reserved4) {
		this.reserved4 = reserved4;
	}

	public String getReserved5() {
		return reserved5;
	}

	public void setReserved5(String reserved5) {
		this.reserved5 = reserved5;
	}

	public String getAttributeName1() {
		return attributeName1;
	}

	public void setAttributeName1(String attributeName1) {
		this.attributeName1 = attributeName1;
	}

	public String getAttributeValue1() {
		return attributeValue1;
	}

	public void setAttributeValue1(String attributeValue1) {
		this.attributeValue1 = attributeValue1;
	}

	public String getAttributeUOM1() {
		return attributeUOM1;
	}

	public void setAttributeUOM1(String attributeUOM1) {
		this.attributeUOM1 = attributeUOM1;
	}

	public String getAttributeName2() {
		return attributeName2;
	}

	public void setAttributeName2(String attributeName2) {
		this.attributeName2 = attributeName2;
	}

	public String getAttributeValue2() {
		return attributeValue2;
	}

	public void setAttributeValue2(String attributeValue2) {
		this.attributeValue2 = attributeValue2;
	}

	public String getAttributeUOM2() {
		return attributeUOM2;
	}

	public void setAttributeUOM2(String attributeUOM2) {
		this.attributeUOM2 = attributeUOM2;
	}

	public String getAttributeName3() {
		return attributeName3;
	}

	public void setAttributeName3(String attributeName3) {
		this.attributeName3 = attributeName3;
	}

	public String getAttributeValue3() {
		return attributeValue3;
	}

	public void setAttributeValue3(String attributeValue3) {
		this.attributeValue3 = attributeValue3;
	}

	public String getAttributeUOM3() {
		return attributeUOM3;
	}

	public void setAttributeUOM3(String attributeUOM3) {
		this.attributeUOM3 = attributeUOM3;
	}

	public String getAttributeName4() {
		return attributeName4;
	}

	public void setAttributeName4(String attributeName4) {
		this.attributeName4 = attributeName4;
	}

	public String getAttributeValue4() {
		return attributeValue4;
	}

	public void setAttributeValue4(String attributeValue4) {
		this.attributeValue4 = attributeValue4;
	}

	public String getAttributeUOM4() {
		return attributeUOM4;
	}

	public void setAttributeUOM4(String attributeUOM4) {
		this.attributeUOM4 = attributeUOM4;
	}

	public String getAttributeName5() {
		return attributeName5;
	}

	public void setAttributeName5(String attributeName5) {
		this.attributeName5 = attributeName5;
	}

	public String getAttributeValue5() {
		return attributeValue5;
	}

	public void setAttributeValue5(String attributeValue5) {
		this.attributeValue5 = attributeValue5;
	}

	public String getAttributeUOM5() {
		return attributeUOM5;
	}

	public void setAttributeUOM5(String attributeUOM5) {
		this.attributeUOM5 = attributeUOM5;
	}

	public String getAttributeName6() {
		return attributeName6;
	}

	public void setAttributeName6(String attributeName6) {
		this.attributeName6 = attributeName6;
	}

	public String getAttributeValue6() {
		return attributeValue6;
	}

	public void setAttributeValue6(String attributeValue6) {
		this.attributeValue6 = attributeValue6;
	}

	public String getAttributeUOM6() {
		return attributeUOM6;
	}

	public void setAttributeUOM6(String attributeUOM6) {
		this.attributeUOM6 = attributeUOM6;
	}

	public String getAttributeName7() {
		return attributeName7;
	}

	public void setAttributeName7(String attributeName7) {
		this.attributeName7 = attributeName7;
	}

	public String getAttributeValue7() {
		return attributeValue7;
	}

	public void setAttributeValue7(String attributeValue7) {
		this.attributeValue7 = attributeValue7;
	}

	public String getAttributeUOM7() {
		return attributeUOM7;
	}

	public void setAttributeUOM7(String attributeUOM7) {
		this.attributeUOM7 = attributeUOM7;
	}

	public String getAttributeName8() {
		return attributeName8;
	}

	public void setAttributeName8(String attributeName8) {
		this.attributeName8 = attributeName8;
	}

	public String getAttributeValue8() {
		return attributeValue8;
	}

	public void setAttributeValue8(String attributeValue8) {
		this.attributeValue8 = attributeValue8;
	}

	public String getAttributeUOM8() {
		return attributeUOM8;
	}

	public void setAttributeUOM8(String attributeUOM8) {
		this.attributeUOM8 = attributeUOM8;
	}

	public String getAttributeName9() {
		return attributeName9;
	}

	public void setAttributeName9(String attributeName9) {
		this.attributeName9 = attributeName9;
	}

	public String getAttributeValue9() {
		return attributeValue9;
	}

	public void setAttributeValue9(String attributeValue9) {
		this.attributeValue9 = attributeValue9;
	}

	public String getAttributeUOM9() {
		return attributeUOM9;
	}

	public void setAttributeUOM9(String attributeUOM9) {
		this.attributeUOM9 = attributeUOM9;
	}

	public String getAttributeName10() {
		return attributeName10;
	}

	public void setAttributeName10(String attributeName10) {
		this.attributeName10 = attributeName10;
	}

	public String getAttributeValue10() {
		return attributeValue10;
	}

	public void setAttributeValue10(String attributeValue10) {
		this.attributeValue10 = attributeValue10;
	}

	public String getAttributeUOM10() {
		return attributeUOM10;
	}

	public void setAttributeUOM10(String attributeUOM10) {
		this.attributeUOM10 = attributeUOM10;
	}

	public String getAttributeName11() {
		return attributeName11;
	}

	public void setAttributeName11(String attributeName11) {
		this.attributeName11 = attributeName11;
	}

	public String getAttributeValue11() {
		return attributeValue11;
	}

	public void setAttributeValue11(String attributeValue11) {
		this.attributeValue11 = attributeValue11;
	}

	public String getAttributeUOM11() {
		return attributeUOM11;
	}

	public void setAttributeUOM11(String attributeUOM11) {
		this.attributeUOM11 = attributeUOM11;
	}

	public String getAttributeName12() {
		return attributeName12;
	}

	public void setAttributeName12(String attributeName12) {
		this.attributeName12 = attributeName12;
	}

	public String getAttributeValue12() {
		return attributeValue12;
	}

	public void setAttributeValue12(String attributeValue12) {
		this.attributeValue12 = attributeValue12;
	}

	public String getAttributeUOM12() {
		return attributeUOM12;
	}

	public void setAttributeUOM12(String attributeUOM12) {
		this.attributeUOM12 = attributeUOM12;
	}

	public String getAttributeName13() {
		return attributeName13;
	}

	public void setAttributeName13(String attributeName13) {
		this.attributeName13 = attributeName13;
	}

	public String getAttributeValue13() {
		return attributeValue13;
	}

	public void setAttributeValue13(String attributeValue13) {
		this.attributeValue13 = attributeValue13;
	}

	public String getAttributeUOM13() {
		return attributeUOM13;
	}

	public void setAttributeUOM13(String attributeUOM13) {
		this.attributeUOM13 = attributeUOM13;
	}

	public String getAttributeName14() {
		return attributeName14;
	}

	public void setAttributeName14(String attributeName14) {
		this.attributeName14 = attributeName14;
	}

	public String getAttributeValue14() {
		return attributeValue14;
	}

	public void setAttributeValue14(String attributeValue14) {
		this.attributeValue14 = attributeValue14;
	}

	public String getAttributeUOM14() {
		return attributeUOM14;
	}

	public void setAttributeUOM14(String attributeUOM14) {
		this.attributeUOM14 = attributeUOM14;
	}

	public String getAttributeName15() {
		return attributeName15;
	}

	public void setAttributeName15(String attributeName15) {
		this.attributeName15 = attributeName15;
	}

	public String getAttributeValue15() {
		return attributeValue15;
	}

	public void setAttributeValue15(String attributeValue15) {
		this.attributeValue15 = attributeValue15;
	}

	public String getAttributeUOM15() {
		return attributeUOM15;
	}

	public void setAttributeUOM15(String attributeUOM15) {
		this.attributeUOM15 = attributeUOM15;
	}

	public String getAttributeName16() {
		return attributeName16;
	}

	public void setAttributeName16(String attributeName16) {
		this.attributeName16 = attributeName16;
	}

	public String getAttributeValue16() {
		return attributeValue16;
	}

	public void setAttributeValue16(String attributeValue16) {
		this.attributeValue16 = attributeValue16;
	}

	public String getAttributeUOM16() {
		return attributeUOM16;
	}

	public void setAttributeUOM16(String attributeUOM16) {
		this.attributeUOM16 = attributeUOM16;
	}

	public String getAttributeName17() {
		return attributeName17;
	}

	public void setAttributeName17(String attributeName17) {
		this.attributeName17 = attributeName17;
	}

	public String getAttributeValue17() {
		return attributeValue17;
	}

	public void setAttributeValue17(String attributeValue17) {
		this.attributeValue17 = attributeValue17;
	}

	public String getAttributeUOM17() {
		return attributeUOM17;
	}

	public void setAttributeUOM17(String attributeUOM17) {
		this.attributeUOM17 = attributeUOM17;
	}

	public String getAttributeName18() {
		return attributeName18;
	}

	public void setAttributeName18(String attributeName18) {
		this.attributeName18 = attributeName18;
	}

	public String getAttributeValue18() {
		return attributeValue18;
	}

	public void setAttributeValue18(String attributeValue18) {
		this.attributeValue18 = attributeValue18;
	}

	public String getAttributeUOM18() {
		return attributeUOM18;
	}

	public void setAttributeUOM18(String attributeUOM18) {
		this.attributeUOM18 = attributeUOM18;
	}

	public String getAttributeName19() {
		return attributeName19;
	}

	public void setAttributeName19(String attributeName19) {
		this.attributeName19 = attributeName19;
	}

	public String getAttributeValue19() {
		return attributeValue19;
	}

	public void setAttributeValue19(String attributeValue19) {
		this.attributeValue19 = attributeValue19;
	}

	public String getAttributeUOM19() {
		return attributeUOM19;
	}

	public void setAttributeUOM19(String attributeUOM19) {
		this.attributeUOM19 = attributeUOM19;
	}

	public String getAttributeName20() {
		return attributeName20;
	}

	public void setAttributeName20(String attributeName20) {
		this.attributeName20 = attributeName20;
	}

	public String getAttributeValue20() {
		return attributeValue20;
	}

	public void setAttributeValue20(String attributeValue20) {
		this.attributeValue20 = attributeValue20;
	}

	public String getAttributeUOM20() {
		return attributeUOM20;
	}

	public void setAttributeUOM20(String attributeUOM20) {
		this.attributeUOM20 = attributeUOM20;
	}

	public String getAttributeName21() {
		return attributeName21;
	}

	public void setAttributeName21(String attributeName21) {
		this.attributeName21 = attributeName21;
	}

	public String getAttributeValue21() {
		return attributeValue21;
	}

	public void setAttributeValue21(String attributeValue21) {
		this.attributeValue21 = attributeValue21;
	}

	public String getAttributeUOM21() {
		return attributeUOM21;
	}

	public void setAttributeUOM21(String attributeUOM21) {
		this.attributeUOM21 = attributeUOM21;
	}

	public String getAttributeName22() {
		return attributeName22;
	}

	public void setAttributeName22(String attributeName22) {
		this.attributeName22 = attributeName22;
	}

	public String getAttributeValue22() {
		return attributeValue22;
	}

	public void setAttributeValue22(String attributeValue22) {
		this.attributeValue22 = attributeValue22;
	}

	public String getAttributeUOM22() {
		return attributeUOM22;
	}

	public void setAttributeUOM22(String attributeUOM22) {
		this.attributeUOM22 = attributeUOM22;
	}

	public String getAttributeName23() {
		return attributeName23;
	}

	public void setAttributeName23(String attributeName23) {
		this.attributeName23 = attributeName23;
	}

	public String getAttributeValue23() {
		return attributeValue23;
	}

	public void setAttributeValue23(String attributeValue23) {
		this.attributeValue23 = attributeValue23;
	}

	public String getAttributeUOM23() {
		return attributeUOM23;
	}

	public void setAttributeUOM23(String attributeUOM23) {
		this.attributeUOM23 = attributeUOM23;
	}

	public String getAttributeName24() {
		return attributeName24;
	}

	public void setAttributeName24(String attributeName24) {
		this.attributeName24 = attributeName24;
	}

	public String getAttributeValue24() {
		return attributeValue24;
	}

	public void setAttributeValue24(String attributeValue24) {
		this.attributeValue24 = attributeValue24;
	}

	public String getAttributeUOM24() {
		return attributeUOM24;
	}

	public void setAttributeUOM24(String attributeUOM24) {
		this.attributeUOM24 = attributeUOM24;
	}

	public String getAttributeName25() {
		return attributeName25;
	}

	public void setAttributeName25(String attributeName25) {
		this.attributeName25 = attributeName25;
	}

	public String getAttributeValue25() {
		return attributeValue25;
	}

	public void setAttributeValue25(String attributeValue25) {
		this.attributeValue25 = attributeValue25;
	}

	public String getAttributeUOM25() {
		return attributeUOM25;
	}

	public void setAttributeUOM25(String attributeUOM25) {
		this.attributeUOM25 = attributeUOM25;
	}

	public String getAttributeName26() {
		return attributeName26;
	}

	public void setAttributeName26(String attributeName26) {
		this.attributeName26 = attributeName26;
	}

	public String getAttributeValue26() {
		return attributeValue26;
	}

	public void setAttributeValue26(String attributeValue26) {
		this.attributeValue26 = attributeValue26;
	}

	public String getAttributeUOM26() {
		return attributeUOM26;
	}

	public void setAttributeUOM26(String attributeUOM26) {
		this.attributeUOM26 = attributeUOM26;
	}

	public String getAttributeName27() {
		return attributeName27;
	}

	public void setAttributeName27(String attributeName27) {
		this.attributeName27 = attributeName27;
	}

	public String getAttributeValue27() {
		return attributeValue27;
	}

	public void setAttributeValue27(String attributeValue27) {
		this.attributeValue27 = attributeValue27;
	}

	public String getAttributeUOM27() {
		return attributeUOM27;
	}

	public void setAttributeUOM27(String attributeUOM27) {
		this.attributeUOM27 = attributeUOM27;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getApplication_id() {
		return application_id;
	}

	public void setApplication_id(String application_id) {
		this.application_id = application_id;
	}

}
