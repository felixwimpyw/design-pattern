package com.gdn.cc.designpattern.creational.prototype;

public class OperatingSystem {

  private String name;
  private String specification;
  private String logo;
  private String minimumMemory;
  private String computerName;
  private String documentName;

  public OperatingSystem(String name, String specification, String logo, String minimumMemory) {
    this.name = name;
    this.specification = specification;
    this.logo = logo;
    this.minimumMemory = minimumMemory;
  }

  @Override
  protected OperatingSystem clone() {
    return new OperatingSystem(computerName, specification, logo, minimumMemory);
  }

  public String getComputerName() {
    return computerName;
  }

  public String getDocumentName() {
    return documentName;
  }

  public String getLogo() {
    return logo;
  }

  public String getMinimumMemory() {
    return minimumMemory;
  }

  public String getName() {
    return name;
  }

  public String getSpecification() {
    return specification;
  }

  public void setComputerName(String computerName) {
    this.computerName = computerName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public void setMinimumMemory(String minimumMemory) {
    this.minimumMemory = minimumMemory;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSpecification(String specification) {
    this.specification = specification;
  }

  @Override
  public String toString() {
    return String.format(
        "OperatingSystem [name=%s, specification=%s, logo=%s, minimumMemory=%s, computerName=%s, documentName=%s]",
        name, specification, logo, minimumMemory, computerName, documentName);
  }


}
