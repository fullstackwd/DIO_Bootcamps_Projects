package org.springframework.data.jpa.repository.support;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QJpaMetamodelEntityInformationIntegrationTests_EntityWithPrivateIdGetter is a Querydsl query type for EntityWithPrivateIdGetter
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QJpaMetamodelEntityInformationIntegrationTests_EntityWithPrivateIdGetter extends EntityPathBase<JpaMetamodelEntityInformationIntegrationTests.EntityWithPrivateIdGetter> {

    private static final long serialVersionUID = -1380138580L;

    public static final QJpaMetamodelEntityInformationIntegrationTests_EntityWithPrivateIdGetter entityWithPrivateIdGetter = new QJpaMetamodelEntityInformationIntegrationTests_EntityWithPrivateIdGetter("entityWithPrivateIdGetter");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QJpaMetamodelEntityInformationIntegrationTests_EntityWithPrivateIdGetter(String variable) {
        super(JpaMetamodelEntityInformationIntegrationTests.EntityWithPrivateIdGetter.class, forVariable(variable));
    }

    public QJpaMetamodelEntityInformationIntegrationTests_EntityWithPrivateIdGetter(Path<? extends JpaMetamodelEntityInformationIntegrationTests.EntityWithPrivateIdGetter> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJpaMetamodelEntityInformationIntegrationTests_EntityWithPrivateIdGetter(PathMetadata metadata) {
        super(JpaMetamodelEntityInformationIntegrationTests.EntityWithPrivateIdGetter.class, metadata);
    }

}

