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

package javax.mail.search;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
/**
 * @version $Revision: 1.2 $ $Date: 2004/02/25 09:59:09 $
 */
public final class RecipientStringTerm extends AddressStringTerm {
    private Message.RecipientType _type;
    public RecipientStringTerm(Message.RecipientType type, String pattern) {
        super(pattern);
        this._type = type;
    }
    public boolean equals(Object other) {
        return super.equals(other)
            && ((RecipientStringTerm) other)._type == _type;
    }
    public Message.RecipientType getRecipientType() {
        return _type;
    }
    public int hashCode() {
        return super.hashCode() + _type.hashCode();
    }
    public boolean match(Message message) {
        try {
            Address from[] = message.getFrom();
            boolean result = false;
            for (int i = 0; !result && i < from.length; i++) {
                result = match(from[i]);
            }
            return result;
        } catch (MessagingException e) {
            return false;
        }
    }
}
