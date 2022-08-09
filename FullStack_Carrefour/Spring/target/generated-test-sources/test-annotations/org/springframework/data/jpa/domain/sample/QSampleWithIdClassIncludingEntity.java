package org.springframework.data.jpa.domain.sample;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSampleWithIdClassIncludingEntity is a Querydsl query type for SampleWithIdClassIncludingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSampleWithIdClassIncludingEntity extends EntityPathBase<SampleWithIdClassIncludingEntity> {

    private static final long serialVersionUID = 468926725L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSampleWithIdClassIncludingEntity sampleWithIdClassIncludingEntity = new QSampleWithIdClassIncludingEntity("sampleWithIdClassIncludingEntity");

    public final NumberPath<Long> first = createNumber("first", Long.class);

    public final QSampleWithIdClassIncludingEntity_OtherEntity second;

    public QSampleWithIdClassIncludingEntity(String variable) {
        this(SampleWithIdClassIncludingEntity.class, forVariable(variable), INITS);
    }

    public QSampleWithIdClassIncludingEntity(Path<? extends SampleWithIdClassIncludingEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSampleWithIdClassIncludingEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSampleWithIdClassIncludingEntity(PathMetadata metadata, PathInits inits) {
        this(SampleWithIdClassIncludingEntity.class, metadata, inits);
    }

    public QSampleWithIdClassIncludingEntity(Class<? extends SampleWithIdClassIncludingEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.second = inits.isInitialized("second") ? new QSampleWithIdClassIncludingEntity_OtherEntity(forProperty("second")) : null;
    }

}

