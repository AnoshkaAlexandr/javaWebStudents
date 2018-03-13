package by.bobruisk;

import by.bobruisk.domain.Univers;
import by.bobruisk.ejb.UniverManagerBin;
import org.apache.log4j.Logger;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@ManagedBean
@SessionScoped
public class UniverBin implements Serializable {
    final static Logger logger = Logger.getLogger(UniverBin.class);

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

    public static Univers getUniver(Integer id) {
        for (Univers uni : univers) {
            if (id.equals(uni.getId())) {

                return uni;
            }
        }
        return null;
    }


}
