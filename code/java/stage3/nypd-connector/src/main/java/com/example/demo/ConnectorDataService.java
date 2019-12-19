/********************************************************************************
# * Licensed Materials - Property of IBM
# * (C) Copyright IBM Corporation 2019. All Rights Reserved
# *
# * This program and the accompanying materials are made available under the
# * terms of the Eclipse Public License 2.0 which is available at
# * http://www.eclipse.org/legal/epl-2.0.
# *
# * US Government Users Restricted Rights - Use, duplication or
# * disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
# *
# ********************************************************************************/

package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.rest.transport.ConnectorResponse;
import com.example.demo.rest.transport.EntityData;
import com.example.demo.rest.transport.LinkData;

import org.springframework.stereotype.Service;

/**
 * Used to populate entity lists and link lists to return to the ANBP
 */
@Service
public class ConnectorDataService {

    /**
     * Used to populate entity lists and link lists to return to the ANBP
     * @return A connectorResponse with the entities and links
     */
    public ConnectorResponse retrieveTestData() {
        final List<EntityData> entities = new ArrayList<>();
        final List<LinkData> links = new ArrayList<>();
        // TODO: Populate entity and link lists with some test data and see that it is returned to ANBP
        final ConnectorResponse connectorResponse = new ConnectorResponse();
        connectorResponse.entities = entities;
        connectorResponse.links = links;
        return connectorResponse;
    }
}