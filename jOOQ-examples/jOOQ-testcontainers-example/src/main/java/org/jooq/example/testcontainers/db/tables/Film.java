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
import org.jooq.Function14;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row14;
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
import org.jooq.example.testcontainers.db.enums.MpaaRating;
import org.jooq.example.testcontainers.db.tables.Actor.ActorPath;
import org.jooq.example.testcontainers.db.tables.Category.CategoryPath;
import org.jooq.example.testcontainers.db.tables.FilmActor.FilmActorPath;
import org.jooq.example.testcontainers.db.tables.FilmCategory.FilmCategoryPath;
import org.jooq.example.testcontainers.db.tables.Inventory.InventoryPath;
import org.jooq.example.testcontainers.db.tables.Language.LanguagePath;
import org.jooq.example.testcontainers.db.tables.records.FilmRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Film extends TableImpl<FilmRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.film</code>
     */
    public static final Film FILM = new Film();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmRecord> getRecordType() {
        return FilmRecord.class;
    }

    /**
     * The column <code>public.film.film_id</code>.
     */
    public final TableField<FilmRecord, Long> FILM_ID = createField(DSL.name("film_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.film.title</code>.
     */
    public final TableField<FilmRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.film.description</code>.
     */
    public final TableField<FilmRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.film.release_year</code>.
     */
    public final TableField<FilmRecord, Integer> RELEASE_YEAR = createField(DSL.name("release_year"), org.jooq.example.testcontainers.db.Domains.YEAR.getDataType(), this, "");

    /**
     * The column <code>public.film.language_id</code>.
     */
    public final TableField<FilmRecord, Long> LANGUAGE_ID = createField(DSL.name("language_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.film.original_language_id</code>.
     */
    public final TableField<FilmRecord, Long> ORIGINAL_LANGUAGE_ID = createField(DSL.name("original_language_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.film.rental_duration</code>.
     */
    public final TableField<FilmRecord, Short> RENTAL_DURATION = createField(DSL.name("rental_duration"), SQLDataType.SMALLINT.nullable(false).defaultValue(DSL.field(DSL.raw("3"), SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>public.film.rental_rate</code>.
     */
    public final TableField<FilmRecord, BigDecimal> RENTAL_RATE = createField(DSL.name("rental_rate"), SQLDataType.NUMERIC(4, 2).nullable(false).defaultValue(DSL.field(DSL.raw("4.99"), SQLDataType.NUMERIC)), this, "");

    /**
     * The column <code>public.film.length</code>.
     */
    public final TableField<FilmRecord, Short> LENGTH = createField(DSL.name("length"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>public.film.replacement_cost</code>.
     */
    public final TableField<FilmRecord, BigDecimal> REPLACEMENT_COST = createField(DSL.name("replacement_cost"), SQLDataType.NUMERIC(5, 2).nullable(false).defaultValue(DSL.field(DSL.raw("19.99"), SQLDataType.NUMERIC)), this, "");

    /**
     * The column <code>public.film.rating</code>.
     */
    public final TableField<FilmRecord, MpaaRating> RATING = createField(DSL.name("rating"), SQLDataType.VARCHAR.defaultValue(DSL.field(DSL.raw("'G'::mpaa_rating"), SQLDataType.VARCHAR)).asEnumDataType(org.jooq.example.testcontainers.db.enums.MpaaRating.class), this, "");

    /**
     * The column <code>public.film.last_update</code>.
     */
    public final TableField<FilmRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.film.special_features</code>.
     */
    public final TableField<FilmRecord, String[]> SPECIAL_FEATURES = createField(DSL.name("special_features"), SQLDataType.CLOB.array(), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<FilmRecord, Object> FULLTEXT = createField(DSL.name("fulltext"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsvector\"").nullable(false), this, "");

    private Film(Name alias, Table<FilmRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Film(Name alias, Table<FilmRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.film</code> table reference
     */
    public Film(String alias) {
        this(DSL.name(alias), FILM);
    }

    /**
     * Create an aliased <code>public.film</code> table reference
     */
    public Film(Name alias) {
        this(alias, FILM);
    }

    /**
     * Create a <code>public.film</code> table reference
     */
    public Film() {
        this(DSL.name("film"), null);
    }

    public <O extends Record> Film(Table<O> path, ForeignKey<O, FilmRecord> childPath, InverseForeignKey<O, FilmRecord> parentPath) {
        super(path, childPath, parentPath, FILM);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class FilmPath extends Film implements Path<FilmRecord> {
        public <O extends Record> FilmPath(Table<O> path, ForeignKey<O, FilmRecord> childPath, InverseForeignKey<O, FilmRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private FilmPath(Name alias, Table<FilmRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public FilmPath as(String alias) {
            return new FilmPath(DSL.name(alias), this);
        }

        @Override
        public FilmPath as(Name alias) {
            return new FilmPath(alias, this);
        }

        @Override
        public FilmPath as(Table<?> alias) {
            return new FilmPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FILM_FULLTEXT_IDX, Indexes.IDX_FK_LANGUAGE_ID, Indexes.IDX_FK_ORIGINAL_LANGUAGE_ID, Indexes.IDX_TITLE);
    }

    @Override
    public Identity<FilmRecord, Long> getIdentity() {
        return (Identity<FilmRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FilmRecord> getPrimaryKey() {
        return Keys.FILM_PKEY;
    }

    @Override
    public List<ForeignKey<FilmRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FILM__FILM_LANGUAGE_ID_FKEY, Keys.FILM__FILM_ORIGINAL_LANGUAGE_ID_FKEY);
    }

    private transient LanguagePath _filmLanguageIdFkey;

    /**
     * Get the implicit join path to the <code>public.language</code> table, via
     * the <code>film_language_id_fkey</code> key.
     */
    public LanguagePath filmLanguageIdFkey() {
        if (_filmLanguageIdFkey == null)
            _filmLanguageIdFkey = new LanguagePath(this, Keys.FILM__FILM_LANGUAGE_ID_FKEY, null);

        return _filmLanguageIdFkey;
    }

    private transient LanguagePath _filmOriginalLanguageIdFkey;

    /**
     * Get the implicit join path to the <code>public.language</code> table, via
     * the <code>film_original_language_id_fkey</code> key.
     */
    public LanguagePath filmOriginalLanguageIdFkey() {
        if (_filmOriginalLanguageIdFkey == null)
            _filmOriginalLanguageIdFkey = new LanguagePath(this, Keys.FILM__FILM_ORIGINAL_LANGUAGE_ID_FKEY, null);

        return _filmOriginalLanguageIdFkey;
    }

    private transient FilmActorPath _filmActor;

    /**
     * Get the implicit to-many join path to the <code>public.film_actor</code>
     * table
     */
    public FilmActorPath filmActor() {
        if (_filmActor == null)
            _filmActor = new FilmActorPath(this, null, Keys.FILM_ACTOR__FILM_ACTOR_FILM_ID_FKEY.getInverseKey());

        return _filmActor;
    }

    private transient FilmCategoryPath _filmCategory;

    /**
     * Get the implicit to-many join path to the
     * <code>public.film_category</code> table
     */
    public FilmCategoryPath filmCategory() {
        if (_filmCategory == null)
            _filmCategory = new FilmCategoryPath(this, null, Keys.FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY.getInverseKey());

        return _filmCategory;
    }

    private transient InventoryPath _inventory;

    /**
     * Get the implicit to-many join path to the <code>public.inventory</code>
     * table
     */
    public InventoryPath inventory() {
        if (_inventory == null)
            _inventory = new InventoryPath(this, null, Keys.INVENTORY__INVENTORY_FILM_ID_FKEY.getInverseKey());

        return _inventory;
    }

    /**
     * Get the implicit many-to-many join path to the <code>public.actor</code>
     * table
     */
    public ActorPath actor() {
        return filmActor().actor();
    }

    /**
     * Get the implicit many-to-many join path to the
     * <code>public.category</code> table
     */
    public CategoryPath category() {
        return filmCategory().category();
    }

    @Override
    public Film as(String alias) {
        return new Film(DSL.name(alias), this);
    }

    @Override
    public Film as(Name alias) {
        return new Film(alias, this);
    }

    @Override
    public Film as(Table<?> alias) {
        return new Film(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(String name) {
        return new Film(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(Name name) {
        return new Film(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(Table<?> name) {
        return new Film(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film where(Condition condition) {
        return new Film(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Film where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Film where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Film where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Film where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Long, String, String, Integer, Long, Long, Short, BigDecimal, Short, BigDecimal, MpaaRating, LocalDateTime, String[], Object> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function14<? super Long, ? super String, ? super String, ? super Integer, ? super Long, ? super Long, ? super Short, ? super BigDecimal, ? super Short, ? super BigDecimal, ? super MpaaRating, ? super LocalDateTime, ? super String[], ? super Object, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function14<? super Long, ? super String, ? super String, ? super Integer, ? super Long, ? super Long, ? super Short, ? super BigDecimal, ? super Short, ? super BigDecimal, ? super MpaaRating, ? super LocalDateTime, ? super String[], ? super Object, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
