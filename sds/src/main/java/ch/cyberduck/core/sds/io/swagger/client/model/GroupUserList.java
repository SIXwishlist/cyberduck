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
import ch.cyberduck.core.sds.io.swagger.client.model.GroupUser;
import ch.cyberduck.core.sds.io.swagger.client.model.Range;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * GroupUserList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-21T19:15:03.115+01:00")
public class GroupUserList {
  @JsonProperty("range")
  private Range range = null;

  @JsonProperty("items")
  private List<GroupUser> items = new ArrayList<GroupUser>();

  public GroupUserList range(Range range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Range getRange() {
    return range;
  }

  public void setRange(Range range) {
    this.range = range;
  }

  public GroupUserList items(List<GroupUser> items) {
    this.items = items;
    return this;
  }

  public GroupUserList addItemsItem(GroupUser itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<GroupUser> getItems() {
    return items;
  }

  public void setItems(List<GroupUser> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupUserList groupUserList = (GroupUserList) o;
    return Objects.equals(this.range, groupUserList.range) &&
        Objects.equals(this.items, groupUserList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupUserList {\n");
    
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

