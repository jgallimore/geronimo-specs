/*
 * #%L
 * Apache Geronimo JAX-RS Spec 2.0
 * %%
 * Copyright (C) 2003 - 2014 The Apache Software Foundation
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package javax.ws.rs;

import javax.ws.rs.core.Response;


public class NotSupportedException extends ClientErrorException {

    private static final long serialVersionUID = -8286622745725405656L;


    public NotSupportedException() {
        super(Response.Status.UNSUPPORTED_MEDIA_TYPE);
    }


    public NotSupportedException(String message) {
        super(message, Response.Status.UNSUPPORTED_MEDIA_TYPE);
    }


    public NotSupportedException(Response response) {
        super(validate(response, Response.Status.UNSUPPORTED_MEDIA_TYPE));
    }


    public NotSupportedException(String message, Response response) {
        super(message, validate(response, Response.Status.UNSUPPORTED_MEDIA_TYPE));
    }


    public NotSupportedException(Throwable cause) {
        super(Response.Status.UNSUPPORTED_MEDIA_TYPE, cause);
    }


    public NotSupportedException(String message, Throwable cause) {
        super(message, Response.Status.UNSUPPORTED_MEDIA_TYPE, cause);
    }


    public NotSupportedException(Response response, Throwable cause) {
        super(validate(response, Response.Status.UNSUPPORTED_MEDIA_TYPE), cause);
    }


    public NotSupportedException(String message, Response response, Throwable cause) {
        super(message, validate(response, Response.Status.UNSUPPORTED_MEDIA_TYPE), cause);
    }
}
