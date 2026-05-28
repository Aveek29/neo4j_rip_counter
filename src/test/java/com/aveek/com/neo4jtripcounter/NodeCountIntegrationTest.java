package com.aveek.com.neo4jtripcounter;

import com.graphaware.test.integration.NeoServerIntegrationTest;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static com.graphaware.test.util.TestUtils.get;
import static org.junit.Assert.assertEquals;

public class NodeCountIntegrationTest extends NeoServerIntegrationTest {

    @Test
    public void apiShouldBeMounted() {
        assertEquals("0", get(baseUrl() + "/graphaware/count", HttpStatus.SC_OK));
    }
}
