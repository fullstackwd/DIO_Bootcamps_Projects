package org.springframework.data.jpa.domain.sample;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPersistableWithSingleIdClass is a Querydsl query type for PersistableWithSingleIdClass
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPersistableWithSingleIdClass extends EntityPathBase<PersistableWithSingleIdClass> {

    private static final long serialVersionUID = 259348619L;

    public static final QPersistableWithSingleIdClass persistableWithSingleIdClass = new QPersistableWithSingleIdClass("persistableWithSingleIdClass");

    public final NumberPath<Long> first = createNumber("first", Long.class);

    public QPersistableWithSingleIdClass(String variable) {
        super(PersistableWithSingleIdClass.class, forVariable(variable));
    }

    public QPersistableWithSingleIdClass(Path<? extends PersistableWithSingleIdClass> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPersistableWithSingleIdClass(PathMetadata metadata) {
        super(PersistableWithSingleIdClass.class, metadata);
    }

}

