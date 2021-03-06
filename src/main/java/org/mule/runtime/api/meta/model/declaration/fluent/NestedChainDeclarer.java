/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.api.meta.model.declaration.fluent;

/**
 * Allows configuring a {@link NestedComponentDeclaration} through a fluent API
 *
 * @since 1.0
 */
public class NestedChainDeclarer extends NestedComponentDeclarer<NestedChainDeclarer, NestedChainDeclaration> {

  /**
   * Creates a new instance
   *
   * @param declaration the {@link NestedComponentDeclaration} to be configured
   */
  public NestedChainDeclarer(NestedChainDeclaration declaration) {
    super(declaration);
  }

  public NestedChainDeclarer setRequired(boolean required) {
    declaration.setRequired(required);
    return this;
  }

}
