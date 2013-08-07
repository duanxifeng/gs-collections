/*
 * Copyright 2013 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gs.collections.impl.bag.immutable.primitive;

import com.gs.collections.impl.test.Verify;
import org.junit.Test;

public class ImmutableCharHashBagTest
{
    @Test
    public void serializedForm()
    {
        Verify.assertSerializedForm(
                1L,
                "rO0ABXNyAGdjb20uZ3MuY29sbGVjdGlvbnMuaW1wbC5iYWcuaW1tdXRhYmxlLnByaW1pdGl2ZS5J\n"
                        + "bW11dGFibGVDaGFySGFzaEJhZyRJbW11dGFibGVDaGFyQmFnU2VyaWFsaXphdGlvblByb3h5AAAA\n"
                        + "AAAAAAEMAAB4cHcQAAAAAgBhAAAAAQBiAAAAAXg=",
                ImmutableCharHashBag.newBagWith('a', 'b'));
    }
}
