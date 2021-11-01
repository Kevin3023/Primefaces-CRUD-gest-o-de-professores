/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.converter;

import com.mycompany.entidade.Instituto;
import com.mycompany.rn.InstitutoRN;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Kevin
 */
@FacesConverter(value = "institutoConverter")
public class InstitutoConverter implements Converter {

    private InstitutoRN RN = new InstitutoRN();
    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if (string == null || string.trim().isEmpty() || "null".equalsIgnoreCase(string)) {
            return null;
        }
        try {
            return RN.obter(Integer.valueOf(string));
        } catch (Exception e) {
            return null;
        }
    }
    
    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        if (o == null || !(o instanceof Instituto)) {
            return null;
        }
        Instituto instituto = (Instituto) o;
        if (instituto.getId() == null) {
            return null;
        }
        return String.valueOf(instituto.getId());
    }
}
