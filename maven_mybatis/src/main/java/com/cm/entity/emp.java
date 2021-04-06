package com.cm.entity;

public class emp {
    private int eid;
    private String ename;
    private String esex;
    private String etel;
    private String eemail;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex;
    }

    public String getEtel() {
        return etel;
    }

    public void setEtel(String etel) {
        this.etel = etel;
    }

    public String getEemail() {
        return eemail;
    }

    public void setEemail(String eemail) {
        this.eemail = eemail;
    }

    public emp() {
    }

    public emp(int eid, String ename, String esex, String etel, String eemail) {
        this.eid = eid;
        this.ename = ename;
        this.esex = esex;
        this.etel = etel;
        this.eemail = eemail;
    }

    @Override
    public String toString() {
        return "emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", esex='" + esex + '\'' +
                ", etel='" + etel + '\'' +
                ", eemail='" + eemail + '\'' +
                '}';
    }
}
