/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.api.meta.model.transformer;

import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.meta.DescribedObject;
import org.mule.runtime.api.meta.NamedObject;
import org.mule.runtime.api.meta.model.EnrichableModel;
import org.mule.runtime.api.meta.model.operation.OperationModel;

import java.util.List;

/**
 * Represents a transformer that the extension contributes to the runtime.
 * <p>
 * A transformer is an entity capable of transforming an input of a fixed number of types
 * and transforms it into another value of a unique output type.
 * <p>
 * Transformers are not components. Unlike operations, they can be explicitly accessed through
 * the Mule DSL (event though an operation could be in the business of transforming values as well).
 * Transformers are automatically and transparently applied by the runtime in order to automatically adapt
 * values to be usable across components without requiring the user to explicitly provide the transformations
 *
 * @see OperationModel
 * @since 1.0
 */
public interface TransformerModel extends NamedObject, DescribedObject, EnrichableModel {

  /**
   * Returns the types that the represented transformer is capable of accepting.
   *
   * @return an immutable {@link List}. Will have at least one item and will never be {@code null}
   */
  List<MetadataType> getSourceTypes();

  /**
   * @return The type of the values produced by the transformer
   */
  MetadataType getOutputType();
}
