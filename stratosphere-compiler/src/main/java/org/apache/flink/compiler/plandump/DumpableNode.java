/***********************************************************************************************************************
 * Copyright (C) 2010-2013 by the Apache Flink project (http://flink.incubator.apache.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 **********************************************************************************************************************/
package org.apache.flink.compiler.plandump;

import org.apache.flink.compiler.dag.OptimizerNode;
import org.apache.flink.compiler.plan.PlanNode;

/**
 *
 */
public interface DumpableNode<T extends DumpableNode<T>> {
	
	/**
	 * Gets an iterator over the predecessors.
	 * 
	 * @return An iterator over the predecessors.
	 */
	Iterable<T> getPredecessors();
	
	Iterable<DumpableConnection<T>> getDumpableInputs();
	
	OptimizerNode getOptimizerNode();
	
	PlanNode getPlanNode();
}