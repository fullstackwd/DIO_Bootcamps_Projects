package org.springframework.data.jpa.domain.sample;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInvoiceItem is a Querydsl query type for InvoiceItem
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInvoiceItem extends EntityPathBase<InvoiceItem> {

    private static final long serialVersionUID = 1543934742L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInvoiceItem invoiceItem = new QInvoiceItem("invoiceItem");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QInvoice invoice;

    public QInvoiceItem(String variable) {
        this(InvoiceItem.class, forVariable(variable), INITS);
    }

    public QInvoiceItem(Path<? extends InvoiceItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInvoiceItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInvoiceItem(PathMetadata metadata, PathInits inits) {
        this(InvoiceItem.class, metadata, inits);
    }

    public QInvoiceItem(Class<? extends InvoiceItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.invoice = inits.isInitialized("invoice") ? new QInvoice(forProperty("invoice"), inits.get("invoice")) : null;
    }

}

