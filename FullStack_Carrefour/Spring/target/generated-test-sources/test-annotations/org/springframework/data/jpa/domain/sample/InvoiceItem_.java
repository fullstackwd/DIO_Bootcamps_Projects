package org.springframework.data.jpa.domain.sample;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InvoiceItem.class)
public abstract class InvoiceItem_ {

	public static volatile SingularAttribute<InvoiceItem, Long> id;
	public static volatile SingularAttribute<InvoiceItem, Invoice> invoice;

	public static final String ID = "id";
	public static final String INVOICE = "invoice";

}

