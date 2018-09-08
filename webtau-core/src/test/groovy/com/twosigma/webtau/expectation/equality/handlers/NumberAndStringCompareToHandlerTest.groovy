/*
 * Copyright 2018 TWO SIGMA OPEN SOURCE, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.twosigma.webtau.expectation.equality.handlers

import org.junit.Test

import static com.twosigma.webtau.Ddjt.actual
import static com.twosigma.webtau.Ddjt.beGreaterThan
import static com.twosigma.webtau.Ddjt.equal

class NumberAndStringCompareToHandlerTest {
    @Test
    void "handles string as actual and number as expected"() {
        def handler = new NumberAndStringCompareToHandler()
        assert handler.handleEquality("100", 43)
        assert !handler.handleEquality(100, 43)

        assert handler.handleGreaterLessEqual("100", 43)
        assert !handler.handleGreaterLessEqual(100, 43)
    }

    @Test
    void "automatically convert string to a number for equality comparison"() {
        actual("100.54").should(equal(100.54))
    }

    @Test
    void "automatically convert string to a number for greater-less comparison"() {
        actual("100.54").should(beGreaterThan(30))
    }
}