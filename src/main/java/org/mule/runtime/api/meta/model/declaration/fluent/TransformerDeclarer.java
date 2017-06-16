/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.api.meta.model.declaration.fluent;

import static org.mule.runtime.api.util.Preconditions.checkArgument;
import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.meta.model.ModelProperty;

import java.util.stream.Stream;

public class TransformerDeclarer extends Declarer<TransformerDeclaration>
    implements HasModelProperties<TransformerDeclarer> {

  public TransformerDeclarer(TransformerDeclaration declaration) {
    super(declaration);
  }

  /**
   * Adds a description
   *
   * @param description a description
   * @return {@code this} declarer
   */
  public TransformerDeclarer describedAs(String description) {
    declaration.setDescription(description);
    return this;
  }

  public TransformerDeclarer withSourceType(MetadataType... sourceTypes) {
    checkArgument(sourceTypes != null && sourceTypes.length > 0, "sourceTypes cannot be null nor empty");
    Stream.of(sourceTypes).forEach(declaration::addSourceType);
    return this;
  }

  public TransformerDeclarer withOutput(MetadataType outputType) {
    declaration.setOutputType(outputType);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public TransformerDeclarer withModelProperty(ModelProperty modelProperty) {
    declaration.addModelProperty(modelProperty);
    return this;
  }
}
