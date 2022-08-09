package org.springframework.data.jpa.domain.sample;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.springframework.data.jpa.domain.sample.SampleWithIdClassIncludingEntity.OtherEntity;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SampleWithIdClassIncludingEntity.class)
public abstract class SampleWithIdClassIncludingEntity_ {

	public static volatile SingularAttribute<SampleWithIdClassIncludingEntity, Long> first;
	public static volatile SingularAttribute<SampleWithIdClassIncludingEntity, OtherEntity> second;

	public static final String FIRST = "first";
	public static final String SECOND = "second";

}

