/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.h2.information_schema.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.h2.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FunctionColumns extends TableImpl<Record> {

    private static final long serialVersionUID = 1384288249;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code>
     */
    public static final FunctionColumns FUNCTION_COLUMNS = new FunctionColumns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_CATALOG</code>.
     */
    public final TableField<Record, String> ALIAS_CATALOG = createField(DSL.name("ALIAS_CATALOG"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_SCHEMA</code>.
     */
    public final TableField<Record, String> ALIAS_SCHEMA = createField(DSL.name("ALIAS_SCHEMA"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_NAME</code>.
     */
    public final TableField<Record, String> ALIAS_NAME = createField(DSL.name("ALIAS_NAME"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.JAVA_CLASS</code>.
     */
    public final TableField<Record, String> JAVA_CLASS = createField(DSL.name("JAVA_CLASS"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.JAVA_METHOD</code>.
     */
    public final TableField<Record, String> JAVA_METHOD = createField(DSL.name("JAVA_METHOD"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_COUNT</code>.
     */
    public final TableField<Record, Integer> COLUMN_COUNT = createField(DSL.name("COLUMN_COUNT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.POS</code>.
     */
    public final TableField<Record, Integer> POS = createField(DSL.name("POS"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_NAME</code>.
     */
    public final TableField<Record, String> COLUMN_NAME = createField(DSL.name("COLUMN_NAME"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.DATA_TYPE</code>.
     */
    public final TableField<Record, Integer> DATA_TYPE = createField(DSL.name("DATA_TYPE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.TYPE_NAME</code>.
     */
    public final TableField<Record, String> TYPE_NAME = createField(DSL.name("TYPE_NAME"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.PRECISION</code>.
     */
    public final TableField<Record, Integer> PRECISION = createField(DSL.name("PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.SCALE</code>.
     */
    public final TableField<Record, Short> SCALE = createField(DSL.name("SCALE"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.RADIX</code>.
     */
    public final TableField<Record, Short> RADIX = createField(DSL.name("RADIX"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.NULLABLE</code>.
     */
    public final TableField<Record, Short> NULLABLE = createField(DSL.name("NULLABLE"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_TYPE</code>.
     */
    public final TableField<Record, Short> COLUMN_TYPE = createField(DSL.name("COLUMN_TYPE"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.REMARKS</code>.
     */
    public final TableField<Record, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_DEFAULT</code>.
     */
    public final TableField<Record, String> COLUMN_DEFAULT = createField(DSL.name("COLUMN_DEFAULT"), SQLDataType.VARCHAR, this, "");

    private FunctionColumns(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private FunctionColumns(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code> table reference
     */
    public FunctionColumns(String alias) {
        this(DSL.name(alias), FUNCTION_COLUMNS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code> table reference
     */
    public FunctionColumns(Name alias) {
        this(alias, FUNCTION_COLUMNS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code> table reference
     */
    public FunctionColumns() {
        this(DSL.name("FUNCTION_COLUMNS"), null);
    }

    public <O extends Record> FunctionColumns(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, FUNCTION_COLUMNS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public FunctionColumns as(String alias) {
        return new FunctionColumns(DSL.name(alias), this);
    }

    @Override
    public FunctionColumns as(Name alias) {
        return new FunctionColumns(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FunctionColumns rename(String name) {
        return new FunctionColumns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FunctionColumns rename(Name name) {
        return new FunctionColumns(name, null);
    }
}
