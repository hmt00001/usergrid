/*******************************************************************************
 * Copyright 2012 Apigee Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.usergrid.rest.exceptions;


import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.usergrid.persistence.exceptions.EntityNotFoundException;

import static javax.ws.rs.core.Response.Status.NOT_FOUND;


@Provider
public class EntityNotFoundExceptionMapper extends AbstractExceptionMapper<EntityNotFoundException>
{

    @Override
    public Response toResponse( EntityNotFoundException e )
    {
        return toResponse( NOT_FOUND, e );
    }
}
