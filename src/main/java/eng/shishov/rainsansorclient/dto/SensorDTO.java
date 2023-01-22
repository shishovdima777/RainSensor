package eng.shishov.rainsansorclient.dto;



public class SensorDTO {
    public SensorDTO(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
