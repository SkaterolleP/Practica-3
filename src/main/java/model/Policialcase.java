package model;
// Generated 09-abr-2019 16:59:43 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Policialcase generated by hbm2java
 */
public class Policialcase  implements java.io.Serializable {


     private String codcaso;
     private String name;
     private Date startdate;
     private Date enddate;
     private Set collaborateses = new HashSet(0);

    public Policialcase() {
    }

	
    public Policialcase(String codcaso) {
        this.codcaso = codcaso;
    }
    public Policialcase(String codcaso, String name, Date startdate, Date enddate, Set collaborateses) {
       this.codcaso = codcaso;
       this.name = name;
       this.startdate = startdate;
       this.enddate = enddate;
       this.collaborateses = collaborateses;
    }
   
    public String getCodcaso() {
        return this.codcaso;
    }
    
    public void setCodcaso(String codcaso) {
        this.codcaso = codcaso;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Date getStartdate() {
        return this.startdate;
    }
    
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }
    public Date getEnddate() {
        return this.enddate;
    }
    
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
    public Set getCollaborateses() {
        return this.collaborateses;
    }
    
    public void setCollaborateses(Set collaborateses) {
        this.collaborateses = collaborateses;
    }




}


