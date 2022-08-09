package org.springframework.data.jpa.repository.projections;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProjectionJoinIntegrationTests_Address is a Querydsl query type for Address
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProjectionJoinIntegrationTests_Address extends EntityPathBase<ProjectionJoinIntegrationTests.Address> {

    private static final long serialVersionUID = 2115336042L;

    public static final QProjectionJoinIntegrationTests_Address address = new QProjectionJoinIntegrationTests_Address("address");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath streetName = createString("streetName");

    public QProjectionJoinIntegrationTests_Address(String variable) {
        super(ProjectionJoinIntegrationTests.Address.class, forVariable(variable));
    }

    public QProjectionJoinIntegrationTests_Address(Path<? extends ProjectionJoinIntegrationTests.Address> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProjectionJoinIntegrationTests_Address(PathMetadata metadata) {
        super(ProjectionJoinIntegrationTests.Address.class, metadata);
    }

}

