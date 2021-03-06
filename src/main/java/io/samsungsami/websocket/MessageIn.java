package io.samsungsami.websocket;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * 
 **/
@ApiModel(description = "SAMI Message In")
public class MessageIn  {
  
  private Map<String, Object> data = new HashMap<String, Object>() ;
  
  private String cid = null;
  private String ddid = null;
  private String sdid = null;
  private BigDecimal ts = null;
  private String type = "message";
  
  /**
   * Confirmation ID.
   **/
  @ApiModelProperty(required = false, value = "Confirmation ID.")
  @JsonProperty("cid")
  public String getCid() {
    return cid;
  }
  public void setCid(String cid) {
    this.cid = cid;
  }   

  /**
   * Type.
   **/
  @ApiModelProperty(required = false, value = "Type.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }  
  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("data")
  public Map<String, Object> getData() {
    return data;
  }
  public void setData(Map<String, Object> data) {
    this.data = data;
  }

  /**
   * Destination Device ID.
   **/
  @ApiModelProperty(required = false, value = "Destination Device ID.")
  @JsonProperty("ddid")
  public String getDdid() {
    return ddid;
  }
  public void setDdid(String ddid) {
    this.ddid = ddid;
  }
  
  /**
   * Source Device ID.
   **/
  @ApiModelProperty(required = false, value = "Source Device ID.")
  @JsonProperty("sdid")
  public String getSdid() {
    return sdid;
  }
  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  
  /**
   * Timestamp (past, present or future). Defaults to current time if not provided.
   **/
  @ApiModelProperty(required = false, value = "Timestamp (past, present or future). Defaults to current time if not provided.")
  @JsonProperty("ts")
  public BigDecimal getTs() {
    return ts;
  }
  public void setTs(BigDecimal ts) {
    this.ts = ts;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageIn {\n");
    
    sb.append("  cid:   ").append(cid).append("\n");
    sb.append("  data:  ").append(data).append("\n");
    sb.append("  ddid:  ").append(ddid).append("\n");
    sb.append("  sdid:  ").append(sdid).append("\n");
    sb.append("  ts:    ").append(ts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
