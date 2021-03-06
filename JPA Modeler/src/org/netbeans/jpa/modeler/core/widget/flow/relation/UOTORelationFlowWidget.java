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
package org.netbeans.jpa.modeler.core.widget.flow.relation;

import org.netbeans.jpa.modeler.core.widget.EntityWidget;
import org.netbeans.jpa.modeler.core.widget.relation.flow.direction.Unidirectional;
import org.netbeans.modeler.specification.model.document.IModelerScene;
import org.netbeans.modeler.widget.edge.info.EdgeWidgetInfo;

/**
 *
 * @author Gaurav_Gupta
 */
public class UOTORelationFlowWidget extends OTORelationFlowWidget implements Unidirectional {

    private EntityWidget targetEntityWidget;

    public UOTORelationFlowWidget(IModelerScene scene, EdgeWidgetInfo edge) {
        super(scene, edge);
    }

    /**
     * @return the targetEntityWidget
     */
    @Override
    public EntityWidget getTargetEntityWidget() {
        return targetEntityWidget;
    }

    /**
     * @param targetEntityWidget the targetEntityWidget to set
     */
    @Override
    public void setTargetEntityWidget(EntityWidget targetEntityWidget) {
        this.targetEntityWidget = targetEntityWidget;
    }

}
