package org.springframework.data.jpa.repository.query;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQueryUtilsIntegrationTests_Merchant is a Querydsl query type for Merchant
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQueryUtilsIntegrationTests_Merchant extends EntityPathBase<QueryUtilsIntegrationTests.Merchant> {

    private static final long serialVersionUID = -471936218L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQueryUtilsIntegrationTests_Merchant merchant = new QQueryUtilsIntegrationTests_Merchant("merchant");

    public final QQueryUtilsIntegrationTests_Address address;

    public final SetPath<QueryUtilsIntegrationTests.Employee, QQueryUtilsIntegrationTests_Employee> employees = this.<QueryUtilsIntegrationTests.Employee, QQueryUtilsIntegrationTests_Employee>createSet("employees", QueryUtilsIntegrationTests.Employee.class, QQueryUtilsIntegrationTests_Employee.class, PathInits.DIRECT2);

    public final StringPath id = createString("id");

    public QQueryUtilsIntegrationTests_Merchant(String variable) {
        this(QueryUtilsIntegrationTests.Merchant.class, forVariable(variable), INITS);
    }

    public QQueryUtilsIntegrationTests_Merchant(Path<? extends QueryUtilsIntegrationTests.Merchant> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQueryUtilsIntegrationTests_Merchant(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQueryUtilsIntegrationTests_Merchant(PathMetadata metadata, PathInits inits) {
        this(QueryUtilsIntegrationTests.Merchant.class, metadata, inits);
    }

    public QQueryUtilsIntegrationTests_Merchant(Class<? extends QueryUtilsIntegrationTests.Merchant> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QQueryUtilsIntegrationTests_Address(forProperty("address"), inits.get("address")) : null;
    }

}

