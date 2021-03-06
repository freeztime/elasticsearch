/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.analytics.stringstats;

import org.elasticsearch.search.DocValueFormat;
import org.elasticsearch.search.aggregations.Aggregator;
import org.elasticsearch.search.aggregations.support.AggregatorSupplier;
import org.elasticsearch.search.aggregations.support.ValuesSource;
import org.elasticsearch.search.internal.SearchContext;

import java.io.IOException;
import java.util.Map;

public interface StringStatsAggregatorSupplier extends AggregatorSupplier {

    Aggregator build(String name,
                     ValuesSource valuesSource,
                     boolean showDistribution,
                     DocValueFormat format,
                     SearchContext context,
                     Aggregator parent,
                     Map<String, Object> metadata) throws IOException;
}
