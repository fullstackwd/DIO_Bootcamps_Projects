package org.springframework.data.jpa.repository.cdi;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Person.class)
public abstract class Person_ {

	public static volatile SingularAttribute<Person, String> name;
	public static volatile SingularAttribute<Person, Long> id;

	public static final String NAME = "name";
	public static final String ID = "id";

}

