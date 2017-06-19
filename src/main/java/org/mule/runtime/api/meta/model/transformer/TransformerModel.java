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

import java.util.List;

public interface TransformerModel extends NamedObject, DescribedObject, EnrichableModel {

  List<MetadataType> getSourceTypes();

  MetadataType getOutputType();
}