/**
 * Copyright [2014] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.netbeans.orm.converter.compiler;

import org.netbeans.orm.converter.util.ORMConverterUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniqueConstraintSnippet implements Snippet {

    private List<String> uniqueConstraints = new ArrayList<String>();

    public List<String> getUniqueConstraints() {
        return uniqueConstraints;
    }

    public void setUniqueConstraints(List<String> uniqueConstraints) {
        this.uniqueConstraints = uniqueConstraints;
    }

    public String getSnippet() throws InvalidDataException {

        if (uniqueConstraints.isEmpty()) {
            return "@UniqueConstraint";
        }

        StringBuilder builder = new StringBuilder();

        builder.append("@UniqueConstraint(columnNames={");

        for (String columnName : uniqueConstraints) {
            builder.append(ORMConverterUtil.QUOTE);
            builder.append(columnName);
            builder.append(ORMConverterUtil.QUOTE);
            builder.append(ORMConverterUtil.COMMA);
        }
        builder.deleteCharAt(builder.length() - 1);

        builder.append(ORMConverterUtil.CLOSE_BRACES);
        builder.append(ORMConverterUtil.CLOSE_PARANTHESES);

        return builder.toString();
    }

    public List<String> getImportSnippets() throws InvalidDataException {
        return Collections.singletonList("javax.persistence.UniqueConstraint");

    }
}
