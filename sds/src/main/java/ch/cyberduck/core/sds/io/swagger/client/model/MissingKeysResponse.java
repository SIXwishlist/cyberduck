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
import ch.cyberduck.core.sds.io.swagger.client.model.FileFileKeys;
import ch.cyberduck.core.sds.io.swagger.client.model.Range;
import ch.cyberduck.core.sds.io.swagger.client.model.UserIdFileIdItem;
import ch.cyberduck.core.sds.io.swagger.client.model.UserUserPublicKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * MissingKeysResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-21T19:15:03.115+01:00")
public class MissingKeysResponse {
  @JsonProperty("range")
  private Range range = null;

  @JsonProperty("items")
  private List<UserIdFileIdItem> items = new ArrayList<UserIdFileIdItem>();

  @JsonProperty("users")
  private List<UserUserPublicKey> users = new ArrayList<UserUserPublicKey>();

  @JsonProperty("files")
  private List<FileFileKeys> files = new ArrayList<FileFileKeys>();

  public MissingKeysResponse range(Range range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @ApiModelProperty(example = "null", value = "")
  public Range getRange() {
    return range;
  }

  public void setRange(Range range) {
    this.range = range;
  }

  public MissingKeysResponse items(List<UserIdFileIdItem> items) {
    this.items = items;
    return this;
  }

  public MissingKeysResponse addItemsItem(UserIdFileIdItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<UserIdFileIdItem> getItems() {
    return items;
  }

  public void setItems(List<UserIdFileIdItem> items) {
    this.items = items;
  }

  public MissingKeysResponse users(List<UserUserPublicKey> users) {
    this.users = users;
    return this;
  }

  public MissingKeysResponse addUsersItem(UserUserPublicKey usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<UserUserPublicKey> getUsers() {
    return users;
  }

  public void setUsers(List<UserUserPublicKey> users) {
    this.users = users;
  }

  public MissingKeysResponse files(List<FileFileKeys> files) {
    this.files = files;
    return this;
  }

  public MissingKeysResponse addFilesItem(FileFileKeys filesItem) {
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FileFileKeys> getFiles() {
    return files;
  }

  public void setFiles(List<FileFileKeys> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissingKeysResponse missingKeysResponse = (MissingKeysResponse) o;
    return Objects.equals(this.range, missingKeysResponse.range) &&
        Objects.equals(this.items, missingKeysResponse.items) &&
        Objects.equals(this.users, missingKeysResponse.users) &&
        Objects.equals(this.files, missingKeysResponse.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, items, users, files);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissingKeysResponse {\n");
    
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

