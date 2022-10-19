/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: https://www.jooq.org/legal/licensing
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import org.jooq.Converter;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Record14;

import org.jetbrains.annotations.NotNull;

/**
 * A general purpose record, typically used for ad-hoc types.
 * <p>
 * This type implements both the general-purpose, type-unsafe {@link Record}
 * interface, as well as the more specific, type-safe {@link Record14}
 * interfaces
 *
 * @author Lukas Eder
 */
@SuppressWarnings({ "unchecked" })
final class RecordImpl14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> extends AbstractRecord implements InternalRecord, Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> {

    RecordImpl14(AbstractRow<?> row) {
        super(row);
    }

    // ------------------------------------------------------------------------
    // XXX: Type-safe Record APIs
    // ------------------------------------------------------------------------

    @Override
    public RowImpl14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> fieldsRow() {
        return new RowImpl14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8(), field9(), field10(), field11(), field12(), field13(), field14());
    }

    @Override
    public final RowImpl14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> valuesRow() {
        return new RowImpl14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(Tools.field(value1(), field1()), Tools.field(value2(), field2()), Tools.field(value3(), field3()), Tools.field(value4(), field4()), Tools.field(value5(), field5()), Tools.field(value6(), field6()), Tools.field(value7(), field7()), Tools.field(value8(), field8()), Tools.field(value9(), field9()), Tools.field(value10(), field10()), Tools.field(value11(), field11()), Tools.field(value12(), field12()), Tools.field(value13(), field13()), Tools.field(value14(), field14()));
    }

    @Override
    public final Field<T1> field1() {
        return (@NotNull Field<T1>) fields.field(0);
    }

    @Override
    public final Field<T2> field2() {
        return (@NotNull Field<T2>) fields.field(1);
    }

    @Override
    public final Field<T3> field3() {
        return (@NotNull Field<T3>) fields.field(2);
    }

    @Override
    public final Field<T4> field4() {
        return (@NotNull Field<T4>) fields.field(3);
    }

    @Override
    public final Field<T5> field5() {
        return (@NotNull Field<T5>) fields.field(4);
    }

    @Override
    public final Field<T6> field6() {
        return (@NotNull Field<T6>) fields.field(5);
    }

    @Override
    public final Field<T7> field7() {
        return (@NotNull Field<T7>) fields.field(6);
    }

    @Override
    public final Field<T8> field8() {
        return (@NotNull Field<T8>) fields.field(7);
    }

    @Override
    public final Field<T9> field9() {
        return (@NotNull Field<T9>) fields.field(8);
    }

    @Override
    public final Field<T10> field10() {
        return (@NotNull Field<T10>) fields.field(9);
    }

    @Override
    public final Field<T11> field11() {
        return (@NotNull Field<T11>) fields.field(10);
    }

    @Override
    public final Field<T12> field12() {
        return (@NotNull Field<T12>) fields.field(11);
    }

    @Override
    public final Field<T13> field13() {
        return (@NotNull Field<T13>) fields.field(12);
    }

    @Override
    public final Field<T14> field14() {
        return (@NotNull Field<T14>) fields.field(13);
    }

    @Override
    public final T1 value1() {
        return (T1) get(0);
    }

    @Override
    public final T2 value2() {
        return (T2) get(1);
    }

    @Override
    public final T3 value3() {
        return (T3) get(2);
    }

    @Override
    public final T4 value4() {
        return (T4) get(3);
    }

    @Override
    public final T5 value5() {
        return (T5) get(4);
    }

    @Override
    public final T6 value6() {
        return (T6) get(5);
    }

    @Override
    public final T7 value7() {
        return (T7) get(6);
    }

    @Override
    public final T8 value8() {
        return (T8) get(7);
    }

    @Override
    public final T9 value9() {
        return (T9) get(8);
    }

    @Override
    public final T10 value10() {
        return (T10) get(9);
    }

    @Override
    public final T11 value11() {
        return (T11) get(10);
    }

    @Override
    public final T12 value12() {
        return (T12) get(11);
    }

    @Override
    public final T13 value13() {
        return (T13) get(12);
    }

    @Override
    public final T14 value14() {
        return (T14) get(13);
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> value1(T1 value) {
        set(0, value);
        return this;
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> value2(T2 value) {
        set(1, value);
        return this;
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> value3(T3 value) {
        set(2, value);
        return this;
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> value4(T4 value) {
        set(3, value);
        return this;
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> value5(T5 value) {
        set(4, value);
        return this;
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> value6(T6 value) {
        set(5, value);
        return this;
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> value7(T7 value) {
        set(6, value);
        return this;
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> value8(T8 value) {
        set(7, value);
        return this;
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> value9(T9 value) {
        set(8, value);
        return this;
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> value10(T10 value) {
        set(9, value);
        return this;
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> value11(T11 value) {
        set(10, value);
        return this;
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> value12(T12 value) {
        set(11, value);
        return this;
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> value13(T13 value) {
        set(12, value);
        return this;
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> value14(T14 value) {
        set(13, value);
        return this;
    }

    @Override
    public final Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> values(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14) {
        set(0, t1);
        set(1, t2);
        set(2, t3);
        set(3, t4);
        set(4, t5);
        set(5, t6);
        set(6, t7);
        set(7, t8);
        set(8, t9);
        set(9, t10);
        set(10, t11);
        set(11, t12);
        set(12, t13);
        set(13, t14);
        return this;
    }

    @Override
    public <T> Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> with(Field<T> field, T value) {
        return (Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>) super.with(field, value);
    }

    @Override
    public <T, U> Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> with(Field<T> field, U value, Converter<? extends T, ? super U> converter) {
        return (Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>) super.with(field, value, converter);
    }

    @Override
    public final T1 component1() {
        return value1();
    }

    @Override
    public final T2 component2() {
        return value2();
    }

    @Override
    public final T3 component3() {
        return value3();
    }

    @Override
    public final T4 component4() {
        return value4();
    }

    @Override
    public final T5 component5() {
        return value5();
    }

    @Override
    public final T6 component6() {
        return value6();
    }

    @Override
    public final T7 component7() {
        return value7();
    }

    @Override
    public final T8 component8() {
        return value8();
    }

    @Override
    public final T9 component9() {
        return value9();
    }

    @Override
    public final T10 component10() {
        return value10();
    }

    @Override
    public final T11 component11() {
        return value11();
    }

    @Override
    public final T12 component12() {
        return value12();
    }

    @Override
    public final T13 component13() {
        return value13();
    }

    @Override
    public final T14 component14() {
        return value14();
    }
}
