/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.api.meta.model.declaration.fluent;

import static java.util.Collections.unmodifiableList;
import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.meta.model.transformer.TransformerModel;

import java.util.LinkedList;
import java.util.List;

/**
 * A declaration object for a {@link TransformerDeclaration}. It contains raw, unvalidated
 * data which is used to declare the structure of a {@link TransformerModel}
 *
 * @since 1.0
 */
public class TransformerDeclaration extends NamedDeclaration<TransformerDeclaration> {

  private final List<MetadataType> sourceTypes = new LinkedList<>();
  private MetadataType outputType;

  /**
   * Creates a new instance
   *
   * @param name the transformer's name
   */
  public TransformerDeclaration(String name) {
    super(name);
  }

  /**
   * Adds the given {@code sourceType} as one of the source types supported by the transformer
   *
   * @param sourceType a {@link MetadataType}
   * @return {@code this} declaration
   */
  public TransformerDeclaration addSourceType(MetadataType sourceType) {
    sourceTypes.add(sourceType);
    return this;
  }

  /**
   * Sets the transformer's output type
   *
   * @param outputType a {@link MetadataType}
   */
  public void setOutputType(MetadataType outputType) {
    this.outputType = outputType;
  }

  /**
   * @return The transformer's output type
   */
  public MetadataType getOutputType() {
    return outputType;
  }

  /**
   * Returns the types that the transformer accepts as source types.
   * All the items in the returned list will have previously be added
   * through {@link #addSourceType(MetadataType)}
   *
   * @return an immutable list. Might be empty but will never be {@code null}
   */
  public List<MetadataType> getSourceTypes() {
    return unmodifiableList(sourceTypes);
  }
}
