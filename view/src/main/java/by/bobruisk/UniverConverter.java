package by.bobruisk;

import by.bobruisk.domain.Univers;
import org.apache.log4j.Logger;


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "univerConverter")
public class UniverConverter implements Converter {
    final static Logger logger = Logger.getLogger(UniverConverter.class);

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String univerId) {

        Univers univer =  UniverBin.getUniver(Integer.valueOf(univerId));

        return univer;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object univer) {
        logger.debug("FROM CONVERTER GETASSTRING univer "+ ((Univers)univer).getLabel());

        logger.debug("FROM CONVERTER GETASSTRING "+((Univers)univer).getId().toString());

        return ((Univers)univer).getId().toString();
    }
}
