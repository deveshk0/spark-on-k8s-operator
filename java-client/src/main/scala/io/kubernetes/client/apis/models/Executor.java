
package io.kubernetes.client.apis.models;

import com.fasterxml.jackson.annotation.*;
import io.kubernetes.client.models.V1VolumeMount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cores",
    "instances",
    "memory",
    "labels",
    "volumeMounts"
})
public class Executor {

    @JsonProperty("cores")
    private Integer cores;
    @JsonProperty("instances")
    private Integer instances;
    @JsonProperty("memory")
    private String memory;
    @JsonProperty("labels")
    private Map<String , String> labels;
    @JsonProperty("envVars")
    private Map<String , String> envVars;
    @JsonProperty("volumeMounts")
    private List<V1VolumeMount> volumeMounts = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("envVars")
    public Map<String, String> getEnvVars() {
        return envVars;
    }

    @JsonProperty("envVars")
    public void setEnvVars(Map<String, String> envVars) {
        this.envVars = envVars;
    }

    @JsonProperty("cores")
    public Integer getCores() {
        return cores;
    }

    @JsonProperty("cores")
    public void setCores(Integer cores) {
        this.cores = cores;
    }

    @JsonProperty("instances")
    public Integer getInstances() {
        return instances;
    }

    @JsonProperty("instances")
    public void setInstances(Integer instances) {
        this.instances = instances;
    }

    @JsonProperty("memory")
    public String getMemory() {
        return memory;
    }

    @JsonProperty("memory")
    public void setMemory(String memory) {
        this.memory = memory;
    }

    @JsonProperty("labels")
    public Map<String, String> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(Map<String , String> labels) {
        this.labels = labels;
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
