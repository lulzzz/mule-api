/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.api.meta.model.declaration.fluent;

import static java.util.Collections.unmodifiableList;
import org.mule.metadata.api.model.MetadataType;

import java.util.LinkedList;
import java.util.List;

public class TransformerDeclaration extends NamedDeclaration<TransformerDeclaration> {

  private final List<MetadataType> sourceTypes = new LinkedList<>();
  private MetadataType outputType;

  public TransformerDeclaration(String name) {
    super(name);
  }

  public TransformerDeclaration addSourceType(MetadataType sourceType) {
    sourceTypes.add(sourceType);
    return this;
  }

  public void setOutputType(MetadataType outputType) {
    this.outputType = outputType;
  }

  public MetadataType getOutputType() {
    return outputType;
  }

  public List<MetadataType> getSourceTypes() {
    return unmodifiableList(sourceTypes);
  }
}
