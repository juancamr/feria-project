package modelo;

import java.util.List;

public class Chart {
    private int id;
    private String title;
    private String xName;
    private String yName;
    private List xData;
    private List yData;

    public Chart() {
    }

    private Chart(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.xName = builder.xName;
        this.yName = builder.yName;
        this.xData = builder.xData;
        this.yData = builder.yData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int id;
        private String title;
        private String xName;
        private String yName;
        private List<Object> xData;
        private List<Object> yData;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setXName(String xName) {
            this.xName = xName;
            return this;
        }

        public Builder setYName(String yName) {
            this.yName = yName;
            return this;
        }

        public Builder setXData(List<Object> xData) {
            this.xData = xData;
            return this;
        }

        public Builder setYData(List<Object> yData) {
            this.yData = yData;
            return this;
        }

        public Chart build() {
            return new Chart(this);
        }
    }

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
