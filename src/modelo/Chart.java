package modelo;

import java.util.List;

public class Chart {
    private int id;
    private String title;
    private String xName;
    private String yName;
    private List xData;
    private List yData;
    
    public Chart() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getxName() {
        return xName;
    }

    public void setxName(String xName) {
        this.xName = xName;
    }

    public String getyName() {
        return yName;
    }

    public void setyName(String yName) {
        this.yName = yName;
    }

    public List getxData() {
        return xData;
    }

    public void setxData(List xData) {
        this.xData = xData;
    }

    public List getyData() {
        return yData;
    }

    public void setyData(List yData) {
        this.yData = yData;
    }
}
