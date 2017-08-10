package com.peektech.web.ui;

import com.peektech.web.ui.model.Persona;
import org.primefaces.event.RowEditEvent;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name="content")
public class Content {
    private List<Persona> personas = new ArrayList<Persona>();

    public List<Persona> getPersonas() {
        return personas;
    }

    @PostConstruct
    private void buildPersonas() {
        for(int i=1; i<=10; i++) {
            Persona persona = new Persona();
            persona.setNombre("Nombre "+i);
            persona.setApellidoPaterno("Paterno "+i);
            persona.setApellidoMaterno("Materno "+i);
            persona.setDireccion("Direccion "+i);
            persona.setTelefono("Telefono "+i);

            personas.add(persona);
        }
    }

    public void onRowEdit(RowEditEvent event) {
        Persona persona = (Persona) event.getObject();
        String mesagge = "Nuevo nombre "+persona.getNombre()+" "+persona.getApellidoPaterno()+" "+persona.getApellidoMaterno();
        FacesMessage msg = new FacesMessage("", mesagge);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowCancel(RowEditEvent event) {
    }
}
