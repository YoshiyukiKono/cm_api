// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.cloudera.api.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Arguments used for the collectDiagnosticData command.
 */
@XmlRootElement(name = "collectDiagnosticDataArgs")
public class ApiCollectDiagnosticDataArguments {

  private long bundleSizeBytes;
  private String startTime;
  private String endTime;
  private boolean includeInfoLog;
  private String ticketNumber;
  private String comments;
  private String clusterName;

  /**
   * The maximum approximate bundle size of the output file
   */
  public long getBundleSizeBytes() {
    return bundleSizeBytes;
  }

  public void setBundleSize(long bundleSizeByte) {
    this.bundleSizeBytes = bundleSizeByte;
  }
  
  /**
   * This parameter is ignored as of CM 4.5. 
   * Use endTime and bundleSize instead.
   * The start time (in ISO 8601 format)
   * of the period to collection statistics for.
   */
  @Deprecated
  public String getStartTime() {
    return startTime;
  }

  @Deprecated
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * The end time (in ISO 8601 format)
   * of the period to collection statistics for.
   */
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  /**
   * This parameter is ignored as of CM 4.5. 
   * INFO logs are always collected.
   * Whether to include INFO level logs.
   * WARN, ERROR, and FATAL level logs are always included.
   */
  @Deprecated
  public boolean isIncludeInfoLog() {
    return includeInfoLog;
  }

  @Deprecated
  public void setIncludeInfoLog(boolean includeInfoLog) {
    this.includeInfoLog = includeInfoLog;
  }

  /** The support ticket number to attach to this data collection. */
  public String getTicketNumber() {
    return ticketNumber;
  }

  public void setTicketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
  }

  /** Comments to include with this data collection. */
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }
  
  /**
   * Name of the cluster to collect. If null, collects from all clusters.
   */
  public String getClusterName() { 
    return clusterName;
  }
  
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }
}
