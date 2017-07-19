package com.jenuin.kotlin.example;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

@SerializedName("Message")
@Expose
private String message;
@SerializedName("Status")
@Expose
private String status;
@SerializedName("PostOffice")
@Expose
private List<PostOffice> postOffice = null;

public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public List<PostOffice> getPostOffice() {
return postOffice;
}

public void setPostOffice(List<PostOffice> postOffice) {
this.postOffice = postOffice;
}

}
