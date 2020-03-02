package io.nomizo.model;


import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;

@Entity
@Table(name = "responses")
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String message;
    private boolean success;

    public Response() { super(); }

    public Response(long id, String message, boolean success) {
        this.id = id;
        this.message = message;
        this.success = success;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }

    @Override
    public String toString() { return ToStringBuilder.reflectionToString(this); }
}
