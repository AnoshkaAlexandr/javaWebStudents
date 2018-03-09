package by.bobruisk;

import by.bobruisk.domain.Univers;
import by.bobruisk.ejb.UniverManagerBin;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Named
@SessionScoped
public class UniverBin implements Serializable {
    @EJB
    private UniverManagerBin univerManagerBin;
    private String label;
    private static List<Univers> univers;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void addUniver() {
        univerManagerBin.addUniver(label);
    }


    public Date getTime() {
        return new Date();
    }


    public List<Univers> getAllUnivers() {

      univers = univerManagerBin.getAllUnivers();
        return univers;
    }

    public static  Univers getUniver(long id){
        for(Univers uni:univers){
            if(id==uni.getUniverId()){
                return uni;
            }
        }
        return null;
    }

}
