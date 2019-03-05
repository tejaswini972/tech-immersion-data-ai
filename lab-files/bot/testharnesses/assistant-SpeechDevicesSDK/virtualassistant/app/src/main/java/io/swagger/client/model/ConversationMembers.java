/*
 * Microsoft Bot Connector API - v3.0
 * The Bot Connector REST API allows your bot to send and receive messages to channels configured in the  [Bot Framework Developer Portal](https://dev.botframework.com). The Connector service uses industry-standard REST  and JSON over HTTPS.    Client libraries for this REST API are available. See below for a list.    Many bots will use both the Bot Connector REST API and the associated [Bot State REST API](/en-us/restapi/state). The  Bot State REST API allows a bot to store and retrieve state associated with users and conversations.    Authentication for both the Bot Connector and Bot State REST APIs is accomplished with JWT Bearer tokens, and is  described in detail in the [Connector Authentication](/en-us/restapi/authentication) document.    # Client Libraries for the Bot Connector REST API    * [Bot Builder for C#](/en-us/csharp/builder/sdkreference/)  * [Bot Builder for Node.js](/en-us/node/builder/overview/)  * Generate your own from the [Connector API Swagger file](https://raw.githubusercontent.com/Microsoft/BotBuilder/master/CSharp/Library/Microsoft.Bot.Connector.Shared/Swagger/ConnectorAPI.json)    � 2016 Microsoft
 *
 * OpenAPI spec version: v3
 * Contact: botframework@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ChannelAccount;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Conversation and its members
 */
@ApiModel(description = "Conversation and its members")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-29T10:06:15.114-07:00")
public class ConversationMembers {
  @SerializedName("id")
  private String id = null;

  @SerializedName("members")
  private List<ChannelAccount> members = null;

  public ConversationMembers id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Conversation ID
   * @return id
  **/
  @ApiModelProperty(value = "Conversation ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConversationMembers members(List<ChannelAccount> members) {
    this.members = members;
    return this;
  }

  public ConversationMembers addMembersItem(ChannelAccount membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<ChannelAccount>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * List of members in this conversation
   * @return members
  **/
  @ApiModelProperty(value = "List of members in this conversation")
  public List<ChannelAccount> getMembers() {
    return members;
  }

  public void setMembers(List<ChannelAccount> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMembers conversationMembers = (ConversationMembers) o;
    return Objects.equals(this.id, conversationMembers.id) &&
        Objects.equals(this.members, conversationMembers.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMembers {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

