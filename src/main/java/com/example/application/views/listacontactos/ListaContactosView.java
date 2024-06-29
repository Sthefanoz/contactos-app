package com.example.application.views.listacontactos;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Lista Contactos")
@Route(value = "lista-contactos2", layout = MainLayout.class)
public class ListaContactosView extends Composite<VerticalLayout> {

    public ListaContactosView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
