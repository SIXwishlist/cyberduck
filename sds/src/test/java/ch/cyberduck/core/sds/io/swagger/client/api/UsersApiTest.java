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


package ch.cyberduck.core.sds.io.swagger.client.api;

import ch.cyberduck.core.sds.io.swagger.client.ApiException;
import ch.cyberduck.core.sds.io.swagger.client.model.CreateUserRequest;
import ch.cyberduck.core.sds.io.swagger.client.model.RoleList;
import ch.cyberduck.core.sds.io.swagger.client.model.RoomTreeDataList;
import ch.cyberduck.core.sds.io.swagger.client.model.UpdateUserRequest;
import ch.cyberduck.core.sds.io.swagger.client.model.UserAttributes;
import ch.cyberduck.core.sds.io.swagger.client.model.UserData;
import ch.cyberduck.core.sds.io.swagger.client.model.UserGroupList;
import ch.cyberduck.core.sds.io.swagger.client.model.UserList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * Create user
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Create a new user.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Users Change\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; A new user is created.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;If a user should not expire, leave expireAt empty.&lt;/li&gt;&lt;li&gt;All input fields are limited to &lt;b&gt;150&lt;/b&gt; characters&lt;/b&gt;&lt;/li&gt;&lt;li&gt;Allowed characters: &lt;b&gt;All&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Authentication method parameters&lt;/h4&gt;&lt;dl&gt;&lt;dt&gt;SQL&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;\&quot;login\&quot;: E-Mail Address&lt;/code&gt;&lt;br/&gt;&lt;code&gt;no additional parameters&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;Active Directory Username &lt;/dt&gt;&lt;dd&gt;&lt;code&gt;&lt;br/&gt;key : \&quot;username\&quot;&lt;br/&gt;value: \&quot;Active Directory Username according to auth setting &#39;user_filter&#39;\&quot;&lt;br/&gt;additional parameters (optional):&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;RADIUS  &lt;/dt&gt;&lt;dd&gt;&lt;code&gt;&lt;br/&gt;key : \&quot;username\&quot;&lt;br/&gt;value: \&quot;Radius user name\&quot;&lt;br/&gt;no additional parameters&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        String xSdsAuthToken = null;
        CreateUserRequest body = null;
        String xSdsDateFormat = null;
        UserData response = api.createUser(xSdsAuthToken, body, xSdsDateFormat);

        // TODO: test validations
    }
    
    /**
     * Delete user
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Delete a user.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Users Delete\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; User is deleted.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; User cannot be deleted if he is the last room admin.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String xSdsAuthToken = null;
        Long userId = null;
        api.deleteUser(xSdsAuthToken, userId);

        // TODO: test validations
    }
    
    /**
     * Delete custom user attribute
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Delete custom user attribute.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Users Change\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Custom user attribute gets deleted.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Allowed characters for keys are: [a-zA-Z0-9_-]. Characters are case-insensitive.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserAttributesTest() throws ApiException {
        String xSdsAuthToken = null;
        Long userId = null;
        String key = null;
        api.deleteUserAttributes(xSdsAuthToken, userId, key);

        // TODO: test validations
    }
    
    /**
     * Get user
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve detailed information about one user.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Users Read\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Authentication method parameters&lt;/h4&gt;&lt;dl&gt;&lt;dt&gt;SQL&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;\&quot;login\&quot;: E-Mail Address&lt;/code&gt;&lt;br/&gt;&lt;code&gt;no additional parameters&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;Active Directory Username &lt;/dt&gt;&lt;dd&gt;&lt;code&gt;&lt;br/&gt;key : \&quot;username\&quot;&lt;br/&gt;value: \&quot;Active Directory Username according to auth setting &#39;user_filter&#39;\&quot;&lt;br/&gt;additional parameters (optional):&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;RADIUS  &lt;/dt&gt;&lt;dd&gt;&lt;code&gt;&lt;br/&gt;key : \&quot;username\&quot;&lt;br/&gt;value: \&quot;Radius user name\&quot;&lt;br/&gt;no additional parameters&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String xSdsAuthToken = null;
        Long userId = null;
        String xSdsDateFormat = null;
        Boolean effectiveRoles = null;
        UserData response = api.getUser(xSdsAuthToken, userId, xSdsDateFormat, effectiveRoles);

        // TODO: test validations
    }
    
    /**
     * Get groups that user is a member of or/and can become a member
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieves a List of groups a user is member of and/or can become a member.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Users Read\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;h5&gt;Filter fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Group name&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;isMember&lt;/dt&gt;&lt;dd&gt;Filter the groups which the user is or is not member of&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true|false|any]. Default value is &lt;code&gt;true&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;Example: &lt;samp&gt;is_member:eq:false|name:cn:searchstring&lt;/samp&gt;&lt;br/&gt;- get all groups that the user is not member of and whose name is like searchstring&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserGroupsTest() throws ApiException {
        String xSdsAuthToken = null;
        Long userId = null;
        Integer offset = null;
        Integer limit = null;
        String filter = null;
        UserGroupList response = api.getUserGroups(xSdsAuthToken, userId, offset, limit, filter);

        // TODO: test validations
    }
    
    /**
     * Get user roles
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve a list of all Roles and the role assignment rights of a user.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Users Read\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserRolesTest() throws ApiException {
        String xSdsAuthToken = null;
        Long userId = null;
        RoleList response = api.getUserRoles(xSdsAuthToken, userId);

        // TODO: test validations
    }
    
    /**
     * Get users
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Get users entry point. Returns a list of datapsace users.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Users Read\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt;&lt;br/&gt;Authentication with &lt;b&gt;X-Sds-Auth-Token&lt;/b&gt; required.&lt;/p&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;p&gt;Filter string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;OPERATOR&amp;gt;:&amp;lt;VALUE&amp;gt;&lt;/dfn&gt;&lt;br/&gt;Multiple fields are supported.&lt;/p&gt;&lt;h5&gt;Filter fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;login&lt;/dt&gt;&lt;dd&gt;Login name&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (User login name contains value)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;firstName&lt;/dt&gt;&lt;dd&gt;First name&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (User first name contains value)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;lastName&lt;/dt&gt;&lt;dd&gt;Last name&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (User last name contains value)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;lockStatus&lt;/dt&gt;&lt;dd&gt;Lock status: 0 - Locked, 1 - Web access allowed, 2 - Web and mobile access allowed,&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (User lock status)&lt;br/&gt;VALUE: [0|1|2].&lt;/dd&gt;&lt;dt&gt;effectiveRoles&lt;/dt&gt;&lt;dd&gt;Filter users with roles, effective roles or direct roles (NO GROUPS)&lt;br/&gt;FALSE: Direct roles TRUE: effective roles&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true|false]. Default value is &lt;code&gt;false&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;&lt;b&gt;Logical grouping:&lt;/b&gt; filtering according first three fields (login, lastName, firstName)&lt;br&gt;is intrinsically processed by the API as logical &lt;i&gt;OR&lt;/i&gt;.  In opposite, filtering according to&lt;br/&gt;last three field (lockStatus)&lt;br/&gt;is processed intrinsically as logical &lt;i&gt;AND&lt;/i&gt;.&lt;/p&gt;&lt;p&gt;Example: &lt;samp&gt;login:cn:searchString_1|firstName:cn:searchString_2|lockStatus:eq:2 &lt;/samp&gt;&lt;br/&gt;- filter by login contains searchString_1 or firstName contains searchString_2 and user are not locked&lt;/p&gt;&lt;h4&gt;Sort&lt;/h4&gt;&lt;p&gt;Sort string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;ORDER&amp;gt;&lt;/dfn&gt;&lt;br/&gt;Order can be &lt;code&gt;asc&lt;/code&gt; or &lt;code&gt;desc&lt;/code&gt;&lt;br/&gt;Multiple fields are supported.&lt;/p&gt;&lt;h5&gt;Sort fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;expireAt&lt;/dt&gt;&lt;dd&gt;Expiration date&lt;/dd&gt;&lt;dt&gt;lastLoginSuccessAt&lt;/dt&gt;&lt;dd&gt;Last successful logon date&lt;/dd&gt;&lt;dt&gt;login&lt;/dt&gt;&lt;dd&gt;Login name&lt;/dd&gt;&lt;dt&gt;firstName&lt;/dt&gt;&lt;dd&gt;First name&lt;/dd&gt;&lt;dt&gt;gender&lt;/dt&gt;&lt;dd&gt;Gender&lt;/dd&gt;&lt;dt&gt;lastName&lt;/dt&gt;&lt;dd&gt;Last name&lt;/dd&gt;&lt;dt&gt;lockStatus&lt;/dt&gt;&lt;dd&gt;User lock status&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;lastLoginSuccessAt:asc|firstName:desc&lt;/samp&gt;&lt;br/&gt;- sort by lastLoginSuccessAt ascending and by firstName descending&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        String xSdsAuthToken = null;
        String xSdsDateFormat = null;
        Integer offset = null;
        Integer limit = null;
        String filter = null;
        String sort = null;
        Boolean includeAttributes = null;
        UserList response = api.getUsers(xSdsAuthToken, xSdsDateFormat, offset, limit, filter, sort, includeAttributes);

        // TODO: test validations
    }
    
    /**
     * Get rooms granted to the user or/and rooms that can be granted
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieves a List of rooms granted to the user and/or that can be granted.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Users Read\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;h5&gt;Filter fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Room name&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;isGranted&lt;/dt&gt;&lt;dd&gt;Filter the rooms which the user is or is not granted&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true|false|any]. Default value are &lt;code&gt;true&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;isLastAdmin&lt;/dt&gt;&lt;dd&gt;Filter the rooms which the user is last Data Room administrator. Only with connect &lt;b&gt;isGranted:eq:true&lt;/b&gt; possible.&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true].&lt;/dd&gt;&lt;dt&gt;effectivePerm&lt;/dt&gt;&lt;dd&gt;Filter room/subroom room with permissions, effective permissions or direct effective permissions(NO GROUPS)&lt;br/&gt;FALSE: Direct permissions TRUE: Direct effective permissions. ANY: Effective permissions.&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true|false|any]. Default value is &lt;code&gt;false&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;Example: &lt;samp&gt;isGranted:eq:false|name:cn:searchstring&lt;/samp&gt;&lt;br/&gt;- get all rooms that the user is not granted and whose name is like searchstring&lt;br&gt;&lt;br&gt;Example: &lt;samp&gt;isGranted:eq:true|isLastAdmin:eq:true|name:cn:searchstring&lt;/samp&gt;&lt;br/&gt;- get all rooms that the user is granted and is last admin and whose name is like searchstring&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersRoomsTest() throws ApiException {
        String xSdsAuthToken = null;
        Long userId = null;
        String xSdsDateFormat = null;
        Integer offset = null;
        Integer limit = null;
        String filter = null;
        RoomTreeDataList response = api.getUsersRooms(xSdsAuthToken, userId, xSdsDateFormat, offset, limit, filter);

        // TODO: test validations
    }
    
    /**
     * Set custom user attributes
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Set custom user attributes.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Users Change\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Custom user attributes gets set.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Batch function. All existing user attributes will be deleted. Allowed characters for keys are: [a-zA-Z0-9_-]. Characters are case-insensitive.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setAllUserAttributesTest() throws ApiException {
        String xSdsAuthToken = null;
        Long userId = null;
        UserAttributes body = null;
        String xSdsDateFormat = null;
        UserData response = api.setAllUserAttributes(xSdsAuthToken, userId, body, xSdsDateFormat);

        // TODO: test validations
    }
    
    /**
     * Add or edit custom user attributes
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Set custom user attributes.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Users Change\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Custom user attributes get added or edited.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Batch function. If an entry exists before, it will be overwritten. Allowed characters for keys are: [a-zA-Z0-9_-]. Characters are case-insensitive.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setUserAttributesTest() throws ApiException {
        String xSdsAuthToken = null;
        Long userId = null;
        UserAttributes body = null;
        String xSdsDateFormat = null;
        UserData response = api.setUserAttributes(xSdsAuthToken, userId, body, xSdsDateFormat);

        // TODO: test validations
    }
    
    /**
     * Update user
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Update the meta data of a user&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Users Change\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Meta data of a user is updated.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;If a user should not expire, leave expireAt empty.&lt;/li&gt;&lt;li&gt;All input fields are limited to &lt;b&gt;150&lt;/b&gt; characters&lt;/b&gt;&lt;/li&gt;&lt;li&gt;Allowed characters: &lt;b&gt;All&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Authentication method parameters&lt;/h4&gt;&lt;dl&gt;&lt;dt&gt;SQL&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;\&quot;login\&quot;: E-Mail Address&lt;/code&gt;&lt;br/&gt;&lt;code&gt;no additional parameters&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;Active Directory Username &lt;/dt&gt;&lt;dd&gt;&lt;code&gt;&lt;br/&gt;key : \&quot;username\&quot;&lt;br/&gt;value: \&quot;Active Directory Username according to auth setting &#39;user_filter&#39;\&quot;&lt;br/&gt;additional parameters (optional):&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;RADIUS  &lt;/dt&gt;&lt;dd&gt;&lt;code&gt;&lt;br/&gt;key : \&quot;username\&quot;&lt;br/&gt;value: \&quot;Radius user name\&quot;&lt;br/&gt;no additional parameters&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String xSdsAuthToken = null;
        Long userId = null;
        UpdateUserRequest body = null;
        String xSdsDateFormat = null;
        UserData response = api.updateUser(xSdsAuthToken, userId, body, xSdsDateFormat);

        // TODO: test validations
    }
    
}
