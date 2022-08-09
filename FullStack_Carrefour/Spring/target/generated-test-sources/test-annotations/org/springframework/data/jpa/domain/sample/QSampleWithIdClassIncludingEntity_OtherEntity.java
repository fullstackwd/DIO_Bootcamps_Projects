package org.springframework.data.jpa.domain.sample;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSampleWithIdClassIncludingEntity_OtherEntity is a Querydsl query type for OtherEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSampleWithIdClassIncludingEntity_OtherEntity extends EntityPathBase<SampleWithIdClassIncludingEntity.OtherEntity> {

    private static final long serialVersionUID = -56884342L;

    public static final QSampleWithIdClassIncludingEntity_OtherEntity otherEntity = new QSampleWithIdClassIncludingEntity_OtherEntity("otherEntity");

    public final NumberPath<Long> otherId = createNumber("otherId", Long.class);

    public QSampleWithIdClassIncludingEntity_OtherEntity(String variable) {
        super(SampleWithIdClassIncludingEntity.OtherEntity.class, forVariable(variable));
    }

    public QSampleWithIdClassIncludingEntity_OtherEntity(Path<? extends SampleWithIdClassIncludingEntity.OtherEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSampleWithIdClassIncludingEntity_OtherEntity(PathMetadata metadata) {
        super(SampleWithIdClassIncludingEntity.OtherEntity.class, metadata);
    }

}

