
package io.kubernetes.client.apis.models;

import com.fasterxml.jackson.annotation.*;
import io.kubernetes.client.models.V1Volume;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "mode",
    "image",
    "mainClass",
    "mainApplicationFile",
    "volumes",
    "driver",
    "executor",
    "restartPolicy"
})
public class Spec {

    @JsonProperty("type")
    private String type;
    @JsonProperty("mode")
    private String mode;
    @JsonProperty("image")
    private String image;
    @JsonProperty("mainClass")
    private String mainClass;
    @JsonProperty("mainApplicationFile")
    private String mainApplicationFile;
    @JsonProperty("volumes")
    private List<V1Volume> volumes = null;
    @JsonProperty("driver")
    private Driver driver;
    @JsonProperty("executor")
    private Executor executor;
    @JsonProperty("restartPolicy")
    private String restartPolicy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("mode")
    public String getMode() {
        return mode;
    }

    @JsonProperty("mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("mainClass")
    public String getMainClass() {
        return mainClass;
    }

    @JsonProperty("mainClass")
    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    @JsonProperty("mainApplicationFile")
    public String getMainApplicationFile() {
        return mainApplicationFile;
    }

    @JsonProperty("mainApplicationFile")
    public void setMainApplicationFile(String mainApplicationFile) {
        this.mainApplicationFile = mainApplicationFile;
    }

    @JsonProperty("volumes")
    public List<V1Volume> getVolumes() {
        return volumes;
    }

    @JsonProperty("volumes")
    public void setVolumes(List<V1Volume> volumes) {
        this.volumes = volumes;
    }

    @JsonProperty("driver")
    public Driver getDriver() {
        return driver;
    }

    @JsonProperty("driver")
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @JsonProperty("executor")
    public Executor getExecutor() {
        return executor;
    }

    @JsonProperty("executor")
    public void setExecutor(Executor executor) {
        this.executor = executor;
    }

    @JsonProperty("restartPolicy")
    public String getRestartPolicy() {
        return restartPolicy;
    }

    @JsonProperty("restartPolicy")
    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
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
