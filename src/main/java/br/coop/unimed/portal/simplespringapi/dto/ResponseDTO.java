package br.coop.unimed.portal.simplespringapi.dto;

public class ResponseDTO {

    private String description;

    public ResponseDTO(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
