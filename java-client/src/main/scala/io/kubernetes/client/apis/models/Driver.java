
package io.kubernetes.client.apis.models;

import com.fasterxml.jackson.annotation.*;
import io.kubernetes.client.models.V1VolumeMount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cores",
    "coreLimit",
    "memory",
    "labels",
    "serviceAccount",
    "volumeMounts"
})
public class Driver {

    @JsonProperty("cores")
    private Double cores;
    @JsonProperty("coreLimit")
    private String coreLimit;
    @JsonProperty("memory")
    private String memory;
    @JsonProperty("labels")
    private Map<String , String> labels;
    @JsonProperty("serviceAccount")
    private String serviceAccount;
    @JsonProperty("envVars")
    private Map<String , String> envVars;
    @JsonProperty("volumeMounts")
    private List<V1VolumeMount> volumeMounts = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cores")
    public Double getCores() {
        return cores;
    }

    @JsonProperty("cores")
    public void setCores(Double cores) {
        this.cores = cores;
    }

    @JsonProperty("coreLimit")
    public String getCoreLimit() {
        return coreLimit;
    }

    @JsonProperty("coreLimit")
    public void setCoreLimit(String coreLimit) {
        this.coreLimit = coreLimit;
    }

    @JsonProperty("memory")
    public String getMemory() {
        return memory;
    }

    @JsonProperty("envVars")
    public Map<String, String> getEnvVars() {
        return envVars;
    }

    @JsonProperty("envVars")
    public void setEnvVars(Map<String, String> envVars) {
        this.envVars = envVars;
    }

    @JsonProperty("memory")
    public void setMemory(String memory) {

        this.memory = memory;
    }

    @JsonProperty("labels")
    public Map<String , String> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(Map<String , String> labels) {
        this.labels = labels;
    }

    @JsonProperty("serviceAccount")
    public String getServiceAccount() {
        return serviceAccount;
    }

    @JsonProperty("serviceAccount")
    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    @JsonProperty("volumeMounts")
    public List<V1VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    @JsonProperty("volumeMounts")
    public void setVolumeMounts(List<V1VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
