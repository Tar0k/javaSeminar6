import java.util.Date;

public class Notebook {
    private String model;
    private String manufacturer;
    private Date productionDate;
    private Integer memory;
    private Integer hddSize;
    private String os;
    private String color;

    public Notebook(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public Notebook() {
        this("UNKNOWN", "UNKNOWN");
    }

    //region getters_setters
    public String getModel() {
        return model;
    }
    public void setModel(String Model) {
        this.model = Model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public void setHddSize(Integer hddSize) {
        this.hddSize = hddSize;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getHddSize() {
        return hddSize;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }
    //endregion
    @Override
    public String toString() {
        return String.format("Модель: %s, Производитель: %s, Оперативная память: %d Гбайт, HDD: %d Гбайт, OS: %s, color: %s", model, manufacturer, memory, hddSize, os, color);
    }
}
