package by.bobruisk;

import by.bobruisk.domain.Univers;


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "univerConverter")
public class UniverConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String univerId) {

        return UniverBin.getUniver(Long.valueOf(univerId));
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object univer) {
        return ((Univers)univer).getUniverId()+"";
    }
}
