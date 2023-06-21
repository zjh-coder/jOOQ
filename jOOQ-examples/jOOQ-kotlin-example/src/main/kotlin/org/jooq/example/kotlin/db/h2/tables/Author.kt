/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.kotlin.db.h2.tables


import java.time.LocalDate
import java.util.function.Function

import kotlin.collections.Collection

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row6
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.SelectField
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.example.kotlin.db.h2.Public
import org.jooq.example.kotlin.db.h2.keys.FK_T_BOOK_AUTHOR_ID
import org.jooq.example.kotlin.db.h2.keys.FK_T_BOOK_CO_AUTHOR_ID
import org.jooq.example.kotlin.db.h2.keys.PK_T_AUTHOR
import org.jooq.example.kotlin.db.h2.tables.Book.BookPath
import org.jooq.example.kotlin.db.h2.tables.records.AuthorRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Author(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, AuthorRecord>?,
    parentPath: InverseForeignKey<out Record, AuthorRecord>?,
    aliased: Table<AuthorRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<AuthorRecord>(
    alias,
    Public.PUBLIC,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>PUBLIC.AUTHOR</code>
         */
        val AUTHOR: Author = Author()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<AuthorRecord> = AuthorRecord::class.java

    /**
     * The column <code>PUBLIC.AUTHOR.ID</code>.
     */
    val ID: TableField<AuthorRecord, Int?> = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>PUBLIC.AUTHOR.FIRST_NAME</code>.
     */
    val FIRST_NAME: TableField<AuthorRecord, String?> = createField(DSL.name("FIRST_NAME"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>PUBLIC.AUTHOR.LAST_NAME</code>.
     */
    val LAST_NAME: TableField<AuthorRecord, String?> = createField(DSL.name("LAST_NAME"), SQLDataType.VARCHAR(50).nullable(false), this, "")

    /**
     * The column <code>PUBLIC.AUTHOR.DATE_OF_BIRTH</code>.
     */
    val DATE_OF_BIRTH: TableField<AuthorRecord, LocalDate?> = createField(DSL.name("DATE_OF_BIRTH"), SQLDataType.LOCALDATE, this, "")

    /**
     * The column <code>PUBLIC.AUTHOR.YEAR_OF_BIRTH</code>.
     */
    val YEAR_OF_BIRTH: TableField<AuthorRecord, Int?> = createField(DSL.name("YEAR_OF_BIRTH"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>PUBLIC.AUTHOR.ADDRESS</code>.
     */
    val ADDRESS: TableField<AuthorRecord, String?> = createField(DSL.name("ADDRESS"), SQLDataType.VARCHAR(50), this, "")

    private constructor(alias: Name, aliased: Table<AuthorRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<AuthorRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<AuthorRecord>?, where: Condition): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>PUBLIC.AUTHOR</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>PUBLIC.AUTHOR</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>PUBLIC.AUTHOR</code> table reference
     */
    constructor(): this(DSL.name("AUTHOR"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, AuthorRecord>?, parentPath: InverseForeignKey<out Record, AuthorRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, AUTHOR, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class AuthorPath : Author, Path<AuthorRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, AuthorRecord>?, parentPath: InverseForeignKey<out Record, AuthorRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<AuthorRecord>): super(alias, aliased)
        override fun `as`(alias: String): AuthorPath = AuthorPath(DSL.name(alias), this)
        override fun `as`(alias: Name): AuthorPath = AuthorPath(alias, this)
        override fun `as`(alias: Table<*>): AuthorPath = AuthorPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<AuthorRecord, Int?> = super.getIdentity() as Identity<AuthorRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<AuthorRecord> = PK_T_AUTHOR

    private lateinit var _fkTBookAuthorId: BookPath

    /**
     * Get the implicit to-many join path to the <code>PUBLIC.BOOK</code> table,
     * via the <code>FK_T_BOOK_AUTHOR_ID</code> key
     */
    fun fkTBookAuthorId(): BookPath {
        if (!this::_fkTBookAuthorId.isInitialized)
            _fkTBookAuthorId = BookPath(this, null, FK_T_BOOK_AUTHOR_ID.inverseKey)

        return _fkTBookAuthorId;
    }

    val fkTBookAuthorId: BookPath
        get(): BookPath = fkTBookAuthorId()

    private lateinit var _fkTBookCoAuthorId: BookPath

    /**
     * Get the implicit to-many join path to the <code>PUBLIC.BOOK</code> table,
     * via the <code>FK_T_BOOK_CO_AUTHOR_ID</code> key
     */
    fun fkTBookCoAuthorId(): BookPath {
        if (!this::_fkTBookCoAuthorId.isInitialized)
            _fkTBookCoAuthorId = BookPath(this, null, FK_T_BOOK_CO_AUTHOR_ID.inverseKey)

        return _fkTBookCoAuthorId;
    }

    val fkTBookCoAuthorId: BookPath
        get(): BookPath = fkTBookCoAuthorId()
    override fun `as`(alias: String): Author = Author(DSL.name(alias), this)
    override fun `as`(alias: Name): Author = Author(alias, this)
    override fun `as`(alias: Table<*>): Author = Author(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Author = Author(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Author = Author(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Author = Author(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition): Author = Author(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Author = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition): Author = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>): Author = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Author = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Author = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Author = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Author = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Author = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Author = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<Int?, String?, String?, LocalDate?, Int?, String?> = super.fieldsRow() as Row6<Int?, String?, String?, LocalDate?, Int?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Int?, String?, String?, LocalDate?, Int?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Int?, String?, String?, LocalDate?, Int?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
