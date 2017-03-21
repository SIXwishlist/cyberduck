/*
 * Secure Data Space API
 * Version 4.1.2 - built at: 2017-03-02 18:50:25, API server: https://sds.ssp-europe.eu/api/v4
 *
 * OpenAPI spec version: 4.1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * RestoreDeletedNodesRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-21T19:15:03.115+01:00")
public class RestoreDeletedNodesRequest {
  @JsonProperty("deletedNodeIds")
  private List<Long> deletedNodeIds = new ArrayList<Long>();

  /**
   * File/Folder name conflict resolution strategy. (default: Autorename)
   */
  public enum ResolutionStrategyEnum {
    AUTORENAME("autorename"),
    
    OVERWRITE("overwrite"),
    
    FAIL("fail");

    private String value;

    ResolutionStrategyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResolutionStrategyEnum fromValue(String text) {
      for (ResolutionStrategyEnum b : ResolutionStrategyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("resolutionStrategy")
  private ResolutionStrategyEnum resolutionStrategy = null;

  @JsonProperty("parentId")
  private Long parentId = null;

  public RestoreDeletedNodesRequest deletedNodeIds(List<Long> deletedNodeIds) {
    this.deletedNodeIds = deletedNodeIds;
    return this;
  }

  public RestoreDeletedNodesRequest addDeletedNodeIdsItem(Long deletedNodeIdsItem) {
    this.deletedNodeIds.add(deletedNodeIdsItem);
    return this;
  }

   /**
   * Get deletedNodeIds
   * @return deletedNodeIds
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<Long> getDeletedNodeIds() {
    return deletedNodeIds;
  }

  public void setDeletedNodeIds(List<Long> deletedNodeIds) {
    this.deletedNodeIds = deletedNodeIds;
  }

  public RestoreDeletedNodesRequest resolutionStrategy(ResolutionStrategyEnum resolutionStrategy) {
    this.resolutionStrategy = resolutionStrategy;
    return this;
  }

   /**
   * File/Folder name conflict resolution strategy. (default: Autorename)
   * @return resolutionStrategy
  **/
  @ApiModelProperty(example = "null", value = "File/Folder name conflict resolution strategy. (default: Autorename)")
  public ResolutionStrategyEnum getResolutionStrategy() {
    return resolutionStrategy;
  }

  public void setResolutionStrategy(ResolutionStrategyEnum resolutionStrategy) {
    this.resolutionStrategy = resolutionStrategy;
  }

  public RestoreDeletedNodesRequest parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Node parent ID. (default: Old parent ID)
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "Node parent ID. (default: Old parent ID)")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreDeletedNodesRequest restoreDeletedNodesRequest = (RestoreDeletedNodesRequest) o;
    return Objects.equals(this.deletedNodeIds, restoreDeletedNodesRequest.deletedNodeIds) &&
        Objects.equals(this.resolutionStrategy, restoreDeletedNodesRequest.resolutionStrategy) &&
        Objects.equals(this.parentId, restoreDeletedNodesRequest.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedNodeIds, resolutionStrategy, parentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreDeletedNodesRequest {\n");
    
    sb.append("    deletedNodeIds: ").append(toIndentedString(deletedNodeIds)).append("\n");
    sb.append("    resolutionStrategy: ").append(toIndentedString(resolutionStrategy)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

