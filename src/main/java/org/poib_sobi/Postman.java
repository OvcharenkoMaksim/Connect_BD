package org.poib_sobi;

public class Postman {
    // постоянный класс для связывания
    public String name;
    public String systemname;
    public String externalsystemid;
    public int userinfoid;

    public Postman() {}
    public Postman (String name, String systemname, String externalsystemid, int userinfoid){
        this.name=name;
        this.systemname=systemname;
        this.externalsystemid=externalsystemid;
        this.userinfoid=userinfoid;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSystemname() {
        return systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname;
    }

    public String getExternalsystemid() {
        return externalsystemid;
    }

    public void setExternalsystemid(String externalsystemid) {
        this.externalsystemid = externalsystemid;
    }

    public int getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(int userinfoid) {
        this.userinfoid = userinfoid;
    }
}
