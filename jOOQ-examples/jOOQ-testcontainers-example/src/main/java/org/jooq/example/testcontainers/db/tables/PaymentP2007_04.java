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

import org.jooq.Check;
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
import org.jooq.example.testcontainers.db.Indexes;
import org.jooq.example.testcontainers.db.Keys;
import org.jooq.example.testcontainers.db.Public;
import org.jooq.example.testcontainers.db.tables.Customer.CustomerPath;
import org.jooq.example.testcontainers.db.tables.Rental.RentalPath;
import org.jooq.example.testcontainers.db.tables.Staff.StaffPath;
import org.jooq.example.testcontainers.db.tables.records.PaymentP2007_04Record;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaymentP2007_04 extends TableImpl<PaymentP2007_04Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.payment_p2007_04</code>
     */
    public static final PaymentP2007_04 PAYMENT_P2007_04 = new PaymentP2007_04();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentP2007_04Record> getRecordType() {
        return PaymentP2007_04Record.class;
    }

    /**
     * The column <code>public.payment_p2007_04.payment_id</code>.
     */
    public final TableField<PaymentP2007_04Record, Long> PAYMENT_ID = createField(DSL.name("payment_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.payment_p2007_04.customer_id</code>.
     */
    public final TableField<PaymentP2007_04Record, Long> CUSTOMER_ID = createField(DSL.name("customer_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment_p2007_04.staff_id</code>.
     */
    public final TableField<PaymentP2007_04Record, Long> STAFF_ID = createField(DSL.name("staff_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment_p2007_04.rental_id</code>.
     */
    public final TableField<PaymentP2007_04Record, Long> RENTAL_ID = createField(DSL.name("rental_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment_p2007_04.amount</code>.
     */
    public final TableField<PaymentP2007_04Record, BigDecimal> AMOUNT = createField(DSL.name("amount"), SQLDataType.NUMERIC(5, 2).nullable(false), this, "");

    /**
     * The column <code>public.payment_p2007_04.payment_date</code>.
     */
    public final TableField<PaymentP2007_04Record, LocalDateTime> PAYMENT_DATE = createField(DSL.name("payment_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    private PaymentP2007_04(Name alias, Table<PaymentP2007_04Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PaymentP2007_04(Name alias, Table<PaymentP2007_04Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.payment_p2007_04</code> table reference
     */
    public PaymentP2007_04(String alias) {
        this(DSL.name(alias), PAYMENT_P2007_04);
    }

    /**
     * Create an aliased <code>public.payment_p2007_04</code> table reference
     */
    public PaymentP2007_04(Name alias) {
        this(alias, PAYMENT_P2007_04);
    }

    /**
     * Create a <code>public.payment_p2007_04</code> table reference
     */
    public PaymentP2007_04() {
        this(DSL.name("payment_p2007_04"), null);
    }

    public <O extends Record> PaymentP2007_04(Table<O> path, ForeignKey<O, PaymentP2007_04Record> childPath, InverseForeignKey<O, PaymentP2007_04Record> parentPath) {
        super(path, childPath, parentPath, PAYMENT_P2007_04);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class PaymentP2007_04Path extends PaymentP2007_04 implements Path<PaymentP2007_04Record> {
        public <O extends Record> PaymentP2007_04Path(Table<O> path, ForeignKey<O, PaymentP2007_04Record> childPath, InverseForeignKey<O, PaymentP2007_04Record> parentPath) {
            super(path, childPath, parentPath);
        }
        private PaymentP2007_04Path(Name alias, Table<PaymentP2007_04Record> aliased) {
            super(alias, aliased);
        }

        @Override
        public PaymentP2007_04Path as(String alias) {
            return new PaymentP2007_04Path(DSL.name(alias), this);
        }

        @Override
        public PaymentP2007_04Path as(Name alias) {
            return new PaymentP2007_04Path(alias, this);
        }

        @Override
        public PaymentP2007_04Path as(Table<?> alias) {
            return new PaymentP2007_04Path(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_FK_PAYMENT_P2007_04_CUSTOMER_ID, Indexes.IDX_FK_PAYMENT_P2007_04_STAFF_ID);
    }

    @Override
    public Identity<PaymentP2007_04Record, Long> getIdentity() {
        return (Identity<PaymentP2007_04Record, Long>) super.getIdentity();
    }

    @Override
    public List<ForeignKey<PaymentP2007_04Record, ?>> getReferences() {
        return Arrays.asList(Keys.PAYMENT_P2007_04__PAYMENT_P2007_04_CUSTOMER_ID_FKEY, Keys.PAYMENT_P2007_04__PAYMENT_P2007_04_STAFF_ID_FKEY, Keys.PAYMENT_P2007_04__PAYMENT_P2007_04_RENTAL_ID_FKEY);
    }

    private transient CustomerPath _customer;

    /**
     * Get the implicit join path to the <code>public.customer</code> table.
     */
    public CustomerPath customer() {
        if (_customer == null)
            _customer = new CustomerPath(this, Keys.PAYMENT_P2007_04__PAYMENT_P2007_04_CUSTOMER_ID_FKEY, null);

        return _customer;
    }

    private transient StaffPath _staff;

    /**
     * Get the implicit join path to the <code>public.staff</code> table.
     */
    public StaffPath staff() {
        if (_staff == null)
            _staff = new StaffPath(this, Keys.PAYMENT_P2007_04__PAYMENT_P2007_04_STAFF_ID_FKEY, null);

        return _staff;
    }

    private transient RentalPath _rental;

    /**
     * Get the implicit join path to the <code>public.rental</code> table.
     */
    public RentalPath rental() {
        if (_rental == null)
            _rental = new RentalPath(this, Keys.PAYMENT_P2007_04__PAYMENT_P2007_04_RENTAL_ID_FKEY, null);

        return _rental;
    }

    @Override
    public List<Check<PaymentP2007_04Record>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("payment_p2007_04_payment_date_check"), "(((payment_date >= '2007-04-01 00:00:00'::timestamp without time zone) AND (payment_date < '2007-05-01 00:00:00'::timestamp without time zone)))", true)
        );
    }

    @Override
    public PaymentP2007_04 as(String alias) {
        return new PaymentP2007_04(DSL.name(alias), this);
    }

    @Override
    public PaymentP2007_04 as(Name alias) {
        return new PaymentP2007_04(alias, this);
    }

    @Override
    public PaymentP2007_04 as(Table<?> alias) {
        return new PaymentP2007_04(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentP2007_04 rename(String name) {
        return new PaymentP2007_04(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentP2007_04 rename(Name name) {
        return new PaymentP2007_04(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentP2007_04 rename(Table<?> name) {
        return new PaymentP2007_04(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_04 where(Condition condition) {
        return new PaymentP2007_04(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_04 where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_04 where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_04 where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PaymentP2007_04 where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PaymentP2007_04 where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PaymentP2007_04 where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PaymentP2007_04 where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_04 whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_04 whereNotExists(Select<?> select) {
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
