package org.springframework.data.jpa.repository.procedures;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMySqlStoredProcedureIntegrationTests_Employee is a Querydsl query type for Employee
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMySqlStoredProcedureIntegrationTests_Employee extends EntityPathBase<MySqlStoredProcedureIntegrationTests.Employee> {

    private static final long serialVersionUID = -1568167481L;

    public static final QMySqlStoredProcedureIntegrationTests_Employee employee = new QMySqlStoredProcedureIntegrationTests_Employee("employee");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QMySqlStoredProcedureIntegrationTests_Employee(String variable) {
        super(MySqlStoredProcedureIntegrationTests.Employee.class, forVariable(variable));
    }

    public QMySqlStoredProcedureIntegrationTests_Employee(Path<? extends MySqlStoredProcedureIntegrationTests.Employee> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMySqlStoredProcedureIntegrationTests_Employee(PathMetadata metadata) {
        super(MySqlStoredProcedureIntegrationTests.Employee.class, metadata);
    }

}

