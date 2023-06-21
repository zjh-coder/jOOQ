/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainers.db.tables;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.SelectField;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.example.testcontainers.db.Indexes;
import org.jooq.example.testcontainers.db.Keys;
import org.jooq.example.testcontainers.db.Public;
import org.jooq.example.testcontainers.db.tables.Customer.CustomerPath;
import org.jooq.example.testcontainers.db.tables.Rental.RentalPath;
import org.jooq.example.testcontainers.db.tables.Staff.StaffPath;
import org.jooq.example.testcontainers.db.tables.records.PaymentRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Payment extends TableImpl<PaymentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.payment</code>
     */
    public static final Payment PAYMENT = new Payment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentRecord> getRecordType() {
        return PaymentRecord.class;
    }

    /**
     * The column <code>public.payment.payment_id</code>.
     */
    public final TableField<PaymentRecord, Long> PAYMENT_ID = createField(DSL.name("payment_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.payment.customer_id</code>.
     */
    public final TableField<PaymentRecord, Long> CUSTOMER_ID = createField(DSL.name("customer_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment.staff_id</code>.
     */
    public final TableField<PaymentRecord, Long> STAFF_ID = createField(DSL.name("staff_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment.rental_id</code>.
     */
    public final TableField<PaymentRecord, Long> RENTAL_ID = createField(DSL.name("rental_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment.amount</code>.
     */
    public final TableField<PaymentRecord, BigDecimal> AMOUNT = createField(DSL.name("amount"), SQLDataType.NUMERIC(5, 2).nullable(false), this, "");

    /**
     * The column <code>public.payment.payment_date</code>.
     */
    public final TableField<PaymentRecord, LocalDateTime> PAYMENT_DATE = createField(DSL.name("payment_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    private Payment(Name alias, Table<PaymentRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Payment(Name alias, Table<PaymentRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.payment</code> table reference
     */
    public Payment(String alias) {
        this(DSL.name(alias), PAYMENT);
    }

    /**
     * Create an aliased <code>public.payment</code> table reference
     */
    public Payment(Name alias) {
        this(alias, PAYMENT);
    }

    /**
     * Create a <code>public.payment</code> table reference
     */
    public Payment() {
        this(DSL.name("payment"), null);
    }

    public <O extends Record> Payment(Table<O> path, ForeignKey<O, PaymentRecord> childPath, InverseForeignKey<O, PaymentRecord> parentPath) {
        super(path, childPath, parentPath, PAYMENT);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class PaymentPath extends Payment implements Path<PaymentRecord> {
        public <O extends Record> PaymentPath(Table<O> path, ForeignKey<O, PaymentRecord> childPath, InverseForeignKey<O, PaymentRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private PaymentPath(Name alias, Table<PaymentRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public PaymentPath as(String alias) {
            return new PaymentPath(DSL.name(alias), this);
        }

        @Override
        public PaymentPath as(Name alias) {
            return new PaymentPath(alias, this);
        }

        @Override
        public PaymentPath as(Table<?> alias) {
            return new PaymentPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_FK_CUSTOMER_ID, Indexes.IDX_FK_STAFF_ID);
    }

    @Override
    public Identity<PaymentRecord, Long> getIdentity() {
        return (Identity<PaymentRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PaymentRecord> getPrimaryKey() {
        return Keys.PAYMENT_PKEY;
    }

    @Override
    public List<ForeignKey<PaymentRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PAYMENT__PAYMENT_CUSTOMER_ID_FKEY, Keys.PAYMENT__PAYMENT_STAFF_ID_FKEY, Keys.PAYMENT__PAYMENT_RENTAL_ID_FKEY);
    }

    private transient CustomerPath _customer;

    /**
     * Get the implicit join path to the <code>public.customer</code> table.
     */
    public CustomerPath customer() {
        if (_customer == null)
            _customer = new CustomerPath(this, Keys.PAYMENT__PAYMENT_CUSTOMER_ID_FKEY, null);

        return _customer;
    }

    private transient StaffPath _staff;

    /**
     * Get the implicit join path to the <code>public.staff</code> table.
     */
    public StaffPath staff() {
        if (_staff == null)
            _staff = new StaffPath(this, Keys.PAYMENT__PAYMENT_STAFF_ID_FKEY, null);

        return _staff;
    }

    private transient RentalPath _rental;

    /**
     * Get the implicit join path to the <code>public.rental</code> table.
     */
    public RentalPath rental() {
        if (_rental == null)
            _rental = new RentalPath(this, Keys.PAYMENT__PAYMENT_RENTAL_ID_FKEY, null);

        return _rental;
    }

    @Override
    public Payment as(String alias) {
        return new Payment(DSL.name(alias), this);
    }

    @Override
    public Payment as(Name alias) {
        return new Payment(alias, this);
    }

    @Override
    public Payment as(Table<?> alias) {
        return new Payment(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Payment rename(String name) {
        return new Payment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Payment rename(Name name) {
        return new Payment(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Payment rename(Table<?> name) {
        return new Payment(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Payment where(Condition condition) {
        return new Payment(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Payment where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Payment where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Payment where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Payment where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Payment where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Payment where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Payment where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Payment whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Payment whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, Long, Long, BigDecimal, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Long, ? super Long, ? super Long, ? super Long, ? super BigDecimal, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Long, ? super Long, ? super Long, ? super Long, ? super BigDecimal, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
