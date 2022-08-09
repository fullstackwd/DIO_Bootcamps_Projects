package org.springframework.data.jpa.repository.procedures;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPostgresStoredProcedureIntegrationTests_Employee is a Querydsl query type for Employee
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPostgresStoredProcedureIntegrationTests_Employee extends EntityPathBase<PostgresStoredProcedureIntegrationTests.Employee> {

    private static final long serialVersionUID = 2107677298L;

    public static final QPostgresStoredProcedureIntegrationTests_Employee employee = new QPostgresStoredProcedureIntegrationTests_Employee("employee");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QPostgresStoredProcedureIntegrationTests_Employee(String variable) {
        super(PostgresStoredProcedureIntegrationTests.Employee.class, forVariable(variable));
    }

    public QPostgresStoredProcedureIntegrationTests_Employee(Path<? extends PostgresStoredProcedureIntegrationTests.Employee> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPostgresStoredProcedureIntegrationTests_Employee(PathMetadata metadata) {
        super(PostgresStoredProcedureIntegrationTests.Employee.class, metadata);
    }

}

