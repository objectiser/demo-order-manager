/*
 * Copyright 2015-2017 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.hawkular.apm.example.ordermgr.orders;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

/**
 * @author Gary Brown
 */
@Path("/")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class OrdersHandler {

    private Client client = ClientBuilder.newClient();

    @POST
    @Path("/orders")
    public Response placeOrder(Order order) {
    	System.out.println("ORDER = "+order);
    	Response accountResp = client.target("http://localhost:3001/accounts/"+order.getAccountId()).request().get();
    	if (accountResp.getStatus() >= 400) {
    		return Response.status(accountResp.getStatus()).entity(accountResp.readEntity(String.class)).build();
    	}
    	Account acct = accountResp.readEntity(Account.class);
    	evaluateAccount(acct);
        return Response.ok().entity(order).build();
    }

    public void evaluateAccount(Account account) {
    	System.out.println("EVALUATING ACCOUNT: "+account);
    }
}
