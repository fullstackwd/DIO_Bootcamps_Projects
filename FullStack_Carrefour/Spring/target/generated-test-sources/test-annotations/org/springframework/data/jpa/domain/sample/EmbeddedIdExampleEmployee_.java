package org.springframework.data.jpa.domain.sample;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EmbeddedIdExampleEmployee.class)
public abstract class EmbeddedIdExampleEmployee_ {

	public static volatile SingularAttribute<EmbeddedIdExampleEmployee, String> name;
	public static volatile SingularAttribute<EmbeddedIdExampleEmployee, EmbeddedIdExampleEmployeePK> employeePk;
	public static volatile SingularAttribute<EmbeddedIdExampleEmployee, EmbeddedIdExampleDepartment> department;

	public static final String NAME = "name";
	public static final String EMPLOYEE_PK = "employeePk";
	public static final String DEPARTMENT = "department";

}

