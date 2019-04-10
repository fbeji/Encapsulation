package edu.cnm.deepdive;

import java.util.Date;

public class TrackingInfo {

  private Date recorded;

  private String details;

  public TrackingInfo(Date recorded, String details) {
    this.recorded = recorded;
    this.details = details;
  }

  public Date getRecorded() {
    return recorded;
  }

  public String getDetails() {
    return details;
  }
}
