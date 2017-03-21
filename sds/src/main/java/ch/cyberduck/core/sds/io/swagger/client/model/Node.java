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
import ch.cyberduck.core.sds.io.swagger.client.model.EncryptionInfo;
import ch.cyberduck.core.sds.io.swagger.client.model.Node;
import ch.cyberduck.core.sds.io.swagger.client.model.NodePermissions;
import ch.cyberduck.core.sds.io.swagger.client.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Node
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-21T19:15:03.115+01:00")
public class Node {
  @JsonProperty("id")
  private Long id = null;

  /**
   * Node Type
   */
  public enum TypeEnum {
    ROOM("room"),
    
    FOLDER("folder"),
    
    FILE("file");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("parentId")
  private Long parentId = null;

  @JsonProperty("parentPath")
  private String parentPath = null;

  @JsonProperty("createdAt")
  private Date createdAt = null;

  @JsonProperty("createdBy")
  private UserInfo createdBy = null;

  @JsonProperty("updatedAt")
  private Date updatedAt = null;

  @JsonProperty("updatedBy")
  private UserInfo updatedBy = null;

  @JsonProperty("expireAt")
  private Date expireAt = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("hash")
  private String hash = null;

  @JsonProperty("fileType")
  private String fileType = null;

  @JsonProperty("mediaType")
  private String mediaType = null;

  @JsonProperty("cntAdmins")
  private Integer cntAdmins = null;

  @JsonProperty("cntUsers")
  private Integer cntUsers = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("classification")
  private Integer classification = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("permissions")
  private NodePermissions permissions = null;

  @JsonProperty("isEncrypted")
  private Boolean isEncrypted = null;

  @JsonProperty("cntChildren")
  private Integer cntChildren = null;

  @JsonProperty("cntDeletedVersions")
  private Integer cntDeletedVersions = null;

  @JsonProperty("hasRecycleBin")
  private Boolean hasRecycleBin = null;

  @JsonProperty("recycleBinRetentionPeriod")
  private Integer recycleBinRetentionPeriod = null;

  @JsonProperty("quota")
  private Long quota = null;

  @JsonProperty("cntDownloadShares")
  private Integer cntDownloadShares = null;

  @JsonProperty("cntUploadShares")
  private Integer cntUploadShares = null;

  @JsonProperty("isFavorite")
  private Boolean isFavorite = null;

  @JsonProperty("inheritPermissions")
  private Boolean inheritPermissions = null;

  @JsonProperty("encryptionInfo")
  private EncryptionInfo encryptionInfo = null;

  @JsonProperty("branchVersion")
  private Long branchVersion = null;

  @JsonProperty("children")
  private List<Node> children = new ArrayList<Node>();

  public Node id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Node ID
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "Node ID")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Node type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Node Type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "Node Type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Node parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent Node ID
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "Parent Node ID")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public Node parentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

   /**
   * Parent Node path. '/' if node is a Root node (Room)
   * @return parentPath
  **/
  @ApiModelProperty(example = "null", value = "Parent Node path. '/' if node is a Root node (Room)")
  public String getParentPath() {
    return parentPath;
  }

  public void setParentPath(String parentPath) {
    this.parentPath = parentPath;
  }

  public Node createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date (2015-12-31T23:59:00)
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "Creation date (2015-12-31T23:59:00)")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Node createdBy(UserInfo createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Created by user info
   * @return createdBy
  **/
  @ApiModelProperty(example = "null", value = "Created by user info")
  public UserInfo getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UserInfo createdBy) {
    this.createdBy = createdBy;
  }

  public Node updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Modification date (2015-12-31T23:59:00)
   * @return updatedAt
  **/
  @ApiModelProperty(example = "null", value = "Modification date (2015-12-31T23:59:00)")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Node updatedBy(UserInfo updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Modified by user info
   * @return updatedBy
  **/
  @ApiModelProperty(example = "null", value = "Modified by user info")
  public UserInfo getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(UserInfo updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Node expireAt(Date expireAt) {
    this.expireAt = expireAt;
    return this;
  }

   /**
   * Expiration date (2015-12-31T23:59:00)
   * @return expireAt
  **/
  @ApiModelProperty(example = "null", value = "Expiration date (2015-12-31T23:59:00)")
  public Date getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(Date expireAt) {
    this.expireAt = expireAt;
  }

  public Node name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Node hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * MD5 hash of file
   * @return hash
  **/
  @ApiModelProperty(example = "null", value = "MD5 hash of file")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public Node fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * For files only: File type (extension)
   * @return fileType
  **/
  @ApiModelProperty(example = "null", value = "For files only: File type (extension)")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public Node mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * For files only: File media type.
   * @return mediaType
  **/
  @ApiModelProperty(example = "null", value = "For files only: File media type.")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public Node cntAdmins(Integer cntAdmins) {
    this.cntAdmins = cntAdmins;
    return this;
  }

   /**
   * For rooms only: Number of admins
   * @return cntAdmins
  **/
  @ApiModelProperty(example = "null", value = "For rooms only: Number of admins")
  public Integer getCntAdmins() {
    return cntAdmins;
  }

  public void setCntAdmins(Integer cntAdmins) {
    this.cntAdmins = cntAdmins;
  }

  public Node cntUsers(Integer cntUsers) {
    this.cntUsers = cntUsers;
    return this;
  }

   /**
   * For rooms only: Number of users
   * @return cntUsers
  **/
  @ApiModelProperty(example = "null", value = "For rooms only: Number of users")
  public Integer getCntUsers() {
    return cntUsers;
  }

  public void setCntUsers(Integer cntUsers) {
    this.cntUsers = cntUsers;
  }

  public Node size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Node size
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "Node size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Node classification(Integer classification) {
    this.classification = classification;
    return this;
  }

   /**
   * For files only: Classification ID, the string description will be provided with resources
   * @return classification
  **/
  @ApiModelProperty(example = "null", value = "For files only: Classification ID, the string description will be provided with resources")
  public Integer getClassification() {
    return classification;
  }

  public void setClassification(Integer classification) {
    this.classification = classification;
  }

  public Node notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * User notes
   * @return notes
  **/
  @ApiModelProperty(example = "null", value = "User notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Node permissions(NodePermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * User permissions: Aggregated user permissions (all group and directly granted permissions)
   * @return permissions
  **/
  @ApiModelProperty(example = "null", value = "User permissions: Aggregated user permissions (all group and directly granted permissions)")
  public NodePermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(NodePermissions permissions) {
    this.permissions = permissions;
  }

  public Node isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

   /**
   * For rooms: encryption state.
   * @return isEncrypted
  **/
  @ApiModelProperty(example = "null", value = "For rooms: encryption state.")
  public Boolean getIsEncrypted() {
    return isEncrypted;
  }

  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }

  public Node cntChildren(Integer cntChildren) {
    this.cntChildren = cntChildren;
    return this;
  }

   /**
   * For rooms/folders only: Number of direct children (no recursion)
   * @return cntChildren
  **/
  @ApiModelProperty(example = "null", value = "For rooms/folders only: Number of direct children (no recursion)")
  public Integer getCntChildren() {
    return cntChildren;
  }

  public void setCntChildren(Integer cntChildren) {
    this.cntChildren = cntChildren;
  }

  public Node cntDeletedVersions(Integer cntDeletedVersions) {
    this.cntDeletedVersions = cntDeletedVersions;
    return this;
  }

   /**
   * For files/folders only: Number of deleted versions of this file/folder
   * @return cntDeletedVersions
  **/
  @ApiModelProperty(example = "null", value = "For files/folders only: Number of deleted versions of this file/folder")
  public Integer getCntDeletedVersions() {
    return cntDeletedVersions;
  }

  public void setCntDeletedVersions(Integer cntDeletedVersions) {
    this.cntDeletedVersions = cntDeletedVersions;
  }

  public Node hasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
    return this;
  }

   /**
   * Is Recycle Bin active
   * @return hasRecycleBin
  **/
  @ApiModelProperty(example = "null", value = "Is Recycle Bin active")
  public Boolean getHasRecycleBin() {
    return hasRecycleBin;
  }

  public void setHasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
  }

  public Node recycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
    return this;
  }

   /**
   * Retention period for deleted nodes in days. Integer between 0 and 9999
   * @return recycleBinRetentionPeriod
  **/
  @ApiModelProperty(example = "null", value = "Retention period for deleted nodes in days. Integer between 0 and 9999")
  public Integer getRecycleBinRetentionPeriod() {
    return recycleBinRetentionPeriod;
  }

  public void setRecycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
  }

  public Node quota(Long quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Quota in Byte
   * @return quota
  **/
  @ApiModelProperty(example = "null", value = "Quota in Byte")
  public Long getQuota() {
    return quota;
  }

  public void setQuota(Long quota) {
    this.quota = quota;
  }

  public Node cntDownloadShares(Integer cntDownloadShares) {
    this.cntDownloadShares = cntDownloadShares;
    return this;
  }

   /**
   * Returns the number of download shares of this Node
   * @return cntDownloadShares
  **/
  @ApiModelProperty(example = "null", value = "Returns the number of download shares of this Node")
  public Integer getCntDownloadShares() {
    return cntDownloadShares;
  }

  public void setCntDownloadShares(Integer cntDownloadShares) {
    this.cntDownloadShares = cntDownloadShares;
  }

  public Node cntUploadShares(Integer cntUploadShares) {
    this.cntUploadShares = cntUploadShares;
    return this;
  }

   /**
   * Returns the number of upload shares of this Node
   * @return cntUploadShares
  **/
  @ApiModelProperty(example = "null", value = "Returns the number of upload shares of this Node")
  public Integer getCntUploadShares() {
    return cntUploadShares;
  }

  public void setCntUploadShares(Integer cntUploadShares) {
    this.cntUploadShares = cntUploadShares;
  }

  public Node isFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

   /**
   * Node is marked as favorite
   * @return isFavorite
  **/
  @ApiModelProperty(example = "null", value = "Node is marked as favorite")
  public Boolean getIsFavorite() {
    return isFavorite;
  }

  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }

  public Node inheritPermissions(Boolean inheritPermissions) {
    this.inheritPermissions = inheritPermissions;
    return this;
  }

   /**
   * Is inherit active. Only for Nodes with type 'room'
   * @return inheritPermissions
  **/
  @ApiModelProperty(example = "null", value = "Is inherit active. Only for Nodes with type 'room'")
  public Boolean getInheritPermissions() {
    return inheritPermissions;
  }

  public void setInheritPermissions(Boolean inheritPermissions) {
    this.inheritPermissions = inheritPermissions;
  }

  public Node encryptionInfo(EncryptionInfo encryptionInfo) {
    this.encryptionInfo = encryptionInfo;
    return this;
  }

   /**
   * encryption info
   * @return encryptionInfo
  **/
  @ApiModelProperty(example = "null", value = "encryption info")
  public EncryptionInfo getEncryptionInfo() {
    return encryptionInfo;
  }

  public void setEncryptionInfo(EncryptionInfo encryptionInfo) {
    this.encryptionInfo = encryptionInfo;
  }

  public Node branchVersion(Long branchVersion) {
    this.branchVersion = branchVersion;
    return this;
  }

   /**
   * version of last change in this node or a node further down the tree
   * @return branchVersion
  **/
  @ApiModelProperty(example = "null", value = "version of last change in this node or a node further down the tree")
  public Long getBranchVersion() {
    return branchVersion;
  }

  public void setBranchVersion(Long branchVersion) {
    this.branchVersion = branchVersion;
  }

  public Node children(List<Node> children) {
    this.children = children;
    return this;
  }

  public Node addChildrenItem(Node childrenItem) {
    this.children.add(childrenItem);
    return this;
  }

   /**
   * For rooms and folders: child nodes list (if requested)
   * @return children
  **/
  @ApiModelProperty(example = "null", value = "For rooms and folders: child nodes list (if requested)")
  public List<Node> getChildren() {
    return children;
  }

  public void setChildren(List<Node> children) {
    this.children = children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.id, node.id) &&
        Objects.equals(this.type, node.type) &&
        Objects.equals(this.parentId, node.parentId) &&
        Objects.equals(this.parentPath, node.parentPath) &&
        Objects.equals(this.createdAt, node.createdAt) &&
        Objects.equals(this.createdBy, node.createdBy) &&
        Objects.equals(this.updatedAt, node.updatedAt) &&
        Objects.equals(this.updatedBy, node.updatedBy) &&
        Objects.equals(this.expireAt, node.expireAt) &&
        Objects.equals(this.name, node.name) &&
        Objects.equals(this.hash, node.hash) &&
        Objects.equals(this.fileType, node.fileType) &&
        Objects.equals(this.mediaType, node.mediaType) &&
        Objects.equals(this.cntAdmins, node.cntAdmins) &&
        Objects.equals(this.cntUsers, node.cntUsers) &&
        Objects.equals(this.size, node.size) &&
        Objects.equals(this.classification, node.classification) &&
        Objects.equals(this.notes, node.notes) &&
        Objects.equals(this.permissions, node.permissions) &&
        Objects.equals(this.isEncrypted, node.isEncrypted) &&
        Objects.equals(this.cntChildren, node.cntChildren) &&
        Objects.equals(this.cntDeletedVersions, node.cntDeletedVersions) &&
        Objects.equals(this.hasRecycleBin, node.hasRecycleBin) &&
        Objects.equals(this.recycleBinRetentionPeriod, node.recycleBinRetentionPeriod) &&
        Objects.equals(this.quota, node.quota) &&
        Objects.equals(this.cntDownloadShares, node.cntDownloadShares) &&
        Objects.equals(this.cntUploadShares, node.cntUploadShares) &&
        Objects.equals(this.isFavorite, node.isFavorite) &&
        Objects.equals(this.inheritPermissions, node.inheritPermissions) &&
        Objects.equals(this.encryptionInfo, node.encryptionInfo) &&
        Objects.equals(this.branchVersion, node.branchVersion) &&
        Objects.equals(this.children, node.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, parentId, parentPath, createdAt, createdBy, updatedAt, updatedBy, expireAt, name, hash, fileType, mediaType, cntAdmins, cntUsers, size, classification, notes, permissions, isEncrypted, cntChildren, cntDeletedVersions, hasRecycleBin, recycleBinRetentionPeriod, quota, cntDownloadShares, cntUploadShares, isFavorite, inheritPermissions, encryptionInfo, branchVersion, children);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    cntAdmins: ").append(toIndentedString(cntAdmins)).append("\n");
    sb.append("    cntUsers: ").append(toIndentedString(cntUsers)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    cntChildren: ").append(toIndentedString(cntChildren)).append("\n");
    sb.append("    cntDeletedVersions: ").append(toIndentedString(cntDeletedVersions)).append("\n");
    sb.append("    hasRecycleBin: ").append(toIndentedString(hasRecycleBin)).append("\n");
    sb.append("    recycleBinRetentionPeriod: ").append(toIndentedString(recycleBinRetentionPeriod)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    cntDownloadShares: ").append(toIndentedString(cntDownloadShares)).append("\n");
    sb.append("    cntUploadShares: ").append(toIndentedString(cntUploadShares)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    inheritPermissions: ").append(toIndentedString(inheritPermissions)).append("\n");
    sb.append("    encryptionInfo: ").append(toIndentedString(encryptionInfo)).append("\n");
    sb.append("    branchVersion: ").append(toIndentedString(branchVersion)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

