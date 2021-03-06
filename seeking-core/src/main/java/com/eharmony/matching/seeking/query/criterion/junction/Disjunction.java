/*
 *  Copyright 2012 eHarmony, Inc
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.eharmony.matching.seeking.query.criterion.junction;

import com.eharmony.matching.seeking.query.criterion.Criterion;
import com.eharmony.matching.seeking.query.criterion.Operator;

/**
 * Or
 */
public class Disjunction extends Junction {

    public Disjunction() {
        super(Operator.OR);
    }
    
    public Disjunction(Criterion... criteria) {
        this();
        addAll(criteria);
    }

}