package org.springframework.data.jpa.domain.sample;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractAnnotatedAuditable.class)
public abstract class AbstractAnnotatedAuditable_ {

	public static volatile SingularAttribute<AbstractAnnotatedAuditable, Date> lastModifiedAt;
	public static volatile SingularAttribute<AbstractAnnotatedAuditable, AuditableUser> createdBy;
	public static volatile SingularAttribute<AbstractAnnotatedAuditable, AuditableUser> lastModifiedBy;
	public static volatile SingularAttribute<AbstractAnnotatedAuditable, Long> id;
	public static volatile SingularAttribute<AbstractAnnotatedAuditable, Date> createAt;

	public static final String LAST_MODIFIED_AT = "lastModifiedAt";
	public static final String CREATED_BY = "createdBy";
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";
	public static final String ID = "id";
	public static final String CREATE_AT = "createAt";

}

