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

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.jooq.tools.jdbc.DefaultCallableStatement;

/**
 * @author Lukas Eder
 */
final class DiagnosticsStatement extends DefaultCallableStatement {

    final DiagnosticsConnection connection;
    final String                actualStatement;

    DiagnosticsStatement(DiagnosticsConnection connection, Statement statement) {
        this(connection, statement, null);
    }

    DiagnosticsStatement(DiagnosticsConnection connection, Statement statement, String actualStatement) {
        super(statement);

        this.connection = connection;
        this.actualStatement = actualStatement;
    }

    @Override
    public final ResultSet executeQuery(String sql) throws SQLException {
        if (connection.disabled())
            return super.executeQuery(sql);
        else
            return new DiagnosticsResultSet(super.executeQuery(connection.parse(sql)), sql, this, connection);
    }

    @Override
    public ResultSet executeQuery() throws SQLException {
        if (connection.disabled())
            return super.executeQuery();
        else
            return new DiagnosticsResultSet(super.executeQuery(), actualStatement, this, connection);
    }

    @Override
    public final int executeUpdate(String sql) throws SQLException {
        return super.executeUpdate(connection.parse(sql));
    }

    @Override
    public final int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        return super.executeUpdate(connection.parse(sql), autoGeneratedKeys);
    }

    @Override
    public final int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        return super.executeUpdate(connection.parse(sql), columnIndexes);
    }

    @Override
    public final int executeUpdate(String sql, String[] columnNames) throws SQLException {
        return super.executeUpdate(connection.parse(sql), columnNames);
    }

    @Override
    public final boolean execute(String sql) throws SQLException {
        return super.execute(connection.parse(sql));
    }

    @Override
    public final boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
        return super.execute(connection.parse(sql), autoGeneratedKeys);
    }

    @Override
    public final boolean execute(String sql, int[] columnIndexes) throws SQLException {
        return super.execute(connection.parse(sql), columnIndexes);
    }

    @Override
    public final boolean execute(String sql, String[] columnNames) throws SQLException {
        return super.execute(connection.parse(sql), columnNames);
    }

    @Override
    public final long executeLargeUpdate(String sql) throws SQLException {
        return super.executeLargeUpdate(connection.parse(sql));
    }

    @Override
    public final long executeLargeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        return super.executeLargeUpdate(connection.parse(sql), autoGeneratedKeys);
    }

    @Override
    public final long executeLargeUpdate(String sql, int[] columnIndexes) throws SQLException {
        return super.executeLargeUpdate(connection.parse(sql), columnIndexes);
    }

    @Override
    public final long executeLargeUpdate(String sql, String[] columnNames) throws SQLException {
        return super.executeLargeUpdate(connection.parse(sql), columnNames);
    }

    @Override
    public final void addBatch(String sql) throws SQLException {
        super.addBatch(connection.parse(sql));
    }

    @Override
    public final Connection getConnection() throws SQLException {
        return connection;
    }
}
