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
 * ResetPasswordTokenValidateResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-21T19:15:03.115+01:00")
public class ResetPasswordTokenValidateResponse {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("allowSystemGlobalWeakPassword")
  private Boolean allowSystemGlobalWeakPassword = null;

  public ResetPasswordTokenValidateResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Job title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "Job title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ResetPasswordTokenValidateResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name
   * @return firstName
  **/
  @ApiModelProperty(example = "null", required = true, value = "First name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ResetPasswordTokenValidateResponse gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Gender key, one of [m|f|n]
   * @return gender
  **/
  @ApiModelProperty(example = "null", value = "Gender key, one of [m|f|n]")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public ResetPasswordTokenValidateResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name
   * @return lastName
  **/
  @ApiModelProperty(example = "null", required = true, value = "Last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ResetPasswordTokenValidateResponse allowSystemGlobalWeakPassword(Boolean allowSystemGlobalWeakPassword) {
    this.allowSystemGlobalWeakPassword = allowSystemGlobalWeakPassword;
    return this;
  }

   /**
   * Allow weak password
   * @return allowSystemGlobalWeakPassword
  **/
  @ApiModelProperty(example = "null", value = "Allow weak password")
  public Boolean getAllowSystemGlobalWeakPassword() {
    return allowSystemGlobalWeakPassword;
  }

  public void setAllowSystemGlobalWeakPassword(Boolean allowSystemGlobalWeakPassword) {
    this.allowSystemGlobalWeakPassword = allowSystemGlobalWeakPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetPasswordTokenValidateResponse resetPasswordTokenValidateResponse = (ResetPasswordTokenValidateResponse) o;
    return Objects.equals(this.title, resetPasswordTokenValidateResponse.title) &&
        Objects.equals(this.firstName, resetPasswordTokenValidateResponse.firstName) &&
        Objects.equals(this.gender, resetPasswordTokenValidateResponse.gender) &&
        Objects.equals(this.lastName, resetPasswordTokenValidateResponse.lastName) &&
        Objects.equals(this.allowSystemGlobalWeakPassword, resetPasswordTokenValidateResponse.allowSystemGlobalWeakPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, firstName, gender, lastName, allowSystemGlobalWeakPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPasswordTokenValidateResponse {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    allowSystemGlobalWeakPassword: ").append(toIndentedString(allowSystemGlobalWeakPassword)).append("\n");
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

