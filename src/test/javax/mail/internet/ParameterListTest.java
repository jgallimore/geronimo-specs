/**
 *
 * Copyright 2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package javax.mail.internet;
import junit.framework.TestCase;
/**
 * @version $Revision: 1.2 $ $Date: 2004/02/25 09:59:11 $
 */
public class ParameterListTest extends TestCase {
    public ParameterListTest(String arg0) {
        super(arg0);
    }
    public void testParameters() throws ParseException {
        ParameterList list =
            new ParameterList("thing=value;thong=vulue;thung=git");
        assertEquals("value", list.get("thing"));
        assertEquals("vulue", list.get("thong"));
        assertEquals("git", list.get("thung"));
    }
}
