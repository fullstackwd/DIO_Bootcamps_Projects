package org.springframework.data.jpa.domain.sample;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Address.class)
public abstract class Address_ {

	public static volatile SingularAttribute<Address, String> country;
	public static volatile SingularAttribute<Address, String> streetName;
	public static volatile SingularAttribute<Address, String> city;
	public static volatile SingularAttribute<Address, String> streetNo;

	public static final String COUNTRY = "country";
	public static final String STREET_NAME = "streetName";
	public static final String CITY = "city";
	public static final String STREET_NO = "streetNo";

}

