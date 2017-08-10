package com.peektech.web.ui;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContentTest {

    @Test
    public void getPersonas() throws Exception {
        Content content = new Content();
        content.buildPersonas();

        Assert.assertEquals(content.getPersonas().size(), 10);
        for(int i=1; i<=10; i++) {
            Assert.assertEquals(content.getPersonas().get(i-1).getNombre(), "Nombre "+i);
            Assert.assertEquals(content.getPersonas().get(i-1).getApellidoPaterno(), "Paterno "+i);
            Assert.assertEquals(content.getPersonas().get(i-1).getApellidoMaterno(), "Materno "+i);
            Assert.assertEquals(content.getPersonas().get(i-1).getDireccion(), "Direccion "+i);
            Assert.assertEquals(content.getPersonas().get(i-1).getTelefono(), "Telefono "+i);
        }

    }

}