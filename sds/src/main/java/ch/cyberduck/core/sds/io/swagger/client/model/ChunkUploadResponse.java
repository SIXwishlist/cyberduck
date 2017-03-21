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
 * ChunkUploadResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-21T19:15:03.115+01:00")
public class ChunkUploadResponse {
  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("hash")
  private String hash = null;

  public ChunkUploadResponse size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Chunk Size
   * @return size
  **/
  @ApiModelProperty(example = "null", required = true, value = "Chunk Size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public ChunkUploadResponse hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Hash value of transferred chunk
   * @return hash
  **/
  @ApiModelProperty(example = "null", required = true, value = "Hash value of transferred chunk")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChunkUploadResponse chunkUploadResponse = (ChunkUploadResponse) o;
    return Objects.equals(this.size, chunkUploadResponse.size) &&
        Objects.equals(this.hash, chunkUploadResponse.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, hash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChunkUploadResponse {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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

