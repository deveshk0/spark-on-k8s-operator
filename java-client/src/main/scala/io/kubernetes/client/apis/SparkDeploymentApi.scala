package io.kubernetes.client.apis

import java.util

import com.google.gson.reflect.TypeToken
import com.squareup.okhttp.Call
import io.kubernetes.client._
import io.kubernetes.client.models.{AppsV1beta1Deployment, V1DeleteOptions, V1Status}

/*
 * @author Devesh Kumar
 */
class SparkDeploymentApi(apiClient : ApiClient) extends AppsV1beta1Api(apiClient){


  def createNamespacedSparkDeployment(namespace: String, body: Object, pretty: String) = {
    val resp = createNamespacedSparkDeploymentWithHttpInfo(namespace, body, pretty)
    resp.getData
  }

  def createNamespacedSparkDeploymentWithHttpInfo(namespace: String, body: Object, pretty: String): ApiResponse[Object] = {
    val call = createNamespacedSparkDeploymentValidateBeforeCall(namespace, body, pretty, null, null)
    val localVarReturnType = new TypeToken[Object]() {}.getType
    apiClient.execute(call, localVarReturnType)
  }

  private def createNamespacedSparkDeploymentValidateBeforeCall(namespace: String, body: Object, pretty: String, progressListener: ProgressResponseBody.ProgressListener, progressRequestListener: ProgressRequestBody.ProgressRequestListener) = { // verify the required parameter 'namespace' is set
    if (namespace == null)
      throw new ApiException("Missing the required parameter 'namespace' when calling createNamespacedDeployment(Async)")
    // verify the required parameter 'body' is set
    if (body == null)
      throw new ApiException("Missing the required parameter 'body' when calling createNamespacedDeployment(Async)")
    val call = createNamespacedSparkDeploymentCall(namespace, body, pretty, progressListener, progressRequestListener)
    call
  }

  def createNamespacedSparkDeploymentCall(namespace: String, body: Object, pretty: String, progressListener: ProgressResponseBody.ProgressListener, progressRequestListener: ProgressRequestBody.ProgressRequestListener): Call = {
    val localVarPostBody: Any = body
    // create path and map variables
    val localVarPath: String = "/apis/sparkoperator.k8s.io/v1alpha1/namespaces/{namespace}/sparkapplications".replaceAll("\\{" + "namespace" + "\\}", apiClient.escapeString(namespace.toString))
    val localVarQueryParams: util.List[Pair] = new util.ArrayList[Pair]
    val localVarCollectionQueryParams: util.List[Pair] = new util.ArrayList[Pair]
    if (pretty != null) localVarQueryParams.addAll(apiClient.parameterToPair("pretty", pretty))
    val localVarHeaderParams: util.Map[String, String] = new util.HashMap[String, String]
    val localVarFormParams: util.Map[String, AnyRef] = new util.HashMap[String, AnyRef]
    val localVarAccepts: Array[String] = Array("application/json", "application/yaml", "application/vnd.kubernetes.protobuf")
    val localVarAccept: String = apiClient.selectHeaderAccept(localVarAccepts)
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept)
    val localVarContentTypes: Array[String] = Array("*/*")
    val localVarContentType: String = apiClient.selectHeaderContentType(localVarContentTypes)
    localVarHeaderParams.put("Content-Type", localVarContentType)
    val localVarAuthNames: Array[String] = Array[String]("BearerToken")
    apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener)
  }

  def deleteNamespacedSparkDeployment(name: String, namespace: String, body: V1DeleteOptions, pretty: String, gracePeriodSeconds: Integer, orphanDependents: Boolean, propagationPolicy: String): V1Status = {
    val resp = deleteNamespacedSparkDeploymentWithHttpInfo(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)
    resp.getData
  }

  def deleteNamespacedSparkDeploymentWithHttpInfo(name: String, namespace: String, body: V1DeleteOptions, pretty: String, gracePeriodSeconds: Integer, orphanDependents: Boolean, propagationPolicy: String): ApiResponse[V1Status] = {
    val call = deleteNamespacedSparkDeploymentValidateBeforeCall(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy, null, null)
    val localVarReturnType = new TypeToken[V1Status]() {}.getType
    apiClient.execute(call, localVarReturnType)
  }


  private def deleteNamespacedSparkDeploymentValidateBeforeCall(name: String, namespace: String, body: V1DeleteOptions, pretty: String, gracePeriodSeconds: Integer, orphanDependents: Boolean, propagationPolicy: String, progressListener: ProgressResponseBody.ProgressListener, progressRequestListener: ProgressRequestBody.ProgressRequestListener) = { // verify the required parameter 'name' is set
    if (name == null) throw new ApiException("Missing the required parameter 'name' when calling deleteNamespacedDeployment(Async)")
    // verify the required parameter 'namespace' is set
    if (namespace == null) throw new ApiException("Missing the required parameter 'namespace' when calling deleteNamespacedDeployment(Async)")
    // verify the required parameter 'body' is set
    if (body == null) throw new ApiException("Missing the required parameter 'body' when calling deleteNamespacedDeployment(Async)")
    val call = deleteNamespacedDeploymentCall(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy, progressListener, progressRequestListener)
    call
  }

  def deleteNamespacedDeploymentCall(name: String, namespace: String, body: V1DeleteOptions, pretty: String, gracePeriodSeconds: Integer, orphanDependents: Boolean, propagationPolicy: String, progressListener: ProgressResponseBody.ProgressListener, progressRequestListener: ProgressRequestBody.ProgressRequestListener): Call = {
    val localVarPostBody = body
    // create path and map variables
    val localVarPath = "/apis/sparkoperator.k8s.io/v1alpha1/namespaces/{namespace}/sparkapplications/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString))
      .replaceAll("\\{" + "namespace" + "\\}", apiClient.escapeString(namespace.toString()));
    val localVarQueryParams = new util.ArrayList[Pair]
    val localVarCollectionQueryParams = new util.ArrayList[Pair]
    if (pretty != null) localVarQueryParams.addAll(apiClient.parameterToPair("pretty", pretty))
    if (gracePeriodSeconds != null) localVarQueryParams.addAll(apiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds))
    localVarQueryParams.addAll(apiClient.parameterToPair("orphanDependents", orphanDependents))
    if (propagationPolicy != null) localVarQueryParams.addAll(apiClient.parameterToPair("propagationPolicy", propagationPolicy))
    val localVarHeaderParams = new util.HashMap[String, String]
    val localVarFormParams = new util.HashMap[String, AnyRef]
    val localVarAccepts = Array("application/json", "application/yaml", "application/vnd.kubernetes.protobuf")
    val localVarAccept = apiClient.selectHeaderAccept(localVarAccepts)
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept)
    val localVarContentTypes = Array("*/*")
    val localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes)
    localVarHeaderParams.put("Content-Type", localVarContentType)
    val localVarAuthNames = Array[String]("BearerToken")
    apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener)
  }
}
