/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.transformer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.model.DataFormatDefinition;
import org.apache.camel.spi.Metadata;

/**
 * To configure transforms.
 */
@Metadata(label = "transformation", title = "Transformations")
@XmlRootElement(name = "transformers")
@XmlAccessorType(XmlAccessType.FIELD)
public class TransformersDefinition {

    @XmlElements({
        @XmlElement(required = false, name = "dataFormatTransformer", type = DataFormatTransformerDefinition.class),
        @XmlElement(required = false, name = "endpointTransformer", type = EndpointTransformerDefinition.class),
        @XmlElement(required = false, name = "customTransformer", type = CustomTransformerDefinition.class)}
        )
    private List<TransformerDefinition> transforms;

    /**
     * A list holding the configured transformations
     */
    public void setTransformers(List<TransformerDefinition> transforms) {
        this.transforms = transforms;
    }

    public List<TransformerDefinition> getTransforms() {
        return transforms;
    }

}