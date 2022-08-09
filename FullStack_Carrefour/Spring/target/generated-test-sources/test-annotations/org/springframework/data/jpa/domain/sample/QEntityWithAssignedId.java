package org.springframework.data.jpa.domain.sample;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEntityWithAssignedId is a Querydsl query type for EntityWithAssignedId
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEntityWithAssignedId extends EntityPathBase<EntityWithAssignedId> {

    private static final long serialVersionUID = 958025020L;

    public static final QEntityWithAssignedId entityWithAssignedId = new QEntityWithAssignedId("entityWithAssignedId");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public QEntityWithAssignedId(String variable) {
        super(EntityWithAssignedId.class, forVariable(variable));
    }

    public QEntityWithAssignedId(Path<? extends EntityWithAssignedId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEntityWithAssignedId(PathMetadata metadata) {
        super(EntityWithAssignedId.class, metadata);
    }

}

