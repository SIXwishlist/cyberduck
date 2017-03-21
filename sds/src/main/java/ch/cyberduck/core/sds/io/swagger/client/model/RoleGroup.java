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

/**
 * RoleGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-21T19:15:03.115+01:00")
public class RoleGroup {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("isMember")
  private Boolean isMember = null;

  @JsonProperty("name")
  private String name = null;

  public RoleGroup id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Group ID
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "Group ID")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RoleGroup isMember(Boolean isMember) {
    this.isMember = isMember;
    return this;
  }

   /**
   * Is group member of the role
   * @return isMember
  **/
  @ApiModelProperty(example = "null", required = true, value = "Is group member of the role")
  public Boolean getIsMember() {
    return isMember;
  }

  public void setIsMember(Boolean isMember) {
    this.isMember = isMember;
  }

  public RoleGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Group name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "Group name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleGroup roleGroup = (RoleGroup) o;
    return Objects.equals(this.id, roleGroup.id) &&
        Objects.equals(this.isMember, roleGroup.isMember) &&
        Objects.equals(this.name, roleGroup.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isMember, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

