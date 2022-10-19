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
package org.jooq.meta;

import org.jooq.meta.jaxb.SyntheticDaoType;

/**
 * A definition wrapping a {@link SyntheticDaoType}.
 *
 * @author Lukas Eder
 */
public class DefaultSyntheticDaoDefinition extends AbstractDefinition implements SyntheticDaoDefinition {

    private final SyntheticDaoType dao;

    public DefaultSyntheticDaoDefinition(Database database, SchemaDefinition schema, SyntheticDaoType dao) {
        super(database, schema, dao.getName(), dao.getComment());

        this.dao = dao;
    }

    @Override
    public SyntheticDaoType getDao() {
        return dao;
    }
}
