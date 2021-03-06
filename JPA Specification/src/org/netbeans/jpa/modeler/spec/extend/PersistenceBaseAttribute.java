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
package org.netbeans.jpa.modeler.spec.extend;

import javax.xml.bind.Marshaller;
import org.netbeans.jpa.modeler.spec.Column;
import org.netbeans.modeler.core.NBModelerUtil;

/**
 *
 * @author Gaurav Gupta
 */
public abstract class PersistenceBaseAttribute extends BaseAttribute {

    void beforeMarshal(Marshaller marshaller) {
        if (NBModelerUtil.isEmptyObject(getColumn())) {
            setColumn(null);
        }
    }

    /**
     * Gets the value of the column property.
     *
     * @return possible object is {@link Column }
     *
     */
    public abstract Column getColumn();

    /**
     * Sets the value of the column property.
     *
     * @param value allowed object is {@link Column }
     *
     */
    public abstract void setColumn(Column value);
}
