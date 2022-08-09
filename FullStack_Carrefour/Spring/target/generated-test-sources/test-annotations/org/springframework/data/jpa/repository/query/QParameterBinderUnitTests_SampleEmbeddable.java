package org.springframework.data.jpa.repository.query;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QParameterBinderUnitTests_SampleEmbeddable is a Querydsl query type for SampleEmbeddable
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QParameterBinderUnitTests_SampleEmbeddable extends BeanPath<ParameterBinderUnitTests.SampleEmbeddable> {

    private static final long serialVersionUID = -2123541703L;

    public static final QParameterBinderUnitTests_SampleEmbeddable sampleEmbeddable = new QParameterBinderUnitTests_SampleEmbeddable("sampleEmbeddable");

    public final StringPath bar = createString("bar");

    public final StringPath foo = createString("foo");

    public QParameterBinderUnitTests_SampleEmbeddable(String variable) {
        super(ParameterBinderUnitTests.SampleEmbeddable.class, forVariable(variable));
    }

    public QParameterBinderUnitTests_SampleEmbeddable(Path<? extends ParameterBinderUnitTests.SampleEmbeddable> path) {
        super(path.getType(), path.getMetadata());
    }

    public QParameterBinderUnitTests_SampleEmbeddable(PathMetadata metadata) {
        super(ParameterBinderUnitTests.SampleEmbeddable.class, metadata);
    }

}

