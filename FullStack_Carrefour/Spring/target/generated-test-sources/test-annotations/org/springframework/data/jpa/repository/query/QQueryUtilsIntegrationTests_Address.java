package org.springframework.data.jpa.repository.query;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQueryUtilsIntegrationTests_Address is a Querydsl query type for Address
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQueryUtilsIntegrationTests_Address extends EntityPathBase<QueryUtilsIntegrationTests.Address> {

    private static final long serialVersionUID = 793046742L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQueryUtilsIntegrationTests_Address address = new QQueryUtilsIntegrationTests_Address("address");

    public final StringPath id = createString("id");

    public final QQueryUtilsIntegrationTests_Merchant merchant;

    public QQueryUtilsIntegrationTests_Address(String variable) {
        this(QueryUtilsIntegrationTests.Address.class, forVariable(variable), INITS);
    }

    public QQueryUtilsIntegrationTests_Address(Path<? extends QueryUtilsIntegrationTests.Address> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQueryUtilsIntegrationTests_Address(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQueryUtilsIntegrationTests_Address(PathMetadata metadata, PathInits inits) {
        this(QueryUtilsIntegrationTests.Address.class, metadata, inits);
    }

    public QQueryUtilsIntegrationTests_Address(Class<? extends QueryUtilsIntegrationTests.Address> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.merchant = inits.isInitialized("merchant") ? new QQueryUtilsIntegrationTests_Merchant(forProperty("merchant"), inits.get("merchant")) : null;
    }

}

