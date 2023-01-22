package eng.shishov.rainsansorclient.dto;

import java.util.List;

public class MeasurementsList {
    private List<MeasurementDTO> measurementDTOList;

    public MeasurementsList(){

    }

    public MeasurementsList(List<MeasurementDTO> measurementDTOList) {
        this.measurementDTOList = measurementDTOList;
    }

    public List<MeasurementDTO> getMeasurementDTOList() {
        return measurementDTOList;
    }

    public void setMeasurementDTOList(List<MeasurementDTO> measurementDTOList) {
        this.measurementDTOList = measurementDTOList;
    }
}
