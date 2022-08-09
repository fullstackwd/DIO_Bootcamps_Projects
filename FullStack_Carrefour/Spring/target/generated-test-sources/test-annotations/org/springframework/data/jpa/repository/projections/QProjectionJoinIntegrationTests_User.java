package org.springframework.data.jpa.repository.projections;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProjectionJoinIntegrationTests_User is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProjectionJoinIntegrationTests_User extends EntityPathBase<ProjectionJoinIntegrationTests.User> {

    private static final long serialVersionUID = 503690261L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProjectionJoinIntegrationTests_User user = new QProjectionJoinIntegrationTests_User("user");

    public final QProjectionJoinIntegrationTests_Address address;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public QProjectionJoinIntegrationTests_User(String variable) {
        this(ProjectionJoinIntegrationTests.User.class, forVariable(variable), INITS);
    }

    public QProjectionJoinIntegrationTests_User(Path<? extends ProjectionJoinIntegrationTests.User> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProjectionJoinIntegrationTests_User(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProjectionJoinIntegrationTests_User(PathMetadata metadata, PathInits inits) {
        this(ProjectionJoinIntegrationTests.User.class, metadata, inits);
    }

    public QProjectionJoinIntegrationTests_User(Class<? extends ProjectionJoinIntegrationTests.User> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QProjectionJoinIntegrationTests_Address(forProperty("address")) : null;
    }

}

