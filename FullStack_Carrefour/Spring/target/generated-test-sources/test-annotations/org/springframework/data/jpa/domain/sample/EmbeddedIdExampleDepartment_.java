package org.springframework.data.jpa.domain.sample;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EmbeddedIdExampleDepartment.class)
public abstract class EmbeddedIdExampleDepartment_ {

	public static volatile SingularAttribute<EmbeddedIdExampleDepartment, Long> departmentId;
	public static volatile SingularAttribute<EmbeddedIdExampleDepartment, String> name;

	public static final String DEPARTMENT_ID = "departmentId";
	public static final String NAME = "name";

}

